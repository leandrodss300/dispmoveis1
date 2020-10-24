package Aula02.classes;

public class Conta{
    private String nome;
    private String cpf;
    private double saldo;
    private int limiteCartao;
    public static final int MAX_SAQUE=1000;

    public Conta(String nome, String cpf, double saldo, int limiteCartao){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.limiteCartao = limiteCartao;
    }
    public String getCpf(){
        return this.cpf;
    }

    public void saca(double valor){
        if(this.saldo < valor){
            System.out.println("Valor de saque superior ao saldo disponível!");
        }else if(valor > MAX_SAQUE){
            System.out.println("Saque indisponível!");
        }else{
            this.saldo = this.saldo - valor;
        }
    }

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public void compraCartao(int valor){
        if(this.limiteCartao < valor){
            System.out.println("Compra recusada!");
        }else{
            this.limiteCartao = this.limiteCartao - valor;
        }
    }

    public void transferePara(Conta cpf, double valor){
        this.saca(valor);
        cpf.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.saldo);
        System.out.println(this.limiteCartao);
    }
}