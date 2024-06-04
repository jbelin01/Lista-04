package br.edu.up.models;

public class Reserva extends Cliente{
    public String data;
    public Double totalReserva;

    public Reserva(String nome, int quantidadePessoas, String data, Double totalReserva) {
        super(nome, quantidadePessoas);
        this.data = data;
        this.totalReserva = totalReserva;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getTotalReserva() {
        return this.totalReserva;
    }

    public void setTotalReserva(Double totalReserva) {
        this.totalReserva = totalReserva;
    }
    
}
// Na reserva ainda deve ser registrado a data e o valor total da reserva.
