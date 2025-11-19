package br.escola;

import java.sql.SQLOutput;

public class professor{
    private String materia;
    private String nome;
    private int idade;
    public professor(String nome,int idade,String materia){
   this.nome=nome;
   this.idade=idade;
   this.materia=materia;
 }



    public void setmateria(String materia) {
        this.materia=materia;
    }
    public void setnome(String nome){
       this.nome=nome;
    }
    public void setidade(int idade){
        this.idade=idade;
    }
   public String getmateria(){

       return materia;
   }
    public String getnome(){

        return nome;
    }
    public int getidade(){

        return idade;
    }

    {

    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

   public void imprimir(){
       System.out.println(this.nome);
   }

    @Override
    public String toString() {
        return "professor{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", materia=" + materia +
                '}';
    }
}







