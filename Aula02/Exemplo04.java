package Aula02;
import Aula02.classes.Estudante;
public class Exemplo04 {
    public static void main(String[] args) {
        double[] n1 = {5,7,8};
        double[] n2 = {8,9,5};
        double[] n3 = {6,6,6};
        Estudante e1 = new Estudante("111","Matheus",n1);
        Estudante e2 = new Estudante("222", "Victória", n2);
        Estudante e3 = new Estudante("333","Lucas", n3);
        Estudante e4 = new Estudante("444", "Rebeca",n1);
        Estudante e5 = new Estudante("555", "Fabricio",n2);
        Estudante e6 = new Estudante("666", "Lazaro",n3);
        
        e1.setDataMatricula("21/10/2020");
        e2.setDataMatricula("20/10/2020");
        System.out.println(Estudante.getNumEstudantes());

        e1.imprime();
        System.out.println("-------------------------------");
        e2.imprime();
        System.out.println("-------------------------------");
        e3.imprime();
        System.out.println("-------------------------------");
        e4.imprime();
        System.out.println("-------------------------------");
        e5.imprime();
        System.out.println("-------------------------------");
        e6.imprime();
        System.out.println("Nº Total Estudantes: "+Estudante.getNumEstudantes());
        
    }

    
}