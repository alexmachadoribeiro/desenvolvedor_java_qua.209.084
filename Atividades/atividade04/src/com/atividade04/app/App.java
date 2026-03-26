package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Veiculo carro = new Veiculo();

        // entrada de dados
        System.out.println("Informe o fabricante do veículo: ");
        carro.fabricante = sc.nextLine();
        System.out.println("Informe o modelo do veículo: ");
        carro.modelo = sc.nextLine();
        System.out.println("Informe a placa do veículo: ");
        carro.placa = sc.nextLine();
        System.out.println("Informe o ano do veículo: ");
        carro.ano = sc.nextLine();
        System.out.println("Informe a cor do veículo: ");
        carro.cor = sc.nextLine();

        // saída de dados
        System.out.println("Fabricante: " + carro.fabricante);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Placa: " + carro.placa);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Cor: " + carro.cor);

        sc.close();
    }
}
// TODO: atividade 04
// Desenvolva um programa que crie um objeto da classe Veiculo 
// (pode ser qualquer veiculo) com os atributos:
// - Fabricante
// - Modelo
// - Placa
// - Ano
// - Cor
// O programa deverá mostrar os dados do veículo 
// NOTE: veículo não mostra dados, portanto não pode ser via método
// NOTE: usuário deverá informar os dados do veículo