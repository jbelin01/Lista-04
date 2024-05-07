package br.edu.up.views;

import java.util.ArrayList;
import br.edu.up.models.Carro;

public class Estacionamento {

    public ArrayList<Carro> carros;
    public int vagas;
    public double valorPeriodo;

    public Estacionamento(){
        this.carros = new ArrayList<Carro>();
        this.vagas = 10;
        this.valorPeriodo = 5.0;
    }

    public void entrarVeiculo(Carro carro){
        if(this.carros.size() < this.vagas){
            this.carros.add(carro);
            System.out.println("Carro adicionado: " + carro.getPlaca());
        }
        else{
            System.out.println("Estacionamento cheio. Não é possível adicionar mais carros.");
        }
    }

    public void sairVeiculo(String placa){
        int carroARemover = -1;
        for(int i = 0; i < this.carros.size(); i++){
            Carro carro = this.carros.get(i);
            if(carro.getPlaca().equals(placa)){
                carroARemover = i;
                break;
            }
        }
        if (carroARemover != -1) {
            Carro carroRemovido = this.carros.remove(carroARemover);
            System.out.println("** Carro removido **");
            System.out.println("Modelo: " + carroRemovido.getModelo());
            System.out.println("Placa: " + carroRemovido.getPlaca());
            System.out.println("Cor: " + carroRemovido.getCor());
        } else {
            System.out.println("Carro não encontrado.");
        }
    }

    public void vagas(){
        int vagasDisponiveis = this.vagas - this.carros.size();
        System.out.println("Vagas disponíveis: " + vagasDisponiveis);
    }

    public void relatorio(){
        System.out.println("Carros no estacionamento: ");
        for(Carro carro : this.carros){
            System.out.println("Modelo: " + carro.getModelo()+ ", Placa: " + carro.getPlaca() + ", Cor: " + carro.getCor());
        }
        System.out.println("Total de carros estacionados: " + this.carros.size());
        System.out.println("Valor total arrecadado: " + this.carros.size() * this.valorPeriodo);
    }
}