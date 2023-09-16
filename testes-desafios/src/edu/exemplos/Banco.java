package edu.exemplos;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Banco {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("valor inicial = ");
        double valorInicial = scanner.nextDouble();
        System.out.println("taxa de juros = ");
        double taxaJuros = scanner.nextDouble();
        System.out.println("periodos em anos = ");
        int periodo = scanner.nextInt();
        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        
        double valorFinal = calcular(valorInicial, taxaJuros, periodo);
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }

    static double calcular (double valorInvestido, double taxa, int prazoAno){

        double valorCalculado = valorInvestido;
        double novoValor = 0; 

        for(int i = 0; i < prazoAno; i++) {
            novoValor = (valorCalculado + (valorCalculado * taxa));
            valorCalculado = novoValor;
        }
        return novoValor;
    }
}
