public class VetorTeste{
    public static void main(String[] args){ //arquivo no qual vamos ver a interação com o vetor
        Alunos a1 = new Alunos("João");
        Alunos a2 = new Alunos("José");
        
        Vetor lista = new Vetor();
       
        // System.out.println(lista.tamanho()); //nesta parte o vetor esta vazio
        // // lista.adiciona(a1); 
        // System.out.println(lista.tamanho());//aqui o vetor tem um aluno
        // // lista.adiciona(a2);
        // System.out.println(lista.tamanho());//aqui o vetor tem dois alunos

        // System.out.println(lista);

        System.out.println(lista.contem(a1)); //verifica se o aluno 1 está no vetor

        Alunos a3 = new Alunos("Danilo"); //add um aluno que não havia sido add
        System.out.println(lista.contem(a3)); // false

        // Alunos x = lista.saberPosAlun(200); //colocado um valor na posicao 200, que não existe, o java retorna o erro "ArrayIndexOutOfBoundsException"
        // System.out.println(x);

        lista.adiciona(0, a1);
        lista.adiciona(1, a2);
        lista.adiciona(0, a3); //colocando o numero no qual quer q a pessoa esteja, ela ira ficar, e os outros aluno ira passar para frente 
        System.out.println(lista);


    }
}