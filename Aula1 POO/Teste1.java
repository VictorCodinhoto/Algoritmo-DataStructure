public class Teste1{
    public static void main (String[] args){
        MeuVetor v1 = new MeuVetor(4);//v1 é uma variavel de referencia = ponteiro 
        System.out.println("Ultima posicao depois da construção" + v1.getUltimaPos());
        System.out.println("Meu Vetor foi construido");
        System.out.println(v1);

        // v1.setUltimaPos(100);
        // System.out.println("Ultima posicao do set: " + v1.getUltimaPos());

        // vetor esta cheioo dependendo da capacidade do vetor na linha 3
        // System.out.println("meu vetor antes de estragar o controle");
        // System.out.println(v1);
        // if (v1.adicionado(12)){
        //     System.out.println("elemento inserido com sucesso");
        // }
        // else{
        //     System.out.println("vetor esta cheio");
        // }

        // for (int n=1; n<=100; n++){
        //     v1.adicionado(n);
        //     System.out.println("n = " + n + ", tamanho do vetor = " + v1.getV().length);
        // }
        while (!v1.estaVazio()){
            System.out.println(v1.removeElemento() + "saiu da lista, capacidade" + " " + v1.getV().length);
        }
    }
}