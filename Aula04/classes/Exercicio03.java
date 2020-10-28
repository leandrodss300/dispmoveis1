package Aula04.classes;
import Aula04.classes.*;
class Exercicio03{
    public static void main(String[] args) {
        Circulo C = new Circulo(10);
        Retangulo R = new Retangulo(30, 20);
        Quadrado Q = new Quadrado(20);
        Forma F[]={C,R,Q};

        for(int i=0; i < F.length; i++){
            System.out.println(F[i]);
        }
    }
}