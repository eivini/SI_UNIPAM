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
        
        lista.addMeio("Pedro", 2);
        lista.imprimeLista();
    
        lista.removeMeio(2);
        lista.imprimeLista();

        lista.removeInicio();
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
        

    }
}