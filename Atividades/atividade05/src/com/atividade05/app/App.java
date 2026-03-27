package com.atividade05.app;

import java.util.Scanner;

import com.atividade05.models.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        double b = 0;
        double h = 0;
        double r = 0;
        double a = 0;
        String opcao;

        prof.nome = "Alex Machado";
        prof.matricula = "12345";

        System.out.println("Nome do professor: " + prof.nome);
        System.out.println("Matrícula do professor: " + prof.matricula);

        System.out.println("Informe o nome:");
        aluno.nome = sc.nextLine();
        System.out.println("Informe e e-mail:");
        aluno.email = sc.nextLine();
        System.out.println("Informe a idade:");
        aluno.idade = sc.nextInt();

        System.out.println("Nome do aluno: " + aluno.nome);
        System.out.println("E-mail do aluno: " + aluno.email);
        System.out.println("Idade do aluno: " + aluno.idade + " anos.");

        System.out.println("1 - Calcular a área do triângulo");
        System.out.println("2 - Calcular a área do círculo");
        System.out.println("3 - Calcular a equação do 1º grau");
        sc.nextLine();
        opcao = sc.nextLine();

        switch (opcao) {
            case "1":
                System.out.println("Informe o valor da base:");
                b = sc.nextDouble();
                System.out.println("Informe o valor da altura:");
                h = sc.nextDouble();
                System.out.println("Área do triângulo: " + prof.areaTriangulo(b, h));
                break;
            case "2":
                System.out.println("Informe o valor do raio:");
                r = sc.nextDouble();
                System.out.println("Área do círculo é " + prof.areaCirculo(r));
                break;
            case "3":
                System.out.println("Informe o valor de a:");
                a = sc.nextDouble();
                System.out.println("Informe o valor de b:");
                b = sc.nextDouble();
                System.out.println((a != 0) ? "A raiz da equação do 1º grau é " + prof.equacao1oGrau(a, b) : "Coeficiente a não pode ser 0.");
                break;
            default:
                System.out.println("Operação inválida.");
        }


        sc.close();
    }
}
// TODO: atividade 05
// Utilizando os conceitos básicos de orientação a objetos, crie um 
// programa que um aluno informa seus dados (nome, idade e email) e pede 
// para um professor (dados: nome e matrícula) calcular para ele as 
// seguintes fórmulas: área do triângulo, área do círculo e equação do 1º 
// grau, e exibe o resultado na tela.
// NOTE: crie as classes Aluno e Professor no package models, que fica 
// dentro de com.atividade05.