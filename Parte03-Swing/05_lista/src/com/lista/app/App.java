package com.lista.app;

import javax.swing.JOptionPane;

import com.lista.models.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora(0, 0);

        // declaração de arrays
        String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão", "Sair"};
        Object opcao;
        String opcaoSelecionada;

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Selecione uma opção:", 
                "Opções", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );

            if (!opcao.equals("Sair")) {
                calc.setX(Double.parseDouble(JOptionPane.showInputDialog("Informe um número:")));
                calc.setY(Double.parseDouble(JOptionPane.showInputDialog("Informe outro número:")));

                opcaoSelecionada = (String) opcao;

                switch (opcaoSelecionada) {
                    case "Soma":
                        JOptionPane.showMessageDialog(null, "Soma: " + calc.somar());
                        break;
                    case "Subtração":
                        JOptionPane.showMessageDialog(null, "Subtração: " + calc.subtrair());
                        break;
                    case "Multiplicação":
                        JOptionPane.showMessageDialog(null, "Multiplicação: " + calc.multiplicar());
                        break;
                    case "Divisão":
                        JOptionPane.showMessageDialog(null, "Divisão: " + calc.dividir());
                        break;
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
            }
        } while (opcao != "Sair");
    }
}
