package br.edu.up.models;

public abstract class Pessoa {
    private String nome;
    private String rg;
    private Aeronave aeronave;


    public Pessoa() {
    }

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
   
}