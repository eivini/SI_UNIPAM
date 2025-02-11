public class Principal{

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Marcus", 27, 1234567890l, 1001);
        System.out.println(aluno1.toString());

        Professor professor1 = new Professor("Vinícius", 27, 1234567890l, 9009);
        System.out.println(professor1.toString());

    }
}