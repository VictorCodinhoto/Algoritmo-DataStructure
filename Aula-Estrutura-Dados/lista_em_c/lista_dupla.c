#include <stdio.h>
#include <stdlib.h>

typedef struct no{
    int info;
    struct no * anterior;
    struct no * proximo;
    
} t_no; //apelido que dou para estrutura
//guarda celulas do no para o anterior e o proximo do nó, para saber sua posicao

typedef struct lista{
    struct no * primeiro;
    struct no * ultimo;
} t_lista;
//estrutura que tem dois ponteiros que é para o ultimo no da lista, e para o primeiro da lista 
//void* = ponteiro generico
//malloc - definir o tamanho de tipo

//prototipo de funcoes 

t_no * constroi_no(int); //simulando construtor 
int esta_vazia (t_lista *);
void insere_inicio (int, t_lista *);
//no1 e no2 valores estaticos

int main()
{
    int a = 20;
    printf("a == 10: %d\n", a==10); //testando valores booleanos = true
    printf("a != 10: %d\n", a!=10);//Testando valores booleanos = false
    t_no * no1 = constroi_no(10);
    t_no * no2 = constroi_no(20);

    printf("A variavel no1 esta no endereco %p\n", &no1);
    printf("No1 esta no endereço %p\n", no1);
    printf("a variavel no2 esta no endereco %p\n", &no2);
    printf("No2 esta no endereço %p\n", no2);
    return 0;
}

t_no * constroi_no(int i){
    t_no * no = (t_no *) malloc(sizeof(t_no));
    no->info = i;
    no-> anterior = NULL;
    no->proximo = NULL;
    return no;
}
