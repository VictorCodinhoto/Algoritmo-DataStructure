import java.util.Scanner;

public class Ordena_E_Busca {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(10);
        Scanner sc = new Scanner(System.in);
        v1.preencheVetor();
        System.out.println("vetor gerado " + v1);
        System.out.println("Digite seu valor para busca: ");
        double x = sc.nextDouble();
        Retorno retorno = v1.buscaSimples(x); //elemento referenciado pelo dois valores obtidos que sao [F/10] F = False, 10 = capacidade do vetor
        if (retorno.getAchou()){
            System.out.println(x + " " + "Valor encontrado no vetor");
        }
        else{
            System.out.println(x + " " + "Valor não encontrado no vetor");
        }
        System.out.println("Foram realizadas: " + retorno.getContador() +  " " + "tantas vezes");
        sc.close();
    }
}
