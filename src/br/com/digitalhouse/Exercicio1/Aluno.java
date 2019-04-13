package br.com.digitalhouse.Exercicio1;

public class Aluno extends Aula{

    //Atributos
    private int registroAcademico;
    private String nome;
    private String sobrenome;

    //Construtor
    public Aluno() {

    }

    public Aluno(Hora horarioInicio, Hora horarioTermino, int registroAcademico, String nome, String sobrenome) {
        super(horarioInicio, horarioTermino);

        this.registroAcademico = registroAcademico;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //Getter and Setter
    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //Metodos
    public void assistirAulas(){
        System.out.println("Assitiu a aula!");
    }

    public void fazerLicoesDeCasa(){
        System.out.println("Fez lição de casa!");
    }

}
