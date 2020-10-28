package Aula04.classes;

public class Circulo extends Forma{
    private double R;

    public Circulo(double R){
        this.R = R;
    }

    @Override
    public String toString(){
        return"-------------------------------------------"+"\n"+
              "O perímetro do Círculo[Raio: "+this.R+"\n"+ 
              "PI: 3.14"+"\n"+
              "Perímetro: "+this.calcularPerimetro()+"]"+"\n"+
              "-------------------------------------------"+"\n"+
              "A área do Círculo[Área: "+this.calcularArea()+"\n"+
              "PI: 3.14"+"\n"+
              "Raio: "+this.R+
              "\n"+"-------------------------------------------"+"]"+"\n";
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * R;
    }

    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(R, 2);
    }
}