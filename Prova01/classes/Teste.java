package Prova01.classes;
import Prova01.classes.*;
import java.util.Scanner;
class Teste{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num; 
        Voo v = new Voo("5",10,05,2020);


        for(int i=0; i<5; i++){
            System.out.println("Insira o número da cadeira que você deseja preencher:");
            num = scan.nextInt();
            v.ocupa(num);
            System.out.println(v.vagas[num]);
            
        }
        System.out.println(v);
    }
}