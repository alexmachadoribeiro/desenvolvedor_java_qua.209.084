package com.classe.app;

public class Pessoa {
    // atributos
    public String nome;
    public String email;
    public int idade;
    public double altura;

    // método
    public void cumprimentar() {
        System.out.println("Olá, boa noite!");
    }

    public void apresentar() {
        System.out.print("Meu nome é " + this.nome);
        System.out.print(", meu e-mail é " + this.email);
        System.out.print(", tenho " + this.idade + " anos, e ");
        System.out.println(this.altura + " metros de altura.");
    }
}
