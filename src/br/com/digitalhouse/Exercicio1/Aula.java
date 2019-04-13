package br.com.digitalhouse.Exercicio1;

public class Aula{

    //Atributos
    private Hora horarioInicio;
    private Hora horarioTermino;

    //Construtor
    public Aula() {

    }

    public Aula(Hora horarioInicio, Hora horarioTermino) {
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    //Getter and Setter
    public Hora getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Hora horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Hora getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(Hora horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

}
