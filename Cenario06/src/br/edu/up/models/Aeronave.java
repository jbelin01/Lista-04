package br.edu.up.models;

public class Aeronave extends Passagem{
    public String codigo;
    public String tipo;
    public int quantidadeAssentos;
    // public Passagem passagem;
    // public boolean[] assentosDisponiveis;

    public Aeronave() {
    }

    public Aeronave(String codigo, String tipo, int quantidadeAssentos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.quantidadeAssentos = quantidadeAssentos;
        // this.assentosDisponiveis = new boolean[quantidadeAssentos];
        // for (int i = 0; i < quantidadeAssentos; i++) {
        //     this.assentosDisponiveis[i] = true;
        // }
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeAssentos() {
        return this.quantidadeAssentos;
    }


    public void setQuantidadeAssentos(int quantidadeAssentos) {
        this.quantidadeAssentos = quantidadeAssentos;
    }
}
