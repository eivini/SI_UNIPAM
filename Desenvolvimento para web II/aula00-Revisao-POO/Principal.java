public class Principal{

    public static void main(String[] args) {
        
        Pessoa objPessoa = new Pessoa();
        System.out.println(objPessoa.toString());
        
        Pessoa objPessoa2 = new Pessoa("Marcus", 27);
        System.out.println(objPessoa2.toString());

        Pessoa objPessoa3 = new Pessoa("Vinicius", 27, 10000000001L);
        System.out.println(objPessoa3.toString());

    }
}