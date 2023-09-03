import java.util.Scanner; //para receber input de dados
import java.util.Locale; //para ativar o ponto decimal do valor

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scan
        ner = new Scanner(System.in).useLocale(Locale.US);
      
        System.out.println("** Bem vindo ao banco TESTE **");
        System.out.println("Por favor, digite seu nome ");
        String nomeCliente = scanner.next(); //entende apenas uma palavra no nome -> entender melhor
        System.out.println("Informe sua agência ");
        String agencia = scanner.next();
        System.out.println("Informe sua conta ");
        int conta = scanner.nextInt();
        System.out.println("Informe seu saldo ");
        double saldo = scanner.nextDouble();

        scanner.close();
        System.out.println("Olá " + nomeCliente + "!!! Obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
