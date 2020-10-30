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

     public Voo(String numVoo, int Dia,int Mes,int Ano){
        this.data = new Data(Dia,Mes,Ano); 
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

    public boolean verifica(int b){
        if(this.vagas[b-1] == 1){
            return false;
        }
        return true;
    }

    public void ocupa(int b){
        this.vagas[b] = 1;
    }

    public int vagas(){
        int a = 0;
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
        return"Quantidade de cadeiras livres: "+this.vagas()+"\n"+
              "Número do Vôo: "+this.getNumVoo()+"\n"+
              "Data: "+this.getData();
    }
 }