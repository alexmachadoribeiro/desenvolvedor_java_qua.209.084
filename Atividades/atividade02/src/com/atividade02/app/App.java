package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nome;
        String sala;
        String filme = null;
        int idade;
        int idadeMin = 0;

        System.out.println("Informe o nome:");
        nome = sc.nextLine();
        System.out.println("Informe a idade:");
        idade = sc.nextInt();

        sc.nextLine();

        do {
            // lista de filmes
            System.out.println("Escolha seu filme:");
            System.out.println("Sala 1 - A Roda Quadrada - Livre");
            System.out.println("Sala 2 - A Volta dos Que Não Foram - 12 anos");
            System.out.println("Sala 3 - Poeira em Alto Mar - 14 anos");
            System.out.println("Sala 4 - As Tranças do Rei Careca - 16 anos");
            System.out.println("Sala 5 - A Vingança do Peixe Frito - 18 anos");
            sala = sc.nextLine();

            switch (sala) {
                case "1":
                    filme = "A Roda Quadrada";
                    break;
                case "2":
                    filme = "A Volta dos Que Não Foram";
                    idadeMin = 12;
                    break;
                case "3":
                    filme = "Poeira em Alto Mar";
                    idadeMin = 14;
                    break;
                case "4":
                    filme = "As Tranças do Rei Careca";
                    idadeMin = 16;
                    break;
                case "5":
                    filme = "A Vingança do Peixe Frito";
                    idadeMin = 18;
                    break;
                default:
                    idadeMin = idade + 1;
            }

            if (idade >= idadeMin) {
                System.out.println("Ingresso comprado por " + nome + ".");
                System.out.println("Filme: " + filme + ".");
                System.out.println("Tenha um bom filme!!! =D");
            }
            else {
                System.out.println("Entrada não liberada para " + nome + ".");
                System.out.println("Favor escolher outro filme.");
            }
        } while(idade <= idadeMin);

        sc.close();
    }
}
