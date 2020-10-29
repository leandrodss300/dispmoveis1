package Prova01.classes;
 public class Voo{
     String numVoo;
     int vagas[];
     Data data;

     public Voo(String numVoo, Data data){
        this.data = data;
        this.numVoo = numVoo;
        this.vagas = new int [100];

        for(int i=0; i <vagas.length; i++){
            this.vagas[i] = 0;
        }
     }

     public Voo(String numVoo, int dia,int mes,int ano){
        this.data = new Data(dia,mes,ano); 
        this.numVoo = numVoo;
        this.vagas = new int [100];

        for(int i=0; i <vagas.length; i++){
            this.vagas[i] = 0;
        }
     }

    public int proximoLivre(){
        for(int i=0; i <vagas.length; i++){
            if(this.vagas[i] == 0){
                return i+1;
            }
        }
         return -1;
     }

    public void verifica(int a){
        if(this.vagas[a-1] == 1){
            System.out.println("Esta vaga já está preenchida!");
        }else if(this.vagas[a-1] == 0){
            System.out.println("Esta vaga está disponível!");
        }
    }

    public boolean ocupa(int b){
        if(this.vagas[b-1] == 1){
            return false;
        }
        return true;
    }

    public int vagas(int a){
        for(int i=0; i < vagas.length; i++){
            if(this.vagas[i] == 0){
                a++;
            }
        }
        return a;
    }

    public String getNumVoo() {
        return numVoo;
    }

    public Data getData() {
        return this.data;
    }

    @Override
    public String toString(){
        return"Número do Vôo: "+this.getNumVoo()+"\n"+
              "Data: "+this.getData();
    }
 }