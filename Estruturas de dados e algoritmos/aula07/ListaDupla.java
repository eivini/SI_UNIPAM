public class ListaDupla<T>{
    private String nomeLista;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanho;

    public ListaDupla(){
        this("Lista duplamente encadeada");
    }

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, 0);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndices();
        tamanho++;
    }

    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, tamanho);
        if(ultimoNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
        tamanho++;
    }

    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Está lista está vazia!");
        }else{
            System.out.println("Dados: " + primeiroNo.getDado() + " removido da lista.");
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setAnteriorNo(null);
            }else{
                ultimoNo = primeiroNo;
            }
            atualizaIndices();
            tamanho--;
        }
    }

    public void removeFinal(){
        if(ultimoNo == null){
            System.out.println("Esta lista está vazia!");
        }else{
            System.out.println("Dados: " + ultimoNo + " removido da lista");
            ultimoNo = ultimoNo.getAnteriorNo();
            if(ultimoNo != null){
                ultimoNo.setProximoNo(null);
            }else{
                primeiroNo = ultimoNo;
            }
            tamanho--;
        }
    }

    private void atualizaIndices(){
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        while(atual != null){
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
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