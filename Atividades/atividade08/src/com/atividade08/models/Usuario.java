package com.atividade08.models;

import com.atividade08.repository.IUsuario;

public class Usuario implements IUsuario {
    // atributos
    private String nome;
    private int idade;

    // construtor
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // métodos da interface
    @Override
    public String verificarIdade() {
        return (this.idade >= 18) ? " é maior de idade." : " é menor de idade.";
    }

}
