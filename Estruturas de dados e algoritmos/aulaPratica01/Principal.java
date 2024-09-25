import Pilha.Pilha;
import Fila.Fila;
import ListaDupla.ListaDupla;

public class Principal{
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>("Linguagem de programação");
        pilha.push("Python");
        pilha.push("PHP");
        pilha.push("Java");
        pilha.imprimePilha();
        System.out.println("Linguagem removida: " + pilha.peek());
        pilha.pop(); // Remove o primeiro dado da pilha
        pilha.imprimePilha();
        pilha.push("JavaScript");
        pilha.push("C#");
        pilha.imprimePilha();


        Fila<String> fila = new Fila<String>("Alunos");
        fila.enfileirar("Marcus");
        fila.enfileirar("Marcos");
        fila.enfileirar("Pablo");
        fila.imprimeFila();
        System.out.println("Aluno removido: " + fila.desenfileirar());
        fila.enfileirar("Julia");
        fila.enfileirar("Rafael");
        fila.imprimeFila();
 
        
        ListaDupla<Produto> lista = new ListaDupla<Produto>("Produto");
        lista.addInicio(new Produto("Notebook", 3000.00));
        lista.addFinal(new Produto("Monitor", 2500.00));
        lista.addMeio(new Produto("Iphone", 12500.00), 1);
        lista.imprimeLista();
        lista.removeMeio(1);
        lista.addInicio(new Produto("PC gamer", 15000.00));
        lista.addFinal(new Produto("Notebook", 3000.00));
        lista.imprimeLista();
    }
}