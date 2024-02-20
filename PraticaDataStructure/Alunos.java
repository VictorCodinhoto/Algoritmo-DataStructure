public class Alunos{
    private String nome;
    
    public Alunos(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

@Override
    public boolean equals(Object obj) {
        Alunos outro = (Alunos) obj;
        return outro.getNome().equals(this.nome);
    }
    
@Override // anotation -> avisa o desenvolvedor e o compilador que esse método será sobreposto
    public String toString() { //retorna o nome do aluno
        return nome;
     }

     //Armazenamento Sequencial -> ideia é armazenar um dado atras do outro. o primeiro aluno fica no primeiro espaço, o segundo aluno no segundo espaço, e assim por diante

     
     
}