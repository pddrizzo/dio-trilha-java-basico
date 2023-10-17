package edu.service;

import edu.util.Volume;

public class ReprodutorMusical {

    public void selecionarMusica(){
        System.out.println("Selecionando uma música...");
    }

    public void tocarMusica() {
        Volume volume = new Volume();
        System.out.println("Tocando a música selecionada..");
        volume.aumentarVolume();
        volume.diminuirVolume();
        volume.diminuirVolume();
    }

    public void pausarMusica() {
        System.out.println("Pausando a música que está tocando...");
    }
}
