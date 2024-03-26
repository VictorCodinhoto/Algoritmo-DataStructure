import java.util.Scanner;

public class Bee1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] pares = new int[1000000];
    int[] impares = new int[1000000];
    int nPares=0, nImpares=0, n;
    System.out.println("Digite um valor para ver seus valores pares e impares");
    n = sc.nextInt();
        for (int i=0; i<=n-1; i++){ //
            int x = sc.nextInt();
            if (x%2 == 0){
                pares[nPares] = x;
                nPares++;
            }
            else{
                impares[nImpares++] = x;
            }
        }
        //insertio sort
        for (int j =1; j < nPares; j++){
            int x = pares[j];
            int i;
            for(i = j -1; i>=0 && pares[i] > x; --i){
                pares [i + 1] = pares[i];
            pares[i+1] = x;
            }
        }
    sc.close();
    }
}
