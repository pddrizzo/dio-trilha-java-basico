public class TesteCondicional {
    public static void main(String[] args) {
        
        int primeiro = 11, segundo = 5, terceiro = 3, MAIOR;
        if (primeiro >= segundo) {
            if (primeiro >= terceiro) {
                MAIOR = primeiro;
            }
            else {
              MAIOR = terceiro;
            }
        } else {
            if (segundo >= terceiro) {
                MAIOR = segundo;
            }
            else {
              MAIOR = terceiro;
            }
        }
            
          System.out.println("O MAIOR NÚMERO É: " + MAIOR);
          
          
          /*for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x) */


/* nt num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3)*/

        }
}
