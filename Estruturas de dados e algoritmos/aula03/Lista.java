class Lista<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista(){
        this("Lista");
    }

    public Lista(String nomeLista){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.nomeLista = nomeLista;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setAux(primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
        if(ultimoNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            ultimoNo.setAux(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void imprimeDados(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        }else{
            System.out.printf("Dados da lista %s:\n",nomeLista);
            
            No<T> noImprime = primeiroNo;
            
            while(noImprime != null){
                System.out.printf("{%s}\n", noImprime.getDado());
                noImprime = noImprime.getAux();
            }
        }
    }

    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        }else{
            System.out.printf("Dado: {%s} foi removido da lista.", primeiroNo.getDado());
            primeiroNo = primeiroNo.getAux();
        }
    }

    public void removeFinal(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        }else{
            System.out.printf("Dado: {%s} foi removido da lista.", ultimoNo.getDado());
            
            No<T> noRemove = primeiroNo;

            while(noRemove.getAux() != ultimoNo){
                noRemove = noRemove.getAux();
            }
            ultimoNo = noRemove;
            noRemove.setAux(null);
        }
    }
}