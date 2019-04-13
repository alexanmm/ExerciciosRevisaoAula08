package br.com.digitalhouse.Exercicio1;

public class Professor implements Docente{

    //Atributos
    private String nome;
    private int registroDocente;

    //Construtor
    public Professor() {

    }

    public Professor(String nome, int registroDocente) {
        this.nome = nome;
        this.registroDocente = registroDocente;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistroDocente() {
        return registroDocente;
    }

    public void setRegistroDocente(int registroDocente) {
        this.registroDocente = registroDocente;
    }

    //Metodos
    @Override
    public void darAulas() {
        System.out.println("Ministrou a aula");
    }

    @Override
    public void fazerChamadaDosAlunos() {
        System.out.println("Fez chamada dos alunos");
    }
}
