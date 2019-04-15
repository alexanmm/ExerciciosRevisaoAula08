package br.com.digitalhouse.Exercicio3;

public class Main {

//Escreva uma classe em Java chamada Estoque. Ela deverá possuir:
//• os atributos nome (String), qtdAtual (int) e qtdMinima (int);
//• um construtor sem parâmetros e um outro contendo os parâmetros nome, qtdAtual e
//qtdMinima;
//• os métodos com as seguintes assinaturas:
//void mudarNome(String nome)
//void mudarQtdMinima(int qtdMinima) void repor(int qtd)
//void darBaixa(int qtd)
//String mostra()
//boolean precisaRepor()
//Os atributos qtdAtual e qtdMinima jamais poderão ser negativos.
//• O método repor aumenta qtdAtual de acordo com o parâmetro qtd;
//• O método darBaixa diminui qtdAtual de acordo com o parâmetro qtd;
//• O método mostra() retorna uma String contendo o nome do produto, sua
//quantidade mínima, sua quantidade atual;
//• O método precisaRepor retorna true caso a quantidade atual esteja menor ou igual
//à quantidade mínima e false, caso contrário.
//Obs: Use os conceitos de construtores com e sem parâmetros, get e set, classe
//abstrata,
//interfaces aprendidas em sala de aula para a resolução dos
//exercícios.

    public static void main(String[] args) {

        Estoque estoqueLampada = new Estoque("Lampada", 10, 1);

        System.out.println("Dados iniciais do produto:");
        System.out.println(estoqueLampada.mostra());

        //Alterar o nome do produto
        System.out.println("Alterar o nome do produto:");
        estoqueLampada.mudarNome("Lampada de Led");
        System.out.println(estoqueLampada.mostra());

        //Alterar a quantidade mínima
        System.out.println("Alterar a quantidade mínima:");
        estoqueLampada.mudarQtdMinima(5);
        System.out.println(estoqueLampada.mostra());

        //Baixar estoque
        System.out.println("Baixar estoque:");
        estoqueLampada.darBaixa(30);
        System.out.println(estoqueLampada.mostra());

        //Verifica se precisa repor o estoque
        if (estoqueLampada.precisaRepor()){

            //Repor o estoque
            System.out.println("Repor o estoque:");
            estoqueLampada.repor(50);
            System.out.println(estoqueLampada.mostra());
        }


    }

}
