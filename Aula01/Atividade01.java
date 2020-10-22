package Aula01;
import java.util.Scanner;

class Atividade01{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num1, num2 = 0;
      String op;
      System.out.println("Digite a operação:");
      System.out.println("+ - Somar");
      System.out.println("- - Subtrair");
      System.out.println("* - Multiplicar");
      System.out.println("/ - Dividir");
      System.out.println("% - Resto");
      System.out.println("^ - Potenciação");
      System.out.println("raiz - Raiz");
      op = scan.nextLine();

      if(op.equals("raiz")){
        System.out.println("Digite um número:");
        num1 = scan.nextInt();
      }else{
        System.out.println("Digite o primeiro numero:");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = scan.nextInt();
      }
  
      if(op.equals("+")){
        System.out.println("A soma é: "+(num1+num2));
      }else if(op.equals("-")){
        System.out.println("A subtração é: "+(num1-num2));
      }else if(op.equals("*")){
        System.out.println("A multiplicao é: "+(num1*num2));
      }else if(op.equals("/")){
        System.out.println("A divisão é: "+((float)num1/(float)num2));
      }else if(op.equals("%")){
        System.out.println("O resto é: "+(num1%num2));
      }else if(op.equals("^")){
        System.out.println("A potência é: "+(Math.pow(num1, num2)));
      }else if(op.equals("raiz")){
        System.out.println("A raiz quadrada do primeiro valor: "+(Math.sqrt(num1)));
      }else if(op!="+" && op!="-" && op!="*" && op!="/" && op!="%" && op!="^" && op!="raiz"){
        System.out.println("Opreação não reconhecida!");
      }
    }
  }