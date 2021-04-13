package teste;

import entidade.Publicacao_Importada;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Programa {

    public static void main(String[] args) {

        ArrayList publicacoes = new ArrayList();
        for (int i = 0; i < 2; i++) {

            Publicacao_Importada publicacao = new Publicacao_Importada();
            publicacao.setTitulo(JOptionPane.showInputDialog("Titulo"));
            publicacao.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código")));
            publicacao.setN_paginas(Integer.parseInt(JOptionPane.showInputDialog("Número de pagínas")));
            publicacao.setRegiaoOrigem(JOptionPane.showInputDialog("Região"));
            publicacao.calculaCusto();
            publicacao.calculaImposto();
        }
        
        
    }
}
