import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.LinkedList;
import java.util.List;

public class Principal{
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        listaPessoas.add(new Pessoa("Marcus", 26));
        listaPessoas.add(new Pessoa("Julia", 22));
        listaPessoas.add(new Pessoa("Marcos", 19));
        listaPessoas.add(new Pessoa("Pablo", 21));

        Iterator i = listaPessoas.iterator();
        while (i.hasNext()) {
            String pessoa = i.next().toString();
            System.out.println(pessoa);
        }

        System.out.println("*** " + listaPessoas.get(2) + " ***");
    }
}