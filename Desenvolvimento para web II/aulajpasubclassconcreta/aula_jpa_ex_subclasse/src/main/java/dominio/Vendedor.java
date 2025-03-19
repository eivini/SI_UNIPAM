package dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity // entidade de domínio
public class Professor extends Pessoa {
    private iVendedor extends Pessoa {
	
	//private static final long serialVersionUID = 1L; //Id padrão do Serializable
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int matriculaProfessor;
	
	public Vendedor() {
		this("","",0);
	}
	
	public Vendedor

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    @Override
    public String toString() {
        return "Professor [idPessoa= " + super.getIdPessoa() + ", nome= " + super.getNome() + ", matriculaProfessor= " + getMatriculaProfessor() + "]";
    }
}
