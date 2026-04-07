package com.atividade06.app;

import java.util.Scanner;

import com.atividade06.models.Carro;
import com.atividade06.models.Caminhao;
import com.atividade06.models.Moto;
import com.atividade06.models.Onibus;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String tipoVeiculo;

        System.out.println("Informe qual o tipo de veículo que deseja cadastrar:");
        System.out.println("A - Moto");
        System.out.println("B - Carro");
        System.out.println("C - Caminhão");
        System.out.println("D - Ônibus");
        tipoVeiculo = sc.nextLine();

        switch (tipoVeiculo) {
            case "A":
                Moto moto = new Moto(null, null, null, null, null, "A", null);
                // TODO: informar dados da moto
                break;
            // TODO: fazer os cases dos outros veículos
        }

        sc.close();
    }
}
// TODO: atividade 06
// A partir da superclasse abstrata Veiculo, crie as subclasses finais: 
// Moto, Carro, Onibus e Caminhao, todas no package models. Instancie cada 
// uma das subclasses na classe principal, e peça para o usuário informar 
// os seguintes atributos privados de um veículo escolhido pelo próprio 
// usuário: fabricante, modelo, cor, ano, placa. O  atributo privado 
// categoria deverá ser informado pelo próprio programa. 
// Diferenças entre as classes: carro terá bagageiro, onibus poderá ser 
// leito ou não, e caminhao terá carroceria.
// Ao final, o programa exibirá os dados do veículo escolhido por ele.
// NOTE: utilize herança, abstração e encapsulamento para codar.
// NOTE: divirtam-se 😎👌👍☕