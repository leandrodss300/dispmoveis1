package Prova01;
import java.util.Scanner;

class Prova01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v[];
        int num;
        int imp=0;
        int par=0;
        int maior=0;
        int menor=0;
        int igual=0;

        v = new int[10];

        for(int i=0; i < v.length; i++){
            System.out.println("Insira um número:");
            v[i] = scan.nextInt();

           /* System.out.println("-----------------");
            System.out.println("Número: "+(v[i]));*/
        }

        for(int i=0; i < v.length; i++){
            if(v[i]%2 == 0){
                //System.out.println("O número "+v[i]+" é par!");
                par++;
            }else{
                //System.out.println("O número "+v[i]+" é ímpar!");
                imp++;
            }
        }
        System.out.println("Insira um número para ser comparado:");
        num = scan.nextInt();

        for(int a=0; a < v.length; a++){
            if(v[a] > num){
                //System.out.println("O número "+v[a]+" é maior que "+ num);
                maior++;
            }else if(v[a] < num){
                //System.out.println("O número "+v[a]+" é menor que "+ num);
                menor++;
            }else{
                //System.out.println("O número "+v[a]+" é igual que "+ num);
                igual++;
            }
        }

        
        System.out.println("A quantidade de números pares é: "+par);
        System.out.println("A quantidade de números impares é: "+imp);
        System.out.println("A quantidade de números maiores que "+num+" é: "+maior);
        System.out.println("A quantidade de números menores que "+num+" é: "+menor);
        System.out.println("A quantidade de números igual que "+num+" é: "+igual);
        
    }
}