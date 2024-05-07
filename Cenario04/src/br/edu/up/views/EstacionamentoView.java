package br.edu.up.views;

import java.util.Scanner;

import br.edu.up.models.Carro;

public class EstacionamentoView {
    public void mostrarMenu() {
        System.out.println("** Bem Vindo ao Estacionamento **");
        System.out.println("1. Adicionar carro");
        System.out.println("2. Remover carro");
        System.out.println("3. Verificar vagas");
        System.out.println("4. Emitir relatório");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public Carro getCarroInfo() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o modelo do carro: ");
        String modelo = leitor.nextLine();
        System.out.print("Digite a placa do carro: ");
        String placa = leitor.nextLine();
        System.out.print("Digite a cor do carro: ");
        String cor = leitor.nextLine();
        return new Carro(modelo, placa, cor);
       
    }

    public String getPlaca() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a placa do carro: ");
        return leitor.nextLine();
    }
    
}
