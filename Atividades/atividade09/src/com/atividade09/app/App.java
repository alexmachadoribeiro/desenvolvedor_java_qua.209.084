package com.atividade09.app;

import javax.swing.JOptionPane;

import com.atividade09.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel tanque = new Combustivel(0, 0);

        String[] opcoes = {"Etanol", "Gasolina", "Calcular", "Sair"};
        Object opcao;
        String opcaoEscolhida;

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha uma opção:", 
                "Melhor combustível", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );

            opcaoEscolhida = (String) opcao;

            switch (opcaoEscolhida) {
                case "Etanol":
                    tanque.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanol:").replace(",", ".")));
                    break;
                case "Gasolina":
                    tanque.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina:").replace(",", ".")));
                    break;
                case "Calcular":
                    JOptionPane.showMessageDialog(null, tanque.melhorCombustivel());
                    break;
            }
        } while (opcao != "Sair");
    }
}
// TODO: atividade 09
// Faça um programa com JOptionPane que receba do usuário os valores dos 
// combustíveis etanol e gasolina, e exiba qual o melhor combustível para 
// abastecer. O programa deverá mostrar a opção de entrar com  o valor do 
// etanol, da gasolina, mostrar melhor combustível ou sair do programa.

// NOTE: para o etanol ser mais vantajoso, seu preço tem que ser até 70% do 
// valor da gasolina.