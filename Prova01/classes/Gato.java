package Prova01.classes;

public class Gato extends Animal{

    public Gato(String nome, int idade){
        super(nome,idade);
    }

    @Override
    public String emitirSom(){
        return 
        "miau miau miau";
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