package br.com.digitalhouse.Exercicio2;

import java.util.ArrayList;

public class Fatura {

    //Atributos
    private ArrayList<Item> listaItens = new ArrayList<>();

    //Construtor
    public Fatura() {

    }

    //Getter and Setter
    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }


    //Métodos

    //Além disso, fornece na classe Fatura um método chamado getTotalFatura que calcula o
    //valor da fatura (isso é, multiplicar a quantidade pelo preço de cada item) e depois retorna
    //o valor como um double.
    public double getTotalFatura(){

        double totalFatura = 0.0d;

        for (Item linha: listaItens){
            totalFatura = totalFatura + ( linha.getQuantCompradaItem() * linha.getPrecoUnitarioItem());
        }

        return totalFatura;
    }

    //Adicionar item a fatura
    public void adicionarItemFatura(Item item){
        listaItens.add(item);

        System.out.println(
                "Item adicionado: " + item.getNumeroItemFat() + " " + item.getDescricaoItem() +
                " Quantidade: " + item.getQuantCompradaItem() +
                " Valor Unitário: " + item.getPrecoUnitarioItem() +
                " Valor Total Item: " + item.getQuantCompradaItem() * item.getPrecoUnitarioItem());

    }

}
