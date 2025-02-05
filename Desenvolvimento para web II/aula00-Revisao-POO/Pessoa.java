public class Pessoa {
    
    private String nome;
    private int idade;
    private long CPF;

    public Pessoa(){
        this("", 0, 0);
    }

    public Pessoa(String nome, int idade){
        this(nome, idade, 0);
    }

    public Pessoa(String nome, int idade, long CPF){
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setCPF(long CPF){
        this.CPF = CPF;
    }

    public long getCPF() {
        return this.CPF;
    }

    @Override
    public String toString(){
        return "Pessoa{Nome=" + this.getNome() + ", Idade=" + this.getIdade() + ", CPF=" + this.getCPF() + "}";
    }
}