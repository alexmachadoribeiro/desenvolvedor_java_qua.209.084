package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variável
        String nome;

        // entrada de dados
        nome = JOptionPane.showInputDialog("Informe seu nome:");

        // saída de dados
        JOptionPane.showMessageDialog(null, "Meu nome é: " + nome);
    }
}
