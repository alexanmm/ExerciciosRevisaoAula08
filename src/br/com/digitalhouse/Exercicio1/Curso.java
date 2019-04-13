package br.com.digitalhouse.Exercicio1;

import java.util.ArrayList;

public class Curso {

    //Atributos
    private String nomeCurso;
    private ArrayList<Aula> arrayAulas = new ArrayList<>();
    private ArrayList<Aluno> arrayAlunos = new ArrayList<>();
    private Professor professor;
    private String nomeMateria;

    //Construtor
    public Curso() {

    }

    public Curso(String nome, ArrayList<Aula> arrayAulas, ArrayList<Aluno> arrayAlunos, Professor professor, String nomeMateria) {
        this.nomeCurso = nomeCurso;
        this.arrayAulas = arrayAulas;
        this.arrayAlunos = arrayAlunos;
        this.professor = professor;
        this.nomeMateria = nomeMateria;
    }

    //Getter and Setter
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public ArrayList<Aula> getArrayAulas() {
        return arrayAulas;
    }

    public void setArrayAulas(ArrayList<Aula> arrayAulas) {
        this.arrayAulas = arrayAulas;
    }

    public ArrayList<Aluno> getArrayAlunos() {
        return arrayAlunos;
    }

    public void setArrayAlunos(ArrayList<Aluno> arrayAlunos) {
        this.arrayAlunos = arrayAlunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    //Metodos
    public void imprimirDadosCurso(){


        for (int posicao = 0; posicao < arrayAlunos.size(); posicao++){

            //Nome do Aluno
            System.out.println(
                    "Nome do Aluno: " +
                    arrayAlunos.get(posicao).getNome() + " " +
                    arrayAlunos.get(posicao).getSobrenome());

            //Detalhes do curso do Aluno
            System.out.println("Curso do Aluno: " + nomeCurso);

            //Professor
            System.out.println("Professor: " + professor.getNome());

            //Materia
            System.out.println("Materia: " + nomeMateria);

            //Horario das Aulas
            for (int posicao_aulas = 0; posicao_aulas < arrayAulas.size(); posicao_aulas++){
                System.out.println(
                        "Horario das aulas: " +
                        arrayAulas.get(posicao_aulas).getHorarioInicio().getHora() + ":" +
                        arrayAulas.get(posicao_aulas).getHorarioInicio().getMinuto() + ":" +
                        arrayAulas.get(posicao_aulas).getHorarioInicio().getSegundo() + " a " +

                        arrayAulas.get(posicao_aulas).getHorarioTermino().getHora() + ":" +
                        arrayAulas.get(posicao_aulas).getHorarioTermino().getMinuto() + ":" +
                        arrayAulas.get(posicao_aulas).getHorarioTermino().getSegundo());

            }

        }




    }


}
