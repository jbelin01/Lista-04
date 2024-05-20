package br.edu.up.models;

import java.util.ArrayList;

public class Comissario extends Tripulante {
    private String[] idiomas; 

    public Comissario() {
    }

    public Comissario(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public String[] getIdioma() {
        return this.idiomas;
    }

    public void setIdioma(String[] idioma) {
        this.idiomas = idiomas;
    }
}