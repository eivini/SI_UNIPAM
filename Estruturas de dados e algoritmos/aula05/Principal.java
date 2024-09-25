public class Principal{
    public static void main(String[] args){

        System.out.println("=== Testando fila ===");
        Fila<String> fila = new Fila<String>("Letras");
        fila.enfileirar("A");
        fila.imprimeFila();

        fila.enfileirar("B");
        fila.imprimeFila();

        fila.desenfileirar();
        fila.imprimeFila();

    }
}