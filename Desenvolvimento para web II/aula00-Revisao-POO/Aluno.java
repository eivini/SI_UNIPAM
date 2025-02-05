public class Aluno extends Pessoa{

    private long matricula;

    public Aluno(){
        this("", 0, 0);
    }

    public Aluno(String nome, int idade){
        this(nome, idade, 0, 0);
    }

    public Aluno(String nome, int idade, long CPF, long matricula){
        super(nome, idade, CPF);
        this.matricula = matricula;
    }

    public void setMatricula(long matricula){
        this.matricula = matricula;
    }

    public getMatricula(){
        return this.matricula;
    }

}