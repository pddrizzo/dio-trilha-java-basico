import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList < String > ativos = new ArrayList < > ();

        //Entrada dos tipos de ativos
        int quantidadeAtivos = scanner.nextInt();
        //limpar scanner
        scanner.nextLine();
        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
        String codigoAtivo = scanner.nextLine();
        ativos.add(codigoAtivo);
        }

        //TODO: Ordenar os ativos em ordem alfabética.
        Collections.sort(ativos);
        System.out.println("Ordenando.........");
        //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        for (int i = 0; i < quantidadeAtivos; i++) {
            System.out.println(ativos.get((i)));
        }
    }
}