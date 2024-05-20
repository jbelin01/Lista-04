package br.edu.up.models;

public class Comandante extends Tripulante {
    
    public int totalHoraVoo;

    public Comandante() {
    }

    public Comandante(int totalHoraVoo) {
        this.totalHoraVoo = totalHoraVoo;
    }

    public int getTotalHoraVoo() {
        return this.totalHoraVoo;
    }

    public void setTotalHoraVoo(int totalHoraVoo) {
        this.totalHoraVoo = totalHoraVoo;
    }

}
