import java.util.Scanner;
import java.text.DecimalFormat;

public class GrandeDeposito {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("digite o valor = ");
        double valor = scanner.nextDouble();
        
        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            System.out.println("Deposito realizado com sucesso! Saldo atual: R$ " + df.format(valor));
        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Encerrando o programa...");
        } else {
             //TODO: Imprimir a mensagem de encerrar o programa.
             System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
    }
}
