package br.com.digitalhouse.Exercicio3;

public class Estoque extends Produto{

    //Construtor
    public Estoque() {

    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        super(nome, qtdAtual, qtdMinima);
    }

    //Métodos
    public void mudarNome(String nome){
        this.nome = nome;
    }

    public void mudarQtdMinima(int qtdMinima){
        this.qtdMinima = qtdMinima;
    }

    public void repor(int qtd){
        qtdAtual = qtdAtual + qtd;
    }

    public void darBaixa(int qtd){
        qtdAtual = qtdAtual - qtd;
    }

    public String mostra(){

        return "Nome: " + nome +
                " Qtd. Minima: " + qtdMinima +
                " Qtd. Atual: " + qtdAtual;

    }

    public boolean precisaRepor(){

        if (qtdAtual <= qtdMinima) {
            return true;
        } else {
            return false;
        }
    }

}
