package br.com.digitalhouse.Exercicio2;

public class Item {

    //Atributos
    private int numeroItemFat;
    private String descricaoItem;
    private double quantCompradaItem;
    private double precoUnitarioItem;

    //Construtor
    public Item(int numeroItemFat, String descricaoItem, double quantCompradaItem, double precoUnitarioItem) {

        this.numeroItemFat = numeroItemFat;
        this.descricaoItem = descricaoItem;

        //Quantidade Comprada do Item
        if (quantCompradaItem < 0){
            //Se a quantidade não for positiva, ela deve ser configurada como 0
            this.quantCompradaItem = 0;
        } else{
            this.quantCompradaItem = quantCompradaItem;
        }

        //Preço Unitário do Item
        if (precoUnitarioItem < 0){
            //Se o preço por item não for positivo ele deve ser configurado como 0.0.
            this.precoUnitarioItem = 0;
        } else{
            this.precoUnitarioItem = precoUnitarioItem;
        }


    }


    //Getter and Setter
    public int getNumeroItemFat() {
        return numeroItemFat;
    }

    public void setNumeroItemFat(int numeroItemFat) {
        this.numeroItemFat = numeroItemFat;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public double getQuantCompradaItem() {
        return quantCompradaItem;
    }

    public void setQuantCompradaItem(double quantCompradaItem) {
        this.quantCompradaItem = quantCompradaItem;
    }

    public double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        this.precoUnitarioItem = precoUnitarioItem;
    }


    //Métodos

}
