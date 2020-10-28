package Aula04.classes;

public class Retangulo extends Forma{
    protected double Altura;
    protected double Base;

    public Retangulo(double Altura, double Base){
        this.Altura = Altura;
        this.Base = Base;
    }

    @Override
    public String toString(){
        return "-------------------------------------------"+"\n"+
               "Area do Retângulo[ Altura: "+ this.Altura + "\n"+
               "Base: "+ this.Base + "\n"+
               "Area: "+ this.calcularArea()+ "]"+"\n"+
               "-------------------------------------------"+"\n"+
               "O perímetro do Retângulo[Altura: "+this.Altura+"\n"+ 
               "Base: "+this.Base+"\n"+
               "Perímetro: "+this.calcularPerimetro()+
               "\n"+"-------------------------------------------"+"]"+"\n";
    }
    
    @Override
    public double calcularArea(){
        return Altura * Base;
    }

    @Override
    public double calcularPerimetro(){
        return Altura + Base*2;
    }
}