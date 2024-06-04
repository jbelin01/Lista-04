package br.edu.up.models;

public class Cliente {
    public String nome;
    public int quantidadePessoas;

    public Cliente(String nome, int quantidadePessoas) {
        this.nome = nome;
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePessoas() {
        return this.quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

}
// Os clientes podem realizar a reserva para o evento informando nome do
// responsável pela reserva e quantidade de pessoas