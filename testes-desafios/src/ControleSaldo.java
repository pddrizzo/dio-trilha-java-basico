import java.util.Scanner;

public class ControleSaldo {

    public static void main(String[] args) throws Exception {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe saldo atual = ");
        int saldoTotal = scanner.nextInt();
        System.out.println("Informe valor pra saque = ");
        int valorSaque = scanner.nextInt(); 

        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
        if (valorSaque > saldoTotal) {
            System.out.println("Saldo insuficiente. Saque não realizado!");
        } else {
            int novoSaldo = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + novoSaldo);
        }
    }
}
