package aplicativo;

import java.util.ArrayList;

import javax.management.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;
import dominio.Professor;
import dominio.Aluno;

public class Principal {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistence);
        EntityManager em = emf.createEntityManager();

        Pessoa pessoa1 = new Pessoa("Marcus", "XXX.XXX.XXX-XX");
        Pessoa pessoa2 = new Pessoa("Vinícius", "XXX.XXX.XXX-XX");

        Professor professor1 = new Professor("Rafael", "XXX.XXX.XXX-XX");
        Aluno aluno1 = new Aluno("Vini", "XXX.XXX.XXX-XX", 001);

        Professor professor2 = new Professor("Souza", "XXX.XXX.XXX-XX");
        Aluno aluno2 = new Aluno("Alves", "XXX.XXX.XXX-XX", 002);

        em.getTransaction().begin();
        em.persist(pessoa1);
        em.persist(pessoa2);

        em.persist(professor1);
        em.persist(aluno1);

        em.persist(professor2);
        em.persist(aluno2);

        Query consultaPessoa = em.createQuery("select pessoa from Pessoa pessoa");

        ArrayList<Pessoa> listaPessoa = (ArrayList) consultaPessoa.getResultList();

        Query consultaProfessor = em.createQuery("select pessoa from Professor pessoa");

        ArrayList<Professor> listaProfessor = (ArrayList<Professor>) consultaP.getResultList();

        Query consultaAluno = em.createQuery("select aluno from Aluno aluno"); 

        ArrayList<Aluno> listaA = (ArrayList<Aluno>) consultaA.getResultList();

        em.getTransaction().commit();

        emf.close();

        em.close();

        for(Pessoa objPessoa: listaPessoa) {
            System.out.println(objPessoa);
        }

        for(Professor objP: listaP) {
            System.out.println(objP);
        }

        for(Aluno objA: listaA) {
            System.out.println(objA);
        }

    }
}
