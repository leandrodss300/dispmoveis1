package Aula04.classes;

public class Quadrado extends Retangulo{

    public Quadrado(double Altura){
        super(Altura,Altura);
    }

    @Override
    public String toString(){
        return "-------------------------------------------"+"\n"+
               "Area do Quadrado[ Altura: "+ this.Altura + "\n"+
               "Altura: "+ this.Altura + "\n"+
               "Area: "+ this.calcularArea()+ "]"+"\n"+
               "-------------------------------------------"+"\n"+
               "O perímetro do Quadrado[Altura: "+this.Altura+"\n"+ 
               "Altura: "+this.Altura+"\n"+
               "Perímetro: "+this.calcularPerimetro()+
               "\n"+"-------------------------------------------"+"]"+"\n";
    }
/*
    @Override
    public double calcularArea(){
        return Altura * Altura;
    }

    @Override
    public double calcularPerimetro(){
        return Altura + Altura*2;
    }*/
}