package Prova01.classes;

public class Data{
    int Dia;
    int Mes;
    int Ano;

    public Data(int Dia, int Mes, int Ano){
        if(Dia <= 30 && Dia > 0 && Mes <= 12 && Mes > 0){
            this.Dia = Dia;
            this.Mes = Mes;
            this.Ano = Ano;
        }else{
            this.Dia = 0;
            this.Mes = 0;
            this.Ano = 0;
        }

        
    }

    public int Compara(Data d){
        //Comparar o ano
        if(this.Ano<d.Ano){
            return 1;
        }else if(this.Ano>d.Ano){
            return -1;
        }

        if(this.Mes<d.Mes){
            return 1;
        }else if(this.Mes>d.Mes){
            return-1;
        }

        if(this.Dia<d.Dia){
            return 1;
        }else if(this.Dia>d.Dia){
            return -1;
        }

        return 0;
    }

    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }

    public int getAno() {
        return Ano;
    }

    @Override
    public String toString(){
        return this.Dia+"/"+ this.Mes +"/"+ this.Ano;
    }
}