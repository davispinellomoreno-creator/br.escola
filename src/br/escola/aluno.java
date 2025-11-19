package br.escola;

public class aluno {
    private String nome;
    private int idade;
    private String matricula;

    public aluno( String nome,int idade,String matricula) {
        this.nome = nome;
        this.idade=idade;
        this.matricula=matricula;

    }

    public aluno(String nome, int idade) {
    }



    public String getnome (){
        return nome;
    }
    public int getidade (){
        return idade;
    }
    public String getmatricula (){
        return matricula;
    }
    public void setnome(String n){
        this.nome=nome;
    }
    public void setIdade(int id){
        this.idade=idade;
    }
    public void setmatricula(String mat){
       this.matricula=matricula;
    }

    @Override
    public String toString() {
        return "aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
