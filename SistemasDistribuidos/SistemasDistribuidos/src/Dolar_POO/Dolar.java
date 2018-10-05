package Dolar_POO;

public class Dolar {
    
    double cotacao;
    int qtde_dolar;
    double resultado;

    public Dolar(double cotacao, int qtde_dolar) {
        this.cotacao = cotacao;
        this.qtde_dolar = qtde_dolar;
    }
    
    public void run(){
        resultado = cotacao * qtde_dolar;
        System.out.println("O valor da cotação é: " + resultado);
    }
    
}
