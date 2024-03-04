import java.util.Date;
import java.util.Scanner; //usar o *, quando for importar. pode confundir na leitura do usuario quando for fazer manutenção, importando s as classes usadas dentro do código, melhor manutenção = legibilidade

public class Ordenacao { //classe responsavel por modificar os atributos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MeuVetor v1;
        int tamanho; //nao utilize valores fake para inicializar um laço, pois nao é o usuario que mexe, se caso queira mudar o tamanho do laço, precisará refatorar código
        System.out.println("Digite o tamanho do vetor: 0 encerra");
        tamanho = sc.nextInt();

        while(tamanho>0){
            v1 = new MeuVetor(tamanho); //invoca o objeto meuvetor com tamanho definido pelo usuario
            v1.preencheVetor();
            System.out.println("Vetor gerado:\n" + v1);
            // long inicio = new Date().getTime();
            int comparacoes = v1.Bubblesort(); //mesmo com a ordenacao dentro de uma variavel, ele ordena e não precisa ser chamado, mesmo guardado dentro de uma variavel
            
            // long fim = new Date().getTime();
            System.out.println("vetor ordenado: " + v1);
            // System.out.println("tamanho: " + tamanho + ", comparacoes: " + comparacoes);
            // System.out.println("tamanho: " + tamanho + "Demorou: " + (fim - inicio) + "ms");

            System.out.print("digite o tamanho para o vetor, 0 encerra: ");
            tamanho = sc.nextInt();
        }   
        sc.close();
    }
}
