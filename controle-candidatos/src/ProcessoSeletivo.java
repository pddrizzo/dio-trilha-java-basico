import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        double salarioBase = 2000;
        String [] candidato = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE", "PATRICIA"};
        //inicializando novo array
        String [] candidatoSelecionado = new String[5];
 
        System.out.println("");
        System.out.println("************************************");  
        System.out.println("** Projeto Controle de Candidatos **");  
        System.out.println("************************************"); 
        System.out.println("");  
        System.out.println("** Analisar candidato");  
        analisarCandidato(1900, salarioBase);
        analisarCandidato(2300, salarioBase);
        analisarCandidato(2000, salarioBase);
        System.out.println("");  
        System.out.println("** Selecionar candidato");  
        selecionarCandidato(salarioBase, candidato, candidatoSelecionado);
        System.out.println("");
        System.out.println("** Imprimir lista de candidatos selecionados");
        imprimirSelecionado(candidatoSelecionado);  
        System.out.println("");
        System.out.println("** Ligar candidato selecionado");
        ligarSelecionado(candidatoSelecionado);
        
    }

    //Seleciona Candidatos
    static void selecionarCandidato(double salarioBase, String[] candidato, String [] candidatoSelecionado){

        int contaCandidato = 0;
        int contaSelecionado = 0;
        
        //analisando a situação de cada participante
        while (contaCandidato < candidato.length) {
            double salarioPretendido = obterValorPretendido();
            System.out.print("O valor sugerido por " + candidato[contaCandidato] + " foi de " + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                System.out.print(" --> Possível selecionado ");
                //armazena os candidatos selecionados
                if(contaSelecionado < 5) {
                    candidatoSelecionado[contaSelecionado] = candidato[contaCandidato];
                    contaSelecionado++;
                }
            }
            contaCandidato++;   
            System.out.println(" "); 
        }
    }

    //Imprime candidatos selecionados
    static void imprimirSelecionado(String[] candidatoSelecionado) {

        for(int i = 0; i < candidatoSelecionado.length; i++) {
              System.out.println("Canditado selecionado " + (i+1) + " " + candidatoSelecionado[i]);
        }
        System.out.println("-- forma abreviada "); 
        //forma abreviada for each
        for(String impressao: candidatoSelecionado) {
            System.out.println("Candidato selecionado = " + impressao);
        }
    }

    //Simula um valor pretendido
    static double obterValorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1900, 2100);
   }

   //Simula uma ligação atendida
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

   //Analisa o valor solicitado pelo candidato
    static void analisarCandidato (double salarioPretendido, double salarioBase){
        
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contrapoposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }       
    }

    //Fazer contato com candidato selecionado
    static void ligarSelecionado(String [] candidatoSelecionado) {

        int tentativa = 1;
        boolean atendeu = false;
        
        for(int i = 0; i < candidatoSelecionado.length; i++) {
            while(tentativa <= 3) {
                atendeu = atender();
                if (atendeu) {
                    System.out.println("Conseguimos contato com o candidato " + candidatoSelecionado[i] + " após " + tentativa + " tentativa(s)");
                    tentativa = 9; 
                } else{
                tentativa++;
                }
            }                    
            if (tentativa != 9) {
                System.out.println("Não conseguimos contato com o candidato " + candidatoSelecionado[i]);
            }
            tentativa = 1;
        }    
    }
}
