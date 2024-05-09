package br.edu.up.models;

public class Tripulacao extends Pessoa{
    public String identificadorAeronautica;
    public String matricula;

    public Tripulacao() {
    }

    public Tripulacao(String identificadorAeronautica, String matricula) {
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
}
