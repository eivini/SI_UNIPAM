import Pilha.Pilha;
import Fila.Fila;
import ListaDupla.ListaDupla;

public class Principal{
    public static void main(String[] args){
        Pilha<Pessoa> pilha = new Pilha<Pessoa>();
        pilha.push(new Pessoa("Rafael",33));
        pilha.push(new Pessoa("Marcus",26));
        pilha.push(new Pessoa("Marcos",19));
        pilha.imprimePilha();
        System.out.println(pilha.pop());
        pilha.push(new Pessoa("Julia",22));
        pilha.push(new Pessoa("Pablo",21));
        pilha.imprimePilha();

        Fila<Pessoa> fila = new Fila<Pessoa>();
        fila.enfileirar(new Pessoa("Gabriel", 28));
        fila.enfileirar(new Pessoa("Marcus", 26));
        fila.enfileirar(new Pessoa("Marcos", 19));
        fila.imprimeFila();
        System.out.println(fila.desenfileirar());
        fila.enfileirar(new Pessoa("Julia", 22));
        fila.enfileirar(new Pessoa("Pablo", 21));
        fila.imprimeFila();

        ListaDupla<Pessoa> lista = new ListaDupla<Pessoa>();
        lista.addInicio(new Pessoa("Miguel", 35));
        lista.addFinal(new Pessoa("Marcus", 26));
        lista.addMeio(new Pessoa("Pablo", 21), 1);
        lista.imprimeLista();
        lista.removeInicio();
        lista.addInicio(new Pessoa("Julia", 22));
        lista.addFinal(new Pessoa("Marcos", 21));
        lista.imprimeLista();
    }
}