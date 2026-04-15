package com.apresentar.models;

public class Pessoa {
    // atributos
    private String nome;
    private String email;
    private int idade;

    // construtor
    public Pessoa(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return 
            "Nome=" + getNome() +
            "\nE-mail=" + getEmail() +
            "\nIdade=" + getIdade();
    }

}
