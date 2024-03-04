public class soma{
    public static void main(String[] args) { //permitir que metodo main receba parametros externos
        int s = 0;
        for (int i=0; i<args.length; i++){
            s = s + Integer.parseInt(args[i]); // neste trecho de codigo cada iteracão dentro do veto args, ele soma cada elemtno dentro do prompt de comando
        }
        System.out.println(s);
    }
}