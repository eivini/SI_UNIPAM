import java.util.ArrayList;

public class Principal{
    public static void main(String[] args){
        Lista<String> lista = new Lista<String>("Alunos");

        lista.addInicio("Marcus");
        lista.imprimeDados();
        lista.addInicio("Julia");
        lista.imprimeDados();
        lista.addFinal("Luciana");
        lista.imprimeDados();
        lista.removeInicio();
        lista.imprimeDados();
        lista.removeFinal();
        lista.imprimeDados();
    }
}