public class ListaDupla<T>{
    private String nomeLista;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    public ListaDupla(){
        this("Lista duplamente encadeada");
    }

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
    }

    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(ultimoNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        }else{
            System.out.printf("Dados da lista %s:\n", nomeLista);
            NoDuplo<T> aux = primeiroNo;
            while(aux != null){
                System.out.printf(" %s ", aux.toString());
                aux = aux.getProximoNo();
            }
            System.out.println();
        }
    }
}