package com.crud.javalanches.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.javalanches.models.Categoria;
import com.crud.javalanches.models.Produto;
import com.crud.javalanches.repository.CategoriaRepository;
import com.crud.javalanches.repository.ProdutoRepository;

@Controller
public class JavalanchesController {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/novaCategoria")
    public String novaCategoria() {
        return "nova_categoria";
    }

    @PostMapping("/novaCategoria")
    public String novaCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
        return "categoria_sucesso";
    }

    @GetMapping("/novoProduto")
    public String novoProduto(Model model) {
        model.addAttribute("categorias", categoriaRepository.findAll());
        return "novo_produto";
    }

    @PostMapping("/novoProduto")
    public String novoProduto(Produto produto, @RequestParam("categoriaId") Long categoriaId) {
        Categoria categoria = categoriaRepository.findById(categoriaId).orElse(null);
        produto.setCategoria(categoria);
        produtoRepository.save(produto);
        return "produto_sucesso";
    }
}
