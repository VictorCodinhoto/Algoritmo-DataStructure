public class Teste1{
    public static void main (String[] args){
        MeuVetor v1 = new MeuVetor(4);//v1 é uma variavel de referencia = ponteiro 
        System.out.println("Ultima posicao depois da construção" + v1.getUltimaPos());

        v1.setUltimaPos(100);
        System.out.println("Ultima posicao do set: " + v1.getUltimaPos());



    }
}