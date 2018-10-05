package Dolar_POO;

import java.util.Scanner;

public class Aplicativo {
    
    public static void main(String args[]){
        double cotacao;
        int qtde_dolar;
           
        System.out.print("Informe o valor da Cotação do Dolar:\t");
        Scanner ler = new Scanner(System.in);
        cotacao = ler.nextDouble();
        System.out.print("Informe a quantidade de dólares:\t");
        qtde_dolar = ler.nextInt();   
        
        Dolar dolar = new Dolar(cotacao, qtde_dolar);        
        dolar.run();
        
    }
    
}
