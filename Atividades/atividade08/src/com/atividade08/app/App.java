package com.atividade08.app;

import javax.swing.JOptionPane;

import com.atividade08.models.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        // instância do usuário
        Usuario usuario = new Usuario(null, 0);

        // entrada de dados
        usuario.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));

        // saída de dados
        JOptionPane.showMessageDialog(null, usuario.getNome() + usuario.verificarIdade());
    }
}
// TODO: atividade 08
// Crie um programa que recebe do usuário os valores dos atributos nome e 
// idade em JOptionPane, e o programa informa se o usuário é maior ou menor 
// de idade.