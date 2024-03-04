import java.util.Random;

public class MeuVetor{
    private double[] v;
    private int ultimaPos;

    public MeuVetor (int capacidade){
        v = new double[capacidade];//array criado 
        ultimaPos = -1; //incializacao dele começa com -1
    }
    //métodos de acesso 
    public int getUltimaPos(){
        return ultimaPos;
    }
    public double[] getV(){ //vetor é uma referencia = ponteiro 
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

    // public boolean adicionado(int elemento){
    //     if (estaCheio())
    //         return false;
    //     ultimaPos++;
    //     v[ultimaPos] = elemento;
    //     return true;
    // }

    public void adicionado(int elemento){
        if (estaCheio()) {
            redimensiona(v.length*2);
        }        
        v[++ultimaPos] = elemento;
    }

    public void adicionado(double elemento){ //sobrecarga de método do adicionado
        if (estaCheio()) {
            redimensiona(v.length*2);
        }        
        v[++ultimaPos] = elemento;
    }

    public double removeElemento(){
        if (estaCheio()) return 0; //este return pode ser nao alcançavel
        Double aux = v[ultimaPos--];
        if (v.length>=10 && ultimaPos <= v.length/4){ //aqui  este vetor não deixa ele ficar menor que 10, pois ele precisa de um numero minimo para poder ser redimensionado 
            redimensiona(v.length/2);
        }
        return aux;
    }

    private void redimensiona(int novaCapacidade){
        double[] temp = new double[novaCapacidade];
            for (int i = 0; i <= ultimaPos; i++){
                temp[i] = v[i]; //copia tudo para dentro da novo Array
        }
        v = temp;
    }

    @Override
    public String toString(){
        String s="";
        if (estaVazio()){
            s = s + "vetor vazio";
        }
        else{
            for (int i=0; i <= ultimaPos; i++){
                s = s + String.format("%.0f", v[i]) + " ";
            }
        }
        s = s + "\n";
        return s;
    }
    public void preencheVetor(){
        Random r = new Random();

        for (int i = 0; i < v.length; i++){
            adicionado(r.nextInt(v.length * 10) + 1); 
        }
    }
    public void preencheVetor(int limiteGeracao){
        Random r = new Random();

        for (int i = 0; i < v.length; i++){
            adicionado(r.nextInt(limiteGeracao) + 1); //
        }
    }
    public int Bubblesort(){
        int cont = 0;
        for (int i=1; i<v.length; i++){
            for (int j = 0; j<v.length-i; j++){ //está varredura é usada para ordenar os numeros de uma forma crescente 
                cont++;
                if (v[j] > v[j + 1]){
                    double aux = v[j]; 
                    v[j] = v[j + 1]; //verificando se os valores que está do lado do outro sao maiores que os outros
                    v[j+1] = aux;
                }
            }
        }
        return cont;
    }
}
