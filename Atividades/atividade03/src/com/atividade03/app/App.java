package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String operador;
        double x;
        double y;
        double result = 0;

        do {
            System.out.println("Escolha a opção:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            operador = sc.nextLine();

            if (!"5".equals(operador)) {
                System.out.println("Informe o valor do 1º número:");
                x = sc.nextDouble();
                System.out.println("Informe o valor do 2º número: ");
                y = sc.nextDouble();

                sc.nextLine();

                switch (operador) {
                    case "1":
                        result = x+y;
                        System.out.println("O valor da soma é " + result);
                        break;
                    case "2":
                        result = x-y;
                        System.out.println("O valor da subtração é " + result);
                        break;
                    case "3":
                        result = x*y;
                        System.out.println("O valor da multiplicação é " + result);
                        break;
                    case "4":
                        result = x/y;
                        System.out.println("O valor da divisão é " + result);
                        break;
                    default:
                        System.out.println("Operador inválido!");
                        break;
                }
            }
            else {
                System.out.println("Programa encerrado!");
            }

        } while(!"5".equals(operador));

    }
}

// TODO: atividade 03
// Recrie o programa da calculadora feito no dia 18/03/2026, 
// (switch...case) mas desta vez acrescentando a opção de encerrar 
// o programa quando o usuario quiser.