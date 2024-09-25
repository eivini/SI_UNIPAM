public class Principal{
    public static void main(String[] args){
        //Imprimir dados dos objetos
        No<String> obj1 = new No<String>("Marcus");
        System.out.println(obj1.imprimeDados());

        No<String> obj2 = new No<String>("Julia");
        System.out.println(obj2.imprimeDados());

        No<String> obj3 = new No<String>("Luciana");
        System.out.println(obj3.imprimeDados());

        obj1.setAux(obj2);
        obj2.setAux(obj3);

        //imprimir os dados dos objetos da lista
        System.out.println(obj1.imprimeDados());
        System.out.println(obj1.getAux().imprimeDados());
        System.out.println(obj1.getAux().getAux().imprimeDados());

        //imprimir dados da lista usando o while()
        No<String> objAux = obj1;
        while(objAux != null){
            System.out.println(objAux.imprimeDados());
            objAux = objAux.getAux();
        }

        //No<Integer> obj2 = new No<Integer>(26);
        //System.out.println(obj2.imprimeDados());
    }
}