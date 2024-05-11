package br.edu.up.models;

import java.util.ArrayList;

public class Comissario extends Tripulacao {
    public ArrayList<String> idioma;

    public Comissario() {
    }

    public Comissario(ArrayList<String> idioma) {
        this.idioma = idioma;
    }

    public ArrayList<String> getIdioma() {
        return this.idioma;
    }

    public void setIdioma(ArrayList<String> idioma) {
        this.idioma = idioma;
    }
}