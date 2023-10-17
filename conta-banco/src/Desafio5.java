import java.util.Scanner;

public class Desafio5 {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String entrada = scanner.nextLine();
    String[] partes = entrada.split(",");

    // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.    
    //int i=0;
    String data = partes[0];
    //System.out.println(data);
    //i++;
    String hora = partes[1];    
    //System.out.println(hora);
    //i++;
    String descricao = partes[2];    
    //System.out.println(descricao);
    //i++;
    double valor = Double.valueOf(partes[3]);    
    //System.out.println(valor);
    Transacao transacao = new Transacao(data, hora, descricao, valor);
    transacao.imprimir();
  }
}

class Transacao {
  private String data;
  private String hora;
  private String descricao;
  private double valor;

  public Transacao(String data, String hora, String descricao, double valor) {
    this.data = data;
    this.hora = hora;
    this.descricao = descricao;
    this.valor = valor;
  }
  
  public void imprimir() {
    System.out.println(this.descricao);
    System.out.println(this.data);
    System.out.println(this.hora);
    System.out.printf("%.2f", this.valor);
  }
}