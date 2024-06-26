package br.edu.up.models;

public class Tripulante extends Pessoa{
    public String identificadorAeronautica;
    public String matricula;

    
    public Tripulante(String nome, String rg, String identificadorAeronautica, String matricula) {
        super(nome, rg);
        this.identificadorAeronautica = identificadorAeronautica;
        this.matricula = matricula;
    }


    public String getIdentificadorAeronautica() {
        return this.identificadorAeronautica;
    }

    public void setIdentificadorAeronautica(String identificadorAeronautica) {
        this.identificadorAeronautica = identificadorAeronautica;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "Tripulante -> identificadorAeronautica: " + identificadorAeronautica + ", matricula: " + matricula;
    }

    
}
