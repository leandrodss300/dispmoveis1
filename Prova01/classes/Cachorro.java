package Prova01.classes;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade){
        super(nome,idade);
    }

    @Override
    public String emitirSom(){
        return 
        "au au au";
    }

    @Override
    public String toString(){
        return 
        "-----------------------------"+"\n"+ 
        "nome: "+this.nome+"\n"+
        "Idade: "+this.idade+"\n"+
        "Som: "+emitirSom();
    }
}