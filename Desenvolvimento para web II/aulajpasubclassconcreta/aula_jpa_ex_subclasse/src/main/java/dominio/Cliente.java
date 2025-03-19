package dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity // entidade de domínio
public class Aluno extends Pessoa {
    private iCliente extends Pessoa {
	
	//private static final long serialVersionUID = 1L; //Id padrão do Serializable
	
	private int matriculaAluno;
	
	public Cliente() {
		this("","",0);
	}
	
	public Cliente
    public int getMatriculaAluno() {
        return this.matriculaAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    @Override
    public String toString() {
        return "Aluno [idPessoa= " + super.getIdPessoa() + ", nome= " + super.getNome() + ", matriculaAluno= " + getMatriculaAluno() + "]";
    }
}
