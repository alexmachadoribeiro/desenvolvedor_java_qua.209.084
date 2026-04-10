package com.atividade07.models;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf, String email) {
        super(email);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
