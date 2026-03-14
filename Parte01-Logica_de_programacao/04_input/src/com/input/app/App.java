package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome;
        String email;
        int idade;
        double altura;

        // cria objeto que recebe os dados do usuário
        Scanner sc = new Scanner(System.in);

        // entrada de dados
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Informe sua altura em metros: ");
        altura = sc.nextDouble();

        // limpeza de buffer
        sc.nextLine();

        System.out.println("Informe o seu e-mail: ");
        email = sc.nextLine();

        // saída de dados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("E-mail: " + email);

        // fecha objeto
        sc.close();
    }
}
