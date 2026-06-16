package com.crud.javalanches.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import java.util.ArrayList;
import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.javalanches.models.Categoria;
import com.crud.javalanches.models.Endereco;
import com.crud.javalanches.models.Produto;
import com.crud.javalanches.models.Cliente;
import com.crud.javalanches.repository.CategoriaRepository;
import com.crud.javalanches.repository.ClienteRepository;
import com.crud.javalanches.repository.EnderecoRepository;
import com.crud.javalanches.repository.ProdutoRepository;

@Controller
public class JavalanchesController {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

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

    @GetMapping("/listarProdutos")
    public String listarProdutos(Model model) {
        model.addAttribute("categorias", categoriaRepository.findAll());
        return "listar_produtos";
    }

    @GetMapping("/listarClientes")
    public String listarClientes(Model model, @RequestParam(defaultValue = "0") int pagina) {
        Pageable pageable = PageRequest.of(pagina, 50, Sort.by("codigoCliente").ascending());
        Page<Cliente> clientes = clienteRepository.findAll(pageable);

        model.addAttribute("clientes", clientes);
        model.addAttribute("paginaAtual", pagina);
        return "listar_clientes";
    }

    @GetMapping("/novoCliente")
    public String novoCliente() {
        return "novo_cliente";
    }

    @PostMapping("/novoCliente")
    public String novoCliente(Cliente cliente, Endereco endereco) {
        cliente.getEnderecos().add(endereco);
        endereco.getClientes().add(cliente);

        enderecoRepository.save(endereco);
        clienteRepository.save(cliente);
        return "cliente_sucesso";
    }

    @GetMapping("/atualizarCliente")
    public String atualizarCliente(@RequestParam("codigoCliente") Long codigoCliente, Model model) {
        Cliente cliente = clienteRepository.findById(codigoCliente).orElse(null);
        if (cliente == null) {
            return "redirect:/listarClientes";
        }
        model.addAttribute("cliente", cliente);
        return "atualizar_cliente";
    }

    @PostMapping("/atualizarCliente")
    public String atualizarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
        return "atualizar_cliente_sucesso";
    }

    @GetMapping("/atualizarEndereco")
    public String atualizarEndereco(@RequestParam("codigoEndereco") Long codigoEndereco,
            @RequestParam("codigoCliente") Long codigoCliente, Model model) {
        Endereco endereco = enderecoRepository.findById(codigoEndereco).orElse(null);
        Cliente cliente = clienteRepository.findById(codigoCliente).orElse(null);

        if (endereco == null || cliente == null) {
            return "redirect:/listarClientes";
        }

        model.addAttribute("endereco", endereco);
        model.addAttribute("cliente", cliente);
        return "atualizar_endereco";
    }

    @PostMapping("/atualizarEndereco")
    public String atualizarEndereco(Endereco endereco) {
        enderecoRepository.save(endereco);
        return "atualizar_endereco_sucesso";
    }

    @GetMapping("/novoEndereco")
    public String novoEndereco(@RequestParam("codigoCliente") Long codigoCliente, Model model) {
        Cliente cliente = clienteRepository.findById(codigoCliente).orElse(null);

        if (cliente == null) {
            return "redirect:/listarClientes";
        }

        model.addAttribute("cliente", cliente);
        return "novo_endereco";
    }

    @PostMapping("/novoEndereco")
    public String novoEndereco(Endereco endereco, @RequestParam("codigoCliente") Long codigoCliente) {
        Cliente cliente = clienteRepository.findById(codigoCliente).orElse(null);

        if (cliente == null) {
            return "redirect:/listarClientes";
        }

        cliente.getEnderecos().add(endereco);
        endereco.getClientes().add(cliente);

        enderecoRepository.save(endereco);
        clienteRepository.save(cliente);
        return "endereco_sucesso";
    }

    @Transactional
    @GetMapping("/deletarEndereco")
    public String deletarEndereco(@RequestParam("codigoEndereco") Long codigoEndereco,
            @RequestParam("codigoCliente") Long codigoCliente) {
        Cliente cliente = clienteRepository.findById(codigoCliente).orElse(null);
        Endereco endereco = enderecoRepository.findById(codigoEndereco).orElse(null);

        if (cliente == null || endereco == null) {
            return "redirect:/listarClientes";
        }

        cliente.getEnderecos().remove(endereco);
        endereco.getClientes().remove(cliente);
        clienteRepository.save(cliente);

        if (endereco.getClientes().isEmpty()) {
            enderecoRepository.delete(endereco);
        } else {
            enderecoRepository.save(endereco);
        }

        return "redirect:/listarClientes";
    }

    @Transactional
    @GetMapping("/deletarCliente")
    public String deletarCliente(@RequestParam("codigoCliente") Long codigoCliente) {
        Cliente cliente = clienteRepository.findById(codigoCliente).orElse(null);
        if (cliente == null) {
            return "redirect:/listarClientes";
        }

        List<Endereco> enderecos = new ArrayList<>(cliente.getEnderecos());

        cliente.getEnderecos().clear();
        clienteRepository.save(cliente);
        clienteRepository.delete(cliente);

        for (Endereco endereco : enderecos) {
            endereco.getClientes().remove(cliente);
            if (endereco.getClientes().isEmpty()) {
                enderecoRepository.delete(endereco);
            } else {
                enderecoRepository.save(endereco);
            }
        }

        return "redirect:/listarClientes";
    }

    @GetMapping("/atualizarCategoria")
    public String atualizarCategoria(@RequestParam("codigoCategoria") Long codigoCategoria, Model model) {
        Categoria categoria = categoriaRepository.findById(codigoCategoria).orElse(null);
        model.addAttribute("categoria", categoria);
        return "atualizar_categoria";
    }
    
    @PostMapping("/atualizarCategoria")
    public String atualizarCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
        return "atualizar_categoria_sucesso";
    }

    @GetMapping("/atualizarProduto")
    public String atualizarProduto(@RequestParam("codigoProduto") Long codigoProduto, Model model) {
        Produto produto = produtoRepository.findById(codigoProduto).orElse(null);
        model.addAttribute("produto", produto);
        model.addAttribute("categorias", categoriaRepository.findAll());
        return "atualizar_produto";
    }

    @PostMapping("/atualizarProduto")
    public String atualizarProduto(Produto produto, @RequestParam("categoriaId") Long categoriaId) {
        Categoria categoria = categoriaRepository.findById(categoriaId).orElse(null);
        produto.setCategoria(categoria);
        produtoRepository.save(produto);
        return "atualizar_produto_sucesso";
    }

    @GetMapping("/deletarProduto")
    public String deletarProduto(@RequestParam("codigoProduto") Long codigoProduto) {
        produtoRepository.deleteById(codigoProduto);
        return "redirect:/listarProdutos";
    }

    @GetMapping("/deletarCategoria")
    public String deletarCategoria(@RequestParam("codigoCategoria") Long codigoCategoria) {
        Categoria categoria = categoriaRepository.findById(codigoCategoria).orElse(null);
        if (categoria != null) {
            produtoRepository.deleteAll(categoria.getProdutos());
            categoriaRepository.deleteById(codigoCategoria);
        }
        return "redirect:/listarProdutos";
    }
}
