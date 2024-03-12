public class Lista {
    private No primeiro;

    public Lista(){ //não precisa escrever, pois o Java cuida disto
        primeiro = null;
    }
    public No getPrimeiro(){
        return primeiro;
    }
    public boolean listaEstaVazia(){
        return primeiro == null; //lista que aponta para o primeiro elemento que aponta para nul, a partir desta linha
    }
    public void insereInicio(int i){
        No novo = new No(i);
        if (!listaEstaVazia()){ //se caso a lista nao estiver vazia, adicione o primeiro elemento a lista 
            novo.setProximo(primeiro); 
        }
        primeiro = novo;
    }
}
