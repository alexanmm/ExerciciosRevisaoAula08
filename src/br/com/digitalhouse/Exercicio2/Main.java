package br.com.digitalhouse.Exercicio2;

public class Main {

    //Crie uma classe chamada Fatura que possa ser utilizado por uma loja de
    //suprimentos de informática para representar uma fatura de itens vendidos na loja.
    //Uma fatura deve incluir as seguintes informações como atributos:
    //● Uma lista de itens cada Item possui:
    //• o número do item faturado;
    //• a descrição do item;
    //• a quantidade comprada do item
    //• o preço unitário do item.
    //Sua classe Item deve conter um construtor que inicialize os quatro atributos. Se a
    //quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não
    //for positivo ele deve ser configurado como 0.0.
    //Forneça um método set e um método get para cada atributo.
    //Além disso, fornece na classe Fatura um método chamado getTotalFatura que calcula o
    //valor da fatura (isso é, multiplicar a quantidade pelo preço de cada item) e depois retorna
    //o valor como um double.
    //Escreva uma classe Main de teste que demonstra as capacidades da classe Fatura.
    //Obs: Use os conceitos de construtores com e sem parâmetros, get e set, classe abstrata,
    //interfaces aprendidas em sala de aula para a resolução dos
    //exercícios.

    public static void main(String[] args) {

        Fatura faturaAlexandre = new Fatura();
        Item itemSapato = new Item(1, "Sapato", 1.0d, 120.00d);
        Item itemRoupa = new Item(2, "Blusa", 2.0d, 30.0d);
        Item itemCalca = new Item(3, "Calca Jeans", 3.0d, 60.0d);
        Item itemPao = new Item(4, "Pao de Forma", 2.0d, 4.0d);

        faturaAlexandre.adicionarItemFatura(itemSapato);
        faturaAlexandre.adicionarItemFatura(itemRoupa);
        faturaAlexandre.adicionarItemFatura(itemCalca);
        faturaAlexandre.adicionarItemFatura(itemPao);

        System.out.println("Total da fatura: " + faturaAlexandre.getTotalFatura());



    }

}
