package br.edu.up.models;

import java.util.Arrays;

public class Comandante extends Tripulante {
    
    public int totalHoraVoo;

       public Comandante(String nome, String rg, String identificadorAeronautica, String matricula, int totalHoraVoo) {
        super(nome, rg, identificadorAeronautica, matricula);
        this.totalHoraVoo = totalHoraVoo;
    }

    public int getTotalHoraVoo() {
        return this.totalHoraVoo;
    }

    public void setTotalHoraVoo(int totalHoraVoo) {
        this.totalHoraVoo = totalHoraVoo;
    }

    @Override
    public String toString() {
        return "Comandante -> nome: " + nome +  ", rg: " + rg + ", identificadorAeronautica: " + identificadorAeronautica + ", totalHoraVoo:"
                + totalHoraVoo +", matricula: " + matricula;
    }

    
}
