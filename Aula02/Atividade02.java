package Aula02;
import Aula02.classes.Conta;
import java.util.Scanner;
public class Atividade02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a="6";
        String b;
        int valor1;
        double valor2 = 0;
        Conta c1 = new Conta("Leandro","777.777.777-77",1700,5000);
        Conta c2 = new Conta("Karl","222.222.222.22",8000,5000);
        
        System.out.println("Informe a seu cpf:");
        b = scan.nextLine();
        do{
            
        if(c1.getCpf().equals(b)){
            System.out.println(c1.getSaldo());

            System.out.println("Informe a opreção desejada:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Cosulta do saldo");
            System.out.println("3 - Deposito");
            System.out.println("4 - Compra com crédito");
            System.out.println("5 - Transferência");
            System.out.println("6 - sair");
            a = scan.nextLine();

            if(a.equals("1")){
                System.out.println("Digite o valor a ser sacado:");
                valor1 = scan.nextInt();
                c1.saca(valor1);
            }else if(a.equals("2")){
                System.out.println("O seu saldo atual é:");
                c1.getSaldo();
            }
            else if(a.equals("3")){
                System.out.println("Digite o valor que você deseja depositar:");
                valor1 = scan.nextInt();
                c1.deposita(valor1);
            }
            else if(a.equals("4")){
                System.out.println("Insira o valor que você deseja gastar:");
                valor1 = scan.nextInt();
                c1.compraCartao(valor1);
            }
            else if(a.equals("5")){
                System.out.println("Digite o valor que você deseja tranferir:");
                valor2 = scan.nextInt();
                c1.transferePara(c2,valor2);
            }
            System.out.println("--------------------------------------------");
            c1.imprime();
            System.out.println("--------------------------------------------");
            c2.imprime();

        }else if(c2.getCpf().equals(b)){

            System.out.println(c2.getSaldo());

            System.out.println("Informe a opreção desejada:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Cosulta do saldo");
            System.out.println("3 - Deposito");
            System.out.println("4 - Compra com crédito");
            System.out.println("5 - Transferência");
            System.out.println("6 - sair");
            a = scan.nextLine();

            if(a.equals("1")){
                System.out.println("Digite o valor a ser sacado:");
                valor1 = scan.nextInt();
                c2.saca(valor1);
            }else if(a.equals("2")){
                System.out.println("O seu saldo atual é:");
                c2.getSaldo();
            }
            else if(a.equals("3")){
                System.out.println("Digite o valor que você deseja depositar:");
                valor1 = scan.nextInt();
                c2.deposita(valor1);
            }
            else if(a.equals("4")){
                System.out.println("Insira o valor que você deseja gastar:");
                valor1 = scan.nextInt();
                c2.compraCartao(valor1);
            }
            else if(a.equals("5")){
                System.out.println("Digite o valor que você deseja tranferir:");
                valor2 = scan.nextInt();
                c2.transferePara(c1,valor2);
            }
            System.out.println("--------------------------------------------");
            c2.imprime();
            System.out.println("--------------------------------------------");
            c1.imprime();
        }else{
            System.out.println("Conta não encontrada!");
        }
        }while(!a.equals("6"));
    }
}