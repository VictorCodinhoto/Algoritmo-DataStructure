public class TesteGeracaoRandomica {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(6); //quantidade de vezes que ele aparece dentro do vetor
        v1.preencheVetor();
        System.out.println(v1); //aqui ele invoca o toString() para converter ele para floatr
    }
}
