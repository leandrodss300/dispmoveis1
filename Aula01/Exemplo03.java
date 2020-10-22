package Aula01;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome1,nome2;
        System.out.println("Digite o primeiro nome");
        nome1 = scan.nextLine();
        System.out.println("Digite o segundo nome");
        nome2 = scan.nextLine();
        
        if(nome1.equals(nome2)){
            System.out.println("Nomes são iguais!!");
        }else{
            System.out.println("Nomes são diferentes");
        }

    }
}