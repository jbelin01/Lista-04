package br.edu.up.models;


public class Carro {
    public String placa;
    public String modelo;
    public String cor;

    public Carro(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }
}

