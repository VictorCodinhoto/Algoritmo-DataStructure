public class ABB {
    private No raiz;
    public boolean estaVazia () {
        return raiz == null;
    }

    public void insere (int info) {
        No novo = new No(info);
        if (estaVazia()) {
            raiz = novo;
        }
        else {
            insereRec (novo, raiz);
        }
    }
    void insereRec (No novo, No atual) {
        if (novo.getInfo() <= atual.getInfo()) {
            if (atual.getEsquerda() == null) {
                atual.setEsquerda(novo);
            }
            else {
                insereRec(novo, atual.getEsquerda());
            }
        }
        else {
            if (atual.getDireita() == null) {
                atual.setDireita(novo);
            }
            else {
                insereRec(novo, atual.getDireita());
            }
        }
    }
    public String stringInOrder() {
        if (estaVazia()) return "arvore vazia";
        return stringRecInOrder(raiz);
    }
    String stringRecInOrder(No atual) {
        if (atual != null) 
            return stringRecInOrder (atual.getEsquerda()) +
            " " + atual.getInfo() + " " +
            stringRecInOrder (atual.getDireita());
        return "";
    }
}
