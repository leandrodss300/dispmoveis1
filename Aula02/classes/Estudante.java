package Aula02.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;
    private static int NUM_ESTUDANTES=0;
    public static final int MAX_ESTUDANTES=5;

    public static int getNumEstudantes(){
        return Estudante.NUM_ESTUDANTES;
    }

    public Estudante(String matricula,String nome,double[] notas){
        if(NUM_ESTUDANTES >= MAX_ESTUDANTES){
            System.out.println("Já atingiu o maximo de estudantes!");
            return;
        }

        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
        Estudante.NUM_ESTUDANTES++;
    }
    public String getDataMatricula(){
        return this.dataMatricula;
    }
    public void setDataMatricula(String dataMatricula){
        this.dataMatricula = dataMatricula;
    }

    public void imprime(){
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.dataMatricula);
        for(int i=0; i<this.notas.length ; i++){
            System.out.println("Nota: "+this.notas[i]);
        }
    }

   
}