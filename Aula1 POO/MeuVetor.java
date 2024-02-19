public class MeuVetor{
    private int[] v;
    private int ultimaPos;

    public MeuVetor (int capacidade){
        v = new int[capacidade];
        ultimaPos = -1;
    }
    //métodos de acesso 
    public int getUltimaPos(){
        return ultimaPos;
    }
    public int[] getV(){ //vetor é uma referencia 
        return v;
    }
    //métodos modificadores 
    public void setUltimaPos(int pos){
        if (pos>= 0 && pos < v.length){ //tamanho do vetor varia de quantos dados forem colocados 
            ultimaPos = pos; //adicionar +1 de dado apos o ultimo colocado
        }
        else{
            ultimaPos = v.length - 1;
        }
    }
}
