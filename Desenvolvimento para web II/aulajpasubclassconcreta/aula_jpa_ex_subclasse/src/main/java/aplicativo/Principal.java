package aplicativo;

import dominio.Pessoa;
import dominio.Vendedor
import dominio.Cliente;;
import dominio.Cliente;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Principal {
    public static void main(String[] args) {
        // Instancia o EntityManagerFactory com as configurações de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa");
        // Intancia o EntityManager
        EntityManager em = emf.createEntityManager();
        Pessoa pessoa1 = new Pessoa("Lara", "XXX.XXX.XXX-XX");
        Pessoa pessoa2 = new Pessoa("Cecilia", "XXX.XXX.XXX-XX");
        Vendedor professor1 = new Vendedor("Rafael", "XXX.XXX.XXX-XX", 0001);
        Cliente aluno1 = new Cliente("Miguel", "XXX.XXX.XXX-XX", 0001);
        Vendedor professor2 = new Vendedor("Gabriel", "XXX.XXX.XXX-XX", 0001);
        Cliente aluno2 = new Cliente("Uriel", "XXX.XXX.XXX-XX", 0001);
        em.getTransaction().begin();// iniciar transação com banco de dados
        em.persist(pessoa1);
        em.persist(pessoa2);
        em.persist(professor1);
        em.persist(aluno1);
        em.persist(professor2);
        em.persist(aluno2);
        // consulta em jpql
        Query consultaPessoa = em.createQuery("select pessoa from Pessoa pessoa");
        ArrayList<Pessoa> listaPessoa = (ArrayList<Pessoa>) consultaPessoa.getResultList();
        // consulta em jpql
        Query consultaP = em.createQuery("select professor from Professor professor");
        ArrayList<Vendedor> listaP = (ArrayList<Vendedor>) consultaP.getResultList();
        // consulta em jpql
        Query consultaA = em.createQuery("select aluno from Aluno aluno");
        ArrayList<Cliente> listaA = (ArrayList<Cliente>) consultaA.getResultList();
        em.getTransaction().commit();// confirmar as alterações realizadas
        emf.close();
        em.close();
        for (Pessoa objPessoa : listaPessoa) {
            System.out.println(objPessoa);
        }
        for (Vendedor objP : listaP) {
            System.out.println(objP);
        }
        for (Cliente objA : listaA) {
            System.out.println(objA);
        }
    }
}
