public class Principal{

    public static void main(String args[]){

        Aluno aluno1 = new Aluno("Marcus", 27, 12345678910l, 1001);
        System.out.println(aluno1.toString());

        Aluno aluno2 = new Aluno("Vinícius", 27, 12345678910l, 2001);
        System.out.println(aluno2.toString());

        Professor professor1 = new Professor("Alves", 40, 45612378910l, 2002);
        System.out.println(professor1.toString());

        Professor professor2 = new Professor("Souza", 45, 45612378910l, 3002);
        System.out.println(professor2.toString());

        Disciplina disciplina = new Disciplina("Web II", 80);
        System.out.println(disciplina.toString());

        disciplina.addAluno(aluno1);
        disciplina.addAluno(aluno2);

        disciplina.addProfessor(professor1);
        disciplina.addProfessor(professor2);

        System.out.println(disciplina.toString());
        
        Disciplina disciplina2 = new Disciplina("Topicos Integradores", 80);
        System.out.println(disciplina2.toString());

        disciplina2.addAluno(aluno1);
        disciplina2.addAluno(aluno2);

        disciplina2.addProfessor(professor1);
        disciplina2.addProfessor(professor2);

        System.out.println(disciplina2.toString());

        Curso curso = new Curso("Sistemas de Informação");
        curso.addDisciplina(disciplina);
        System.out.println(curso.toString());
    }
}