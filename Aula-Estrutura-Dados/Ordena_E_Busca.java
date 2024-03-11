import java.util.Scanner;

public class Ordena_E_Busca {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o tamanho do vetor");
            int n = sc.nextInt();
            while (n>0) {
                MeuVetor v1 = new MeuVetor(n);
                v1.preencheVetor();
                System.out.println("vetor gerado " + v1);
                System.out.println("Digite seu valor para busca: ");
                double x = sc.nextDouble();
                Retorno retorno = v1.buscaSimples(x); //elemento referenciado pelo dois valores obtidos que sao [F/10] F = False, 10 = capacidade do vetor
                if (retorno.getAchou()){
                System.out.println(x + " " + "Valor encontrado no vetor");
            }
            else{
                System.out.println(x + " " + "Valor nao encontrado no vetor");
            }
            System.out.println("\nForam realizadas: " + retorno.getContador() +  " " + "tantas vezes");
            System.out.println("\nOrdenando...");
            v1.Bubblesort();
            retorno = v1.buscaBinaria(x);
            if (retorno.getAchou()){
                System.out.println(x + "encontrado no vetor pela busca binaria");
            }
            else{
                System.out.println(x + "nao encontrado pela busca binaria");
            }
            System.out.println("Foram realizadas" + retorno.getContador() + " " + "comparacoes");
            n = sc.nextInt();
        }
        sc.close();
    }
}
