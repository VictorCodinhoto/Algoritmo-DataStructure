class Fila{
    constructor(){
        this.fila = [];
    }
    enqueue(element){
        this.fila.push(element); //adicionar elemento no final da fila
    }
    dequeue(){
        return this.fila.shift(); //remove o primeiro elemento da fila
    }
}