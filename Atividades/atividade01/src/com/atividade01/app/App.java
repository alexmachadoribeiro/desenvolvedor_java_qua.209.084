package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner sc = new Scanner(System.in);

        // declaração as variáveis
        String nome;
        String result;
        double peso;
        double altura;
        double imc;

        // entrada de dados
        System.out.println("Informe seu nome:");
        nome = sc.nextLine();
        System.out.println("Informe seu peso em kg:");
        peso = sc.nextDouble();
        System.out.println("Informe sua altura em metros:");
        altura = sc.nextDouble();

        // cálculo do imc
        imc = peso/(altura*altura);

        // mostra o imc para o usuário
        System.out.println(nome + " seu IMC é " + String.format("%.2f", imc) + ".");

        // saída de dados (diagnóstico) pelo operador ternário
        result = (imc < 18.5) ? " está abaixo do peso." :
        (imc < 25) ? " está no peso ideal." :
        (imc < 30) ? " está acima do peso." :
        (imc < 35) ? " está obeso." :
        (imc < 40) ? " está com obesidade nível II" :
        " está com obesidade mórbida.";

        // saída de dados
        System.out.println(nome + result);

        // solução com if...else
        if (imc < 18.5) {
            System.out.println(nome + " está abaixo do peso.");
        }
        else if (imc < 25) {
            System.out.println(nome + " está no peso ideal.");
        }
        else if (imc < 30) {
            System.out.println(nome + " está acima do peso.");
        }
        else if (imc < 35) {
            System.out.println(nome + " está obeso.");
        }
        else if (imc < 40) {
            System.out.println(nome + " está com obesidade nível 2.");
        }
        else {
            System.out.println(nome + " está com obesidade mórbida.");
        }

        // fecha o objeto Scanner
        sc.close();
    }
}
