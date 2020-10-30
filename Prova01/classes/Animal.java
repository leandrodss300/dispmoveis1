package Prova01.classes;
 
public abstract class Animal{
    String nome;
    int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String emitirSom();
}