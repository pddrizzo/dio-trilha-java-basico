import java.util.Scanner;

public class Desafio1 {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();
    scanner.close();

    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
    ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

    System.out.println("Informacoes:");
    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
    System.out.println("Conta: " + contaBancaria.numero);
    System.out.println("Titular: " + contaBancaria.titular);
    System.out.println("Saldo: R$ " + contaBancaria.saldo);
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
}