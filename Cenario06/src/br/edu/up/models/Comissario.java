package br.edu.up.models;

import java.util.Arrays;

public class Comissario extends Tripulante {
    private String[] idioma; 

    
    public Comissario(String nome, String rg, String identificadorAeronautica, String matricula, String[] idioma) {
        super(nome, rg, identificadorAeronautica, matricula);
        this.idioma = idioma;
    }

    public String[] getIdioma() {
        return this.idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Comissario -> nome: " + nome + ", rg: " + rg + ", identificadorAeronautica: " + identificadorAeronautica + ", idioma: "
                + Arrays.toString(idioma) +  ", matricula: " + matricula;
    }
    
}