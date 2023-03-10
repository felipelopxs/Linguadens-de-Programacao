package br.com.newton.main;

import br.com.newton.agenda.Contato;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Telefone {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome do contato: ");
        String contato = nome;
        JOptionPane.showMessageDialog(null,"O nome do contato é: " + nome);

        String numeroCont = JOptionPane.showInputDialog("Digite o numero do contato: ");
        String numero = numeroCont;
        JOptionPane.showMessageDialog(null,"O numero do contato é: " + numeroCont);

    }
}
