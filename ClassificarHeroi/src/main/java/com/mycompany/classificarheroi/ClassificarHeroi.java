package com.mycompany.classificarheroi;

import entities.Heroi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class ClassificarHeroi {

    public static void main(String[] args) {

        List<Heroi> herois = new ArrayList<>();
        String selectedItem = "";

        do {
            Object[] itens = {"Inserir Herói", "Exibir Heróis", "Sair"};
            selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

            switch (selectedItem) {

                case "Inserir Herói":

                    Heroi novoHeroi = new Heroi();
                    novoHeroi.setNome(JOptionPane.showInputDialog("Informe o nome do Herói"));
                    novoHeroi.setXp(Integer.parseInt(JOptionPane.showInputDialog("Digite a XP do herói:")));
                    herois.add(novoHeroi);

                    JOptionPane.showMessageDialog(null, "Herói criado com sucesso!");

                    break;

                case "Exibir Heróis":

                    String resultado = "";
                    for (Heroi heroi : herois) {
                        resultado += heroi.imprimir();
                    }

                    JOptionPane.showMessageDialog(null, resultado, "Heróis: ", JOptionPane.INFORMATION_MESSAGE);

                    break;
            }
        } while (!selectedItem.equals("Sair"));

    }
}
