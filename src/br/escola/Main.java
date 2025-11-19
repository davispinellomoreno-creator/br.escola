package br.escola;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<aluno> alunos = new ArrayList<>();
        List<professor> teacher = new ArrayList<>();

        alunos.add(new aluno ("luan",17,"0001"));
        alunos.add(new aluno ("Pedro",15,"0300"));
        alunos.add(new aluno ("matheus",12,"0101"));
        alunos.add(new aluno ("luana",18,"0201"));
        alunos.add(new aluno ("Junior",17,"0401"));
        alunos.add(new aluno ("Kauan",20,"0321"));
        alunos.add(new aluno ("Vinicius",17,"0231"));

        teacher.add(new professor ("Joao",50,"geografia"));
        teacher.add(new professor ("Clarice",32,"biologia"));
        teacher.add(new professor ("Claudia ",45,"ingles"));
        teacher.add(new professor ("Clodoaldo",50,"portugues"));
        teacher.add(new professor ("Patricia",40,"matematica"));
        teacher.add(new professor ("Artur",30,"fisica"));
        teacher.add(new professor ("luiz",50," educação fisica "));

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("lista dos alunos da escola br");
        for(aluno a : alunos){
            System.out.println(a);

        }
        System.out.println("--------------------------------------------------------------------------");


        System.out.println("lista dos PROFESSORESSSSSSSSSSSSSSSSSSS da escola br");
        for(professor p : teacher){
            System.out.println(p);

        }


    }
}