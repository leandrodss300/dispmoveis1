package Prova01.classes;
import Prova01.classes.*;

class TesteAnimais{
    public static void main(String[] args) {
        Gato g = new Gato("Gato", 7);
        Cachorro c = new Cachorro("Cachorro", 12);
        Passaro p = new Passaro("Passaro", 79);
        Animal a[]={g,c,p};
        
        for(int i=0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}