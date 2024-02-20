public class MeuVetor{
    private int[] v;
    private int ultimaPos;

    public MeuVetor (int capacidade){
        v = new int[capacidade];//array criado 
        ultimaPos = -1; //incializacao dele começa com -1
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

    public boolean estaCheio(){
        if (ultimaPos == v.length - 1){
            return true;
        }
        return false;
    }

    public boolean estaVazio(){
        if (ultimaPos == -1){ //n é possivel colocar null, pois a ultimaPos é um inteiro e não um objeto
            return true; 
        }
        return false;
    }

    public void resetVetor(){
        ultimaPos = -1;
    }

    public boolean adicionado(int elemento){
        if (estaCheio())
            return false;
        ultimaPos++;
        v[ultimaPos] = elemento;
        return true;
    }
    @Override
    public String toString(){
        String s="";
        if (estaVazio()){
            s = s + "vetor vazio";
        }
        else{
            for (int i=0; i <= ultimaPos; i++){
                s = s + v[i] + " ";
            }
        }
        s = s + "\n";
        return s;
    }
}
