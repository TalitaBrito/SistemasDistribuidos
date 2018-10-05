package Polegada_POO;

import java.util.Scanner;


public class Aplicativo {
    public static void main(String args[]){
        double polegada;
           
        System.out.print("Informe o valor em Polegada:\t");
        Scanner ler = new Scanner(System.in);
        polegada = ler.nextDouble();
           
        Polegada p = new Polegada(polegada);
        p.run();
    }
}
