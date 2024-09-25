public class NoDuplo<T>{
    private T dado;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;

    public NoDuplo(T dado){
        this.dado = dado;
        this.proximoNo = null;
        this.anteriorNo = null;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    public void setProximoNo(NoDuplo<T> proximoNo){
        this.proximoNo = proximoNo;
    }
    
    public NoDuplo<T> getProximoNo(){
        return this.proximoNo;
    }

    public void setAnteriorNo(NoDuplo<T> anteriorNo){
        this.anteriorNo = anteriorNo;
    }

    public NoDuplo<T> getAnteriorNo(){
        return anteriorNo;
    }

    @Override
    public String toString(){
        return "{" + getDado() + "}";
    }
}