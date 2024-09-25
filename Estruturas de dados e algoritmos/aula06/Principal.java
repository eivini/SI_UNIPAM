public class Principal{
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        
        lista.imprimeLista();
        lista.addInicio("Marcus");
        lista.imprimeLista();
        lista.addInicio("Luciana");
        lista.imprimeLista();
        lista.addFinal("Julia");
        lista.imprimeLista();
        
    }
}