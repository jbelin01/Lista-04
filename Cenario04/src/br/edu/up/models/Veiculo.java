package br.edu.up.models;

public class Veiculo {
    private String modelo;
    private String cor;

    public Veiculo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }
}

