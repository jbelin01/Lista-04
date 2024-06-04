package br.edu.up.models;

public class evento {
    public String nome;
    public String data;
    public String local;
    public int lotacaoMaxima;
    public int quantidadeIngressos;
    public Double precoIngresso;

    public evento(String nome, String data, String local, int lotacaoMaxima, int quantidadeIngressos, Double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.quantidadeIngressos = quantidadeIngressos;
        this.precoIngresso = precoIngresso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLotacaoMaxima() {
        return this.lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public int getQuantidadeIngressos() {
        return this.quantidadeIngressos;
    }

    public void setQuantidadeIngressos(int quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }

    public Double getPrecoIngresso() {
        return this.precoIngresso;
    }

    public void setPrecoIngresso(Double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

}


