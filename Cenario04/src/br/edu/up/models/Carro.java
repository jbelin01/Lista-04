package br.edu.up.models;


public class Carro {
    public String modelo;
    public String placa;
    public String cor;
    public String periodo;

    public Carro(String modelo, String placa, String cor, String periodo) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.periodo = periodo;
    }

    public Carro() {
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPeriodo() {
        return periodo;
    }

    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}

