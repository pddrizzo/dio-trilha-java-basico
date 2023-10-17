package edu.controller;

import edu.service.AparelhoTelefone;
import edu.service.NavegadorInternet;
import edu.service.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {
        
        // Reprodutos Musical
        ReprodutorMusical ipod = new ReprodutorMusical();

        ipod.selecionarMusica();
        ipod.tocarMusica();
        ipod.pausarMusica();
        System.out.println(" ");

        // Telefone
        AparelhoTelefone telefone = new AparelhoTelefone();

        telefone.atenderChamada();
        telefone.fazerChamada();
        telefone.ouvirCorreioVoz();
        System.out.println(" ");

        //Navegador Internet
        NavegadorInternet   internet = new NavegadorInternet();

        internet.exibirPagina();
        internet.atualizarPagina();
        internet.adicionarNovaAba();
        System.out.println(" ");

    }
}
