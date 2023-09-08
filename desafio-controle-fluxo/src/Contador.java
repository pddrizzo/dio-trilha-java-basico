import java.util.InputMismatchException;
import java.util.Scanner; //para receber input de dados

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner terminal = new Scanner(System.in);
        System.out.println("** Desafio - Controle de fluxo **");
        System.out.println("Digite parâmetro um: ");
        int paramUm = terminal.nextInt();
        System.out.println("Digite parâmetro dois: ");
        int paramDois = terminal.nextInt();
              
        try{
            contar(paramUm, paramDois);
        } catch (InputMismatchException e) {
            System.out.println("Parâmetro digitado deve ser numérico e inteiro");
        } catch (ParametroInvalidoException e) {
            System.out.println(("Parâmetro dois deve ser maior que parâmetro um"));
        }
        
        terminal.close();
    }

    static void contar(int paramUm, int paramDois)  throws ParametroInvalidoException{

        if(paramDois < paramUm) {
            throw new ParametroInvalidoException();
        }

        System.out.print("Imprimindo intervalo entre " + paramUm + " e " + paramDois + " : " );
        for(int i = paramUm; i <= paramDois; i++) {
            System.out.print(i + " " );
        }     
        System.out.println("");  
        System.out.println("Quantidade de interações realizadas = " + (paramDois - paramUm));  
    }

}
