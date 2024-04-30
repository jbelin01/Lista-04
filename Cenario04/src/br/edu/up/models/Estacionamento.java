package br.edu.up.models;

import java.util.Scanner;
import br.edu.up.models.Carro;

public class Estacionamento {
    public Carro[] carrosEstacionados = new Carro[10];

    public void entrarVeiculo(Carro veiculo) {
        Scanner scanner = new Scanner(System.in);
      
        for (int i = 1; i < carrosEstacionados.length; i++) {
            if (carrosEstacionados[i] == null) {
                System.out.print("Informe a placa do carro: ");
                String placa = scanner.next();
                System.out.print("Informe o modelo do carro: ");
                String modelo = scanner.next();
                System.out.print("Informe a cor do carro: ");
                String cor = scanner.next();
                carrosEstacionados[i] = new Carro(placa, modelo, cor);
                System.out.println("Carro estacionado na vaga " + i);
                break;
            }
        }
        scanner.close();
    }

    public void sairVeiculo(Carro veiculo) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < carrosEstacionados.length; i++) {
            if (carrosEstacionados[i] != null && carrosEstacionados[i].getPlaca().equals(veiculo.placa)) {
                carrosEstacionados[i] = null;
                System.out.println("Carro retirado da vaga " + i);
                break;
            }
        }
        System.out.println("Carro não encontrado");

        scanner.close();
    }

    public void Relatorio(Carro veiculo){
        int vagas = carrosEstacionados.length;
        System.out.println("Carros estacionados: " + carrosEstacionados);
        System.out.println("Vagas disponíveis: " + (10 - vagas));
    }

}
