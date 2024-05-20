package br.edu.up.views;

import java.util.ArrayList;
import br.edu.up.models.Carro;

public class Estacionamento {

    private Carro[] carros = new Carro[10];
    private int vagas = 10;
    private double valorPeriodo = 5.0;

    public Estacionamento(Carro[] carro){
        this.carros = carro;
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

    public void relatorio(String periodo){
        int totalCarrosPeriodo = 0;
        double valorArrecadadoPeriodo = 0.0;
        System.out.println("Carros no estacionamento no período da " + periodo);
        for(Carro carro : this.carros){
            if(carro.getPeriodo().equals(periodo)){
                System.out.println("Modelo: " + carro.getModelo()+ ", Placa: " + carro.getPlaca() + ", Cor: " + carro.getCor());
                totalCarrosPeriodo++;
                valorArrecadadoPeriodo += this.valorPeriodo;
                System.out.println("Total de carros estacionados no período " + periodo + ": " + totalCarrosPeriodo);
                System.out.println("Valor total arrecadado no período " + periodo + ": " + valorArrecadadoPeriodo);
            }
        }
        System.out.println("Total de carros estacionados: " + this.carros.size());
        System.out.println("Valor total arrecadado: " + this.carros.size() * this.valorPeriodo);
    }
}
