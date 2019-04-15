package br.com.digitalhouse.Exercicio3;

public class Produto {

    //Atributos
    protected String nome;
    protected int qtdAtual;
    protected int qtdMinima;

    //Construtor
    public Produto(){

    }

    public Produto(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {

        if (qtdAtual < 0) {
            this.qtdAtual = 0;
        } else {
            this.qtdAtual = qtdAtual;
        }
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {

        if (qtdMinima < 0) {
            this.qtdMinima = 0;
        } else {
            this.qtdMinima = qtdMinima;
        }

    }

    //Métodos

}
