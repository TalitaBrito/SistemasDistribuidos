package Polegada_POO;

//Variável é criado dentro do método
//Atributo é criado dentro de uma classe

public class Polegada {
    double polegada;
    double milimitro;

    public Polegada(double polegada) {
        this.polegada = polegada;
    }
    
    public void run(){
        final double val_milimitro = 25.4;
        
        milimitro = polegada * val_milimitro;
        System.out.println("O valor em milimitro é " + milimitro);
    }
    
}
