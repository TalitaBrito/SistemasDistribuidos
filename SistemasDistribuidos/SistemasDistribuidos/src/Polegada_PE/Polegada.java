package Polegada_PE;

import java.util.Scanner;

public class Polegada {
    
        public static void main(String args[]){
        
        double polegada = 0 , milimitro;
        final double val_milimitro = 25.4;
        
        System.out.print("Informe o valor em Polegada:\t");
        Scanner ler = new Scanner(System.in);
        polegada = ler.nextDouble();
        
        milimitro = polegada * val_milimitro;
        System.out.println("O valor em milimitro é " + milimitro);
    }
    
}
