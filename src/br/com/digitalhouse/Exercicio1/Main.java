package br.com.digitalhouse.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Hora horaInicio = new Hora(19, 00, 00);
        Hora horaTermino = new Hora(22, 30, 00);

        //Professor
        Professor professoraJessica = new Professor("Jessica", 501);

        //Aulas
        ArrayList<Aula> arrayAulas = new ArrayList<>();
        Aula aula1 = new Aula(horaInicio, horaTermino);
        Aula aula2 = new Aula(horaInicio, horaTermino);
        Aula aula3 = new Aula(horaInicio, horaTermino);

        arrayAulas.add(aula1);
        arrayAulas.add(aula2);
        arrayAulas.add(aula3);

        //Aluno
        Aluno alunoAlexandre = new Aluno(horaInicio, horaTermino, 10001, "Alexandre", "Medeiros");

        //Alunos
        ArrayList<Aluno> arrayAlunos = new ArrayList<>();
        arrayAlunos.add(alunoAlexandre);

        Curso android = new Curso("Android", arrayAulas, arrayAlunos, professoraJessica, "Java");

        //Imprimir
        //Nome do Aluno
        //Curso do Aluno
        //-> Detalhes do curso:
        //----> Nome do Curso
        //----> Matérias
        //----> Professor
        //----> Horario das Aulas
        android.imprimirDadosCurso();


    }



}
