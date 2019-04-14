package br.com.digitalhouse.Exercicio1;

public class Aula{

    //Atributos
    private String nomeMateria;
    private Hora horarioInicio;
    private Hora horarioTermino;

    //Construtor
    public Aula(Hora horarioInicio, Hora horarioTermino) {

    }

    public Aula(String nomeMateria, Hora horarioInicio, Hora horarioTermino) {
        this.nomeMateria = nomeMateria;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    //Getter and Setter
    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

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
