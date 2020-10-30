package Prova01.classes;

public class Passaro extends Animal{

    public Passaro(String nome, int idade){
        super(nome,idade);
    }

    @Override
    public String emitirSom(){
        return 
        "piu piu piu";
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