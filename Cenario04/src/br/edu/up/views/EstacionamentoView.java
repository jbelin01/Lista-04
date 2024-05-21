package br.edu.up.views;

import java.util.Scanner;

import br.edu.up.models.Carro;

public class EstacionamentoView {

    private Carro[] carros = new Carro[10];
    private int vagas = 10;
    private double valorPeriodo = 5.0;
    private int numCarros = 0;

    public EstacionamentoView() {

    }

    public void mostrar() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarMenu();
            String opcao = scanner.nextLine();
            switch (opcao) {

                case "1":
                    entrarVeiculo();
                    break;
                case "2":
                    String placa = getPlaca();
                    sairVeiculo(placa);
                    break;
                case "3":
                    vagas();
                    break;
                case "4":
                    System.out.println("Digite o período (manha, tarde, noite): ");
                    String periodo = scanner.nextLine();
                    relatorio(periodo);
                    break;
                case "5":
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
    }

    public void mostrarMenu() {
        System.out.println("** Bem Vindo ao Estacionamento **");
        System.out.println("1. Adicionar carro");
        System.out.println("2. Remover carro");
        System.out.println("3. Verificar vagas");
        System.out.println("4. Emitir relatório");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public void entrarVeiculo() {
        if (this.numCarros < this.vagas) {
            Carro carro = getCarroInfo();
            this.carros[this.numCarros] = carro;
            this.numCarros++;
            System.out.println("Carro adicionado: " + carro.getPlaca());
        } else {
            System.out.println("Estacionamento cheio. Não é possível adicionar mais carros.");
        }
    }

    public void sairVeiculo(String placa) {
        int carroARemover = -1;
        for (int i = 0; i < this.numCarros; i++) {
            Carro carro = this.carros[i];
            if (carro.getPlaca().equals(placa)) {
                carroARemover = i;
                break;
            }
        }
        if (carroARemover != -1) {
            Carro carroRemovido = this.carros[carroARemover];
            System.out.println("** Carro removido **");
            System.out.println("Modelo: " + carroRemovido.getModelo());
            System.out.println("Placa: " + carroRemovido.getPlaca());
            System.out.println("Cor: " + carroRemovido.getCor());
        } else {
            System.out.println("Carro não encontrado.");
        }
    }

    public void vagas() {
        int vagasDisponiveis = (this.vagas - this.numCarros);
        System.out.println("Vagas disponíveis: " + vagasDisponiveis);
    }

    public void relatorio(String periodo) {
        int totalCarrosPeriodo = 0;
        double valorArrecadadoPeriodo = 0.0;
        System.out.println("Carros no estacionamento no período da " + periodo);
        for (int i = 0; i < this.numCarros; i++) {
            Carro carro = this.carros[i];
            if (carro.getPeriodo().equals(periodo)) {
                System.out.println(
                        "Modelo: " + carro.getModelo() + ", Placa: " + carro.getPlaca() + ", Cor: " + carro.getCor());
                totalCarrosPeriodo++;
                valorArrecadadoPeriodo += this.valorPeriodo;
            }
        }
        System.out.println("Total de carros estacionados no período " + periodo + ": " + totalCarrosPeriodo);
        System.out.println("Valor total arrecadado no período " + periodo + ": " + valorArrecadadoPeriodo);
        System.out.println("\nTotal de carros estacionados: " + this.numCarros);
        System.out.println("Valor total arrecadado: " + this.numCarros * this.valorPeriodo);
    }


    public Carro getCarroInfo() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o modelo do carro: ");
        String modelo = leitor.nextLine();
        System.out.print("Digite a placa do carro: ");
        String placa = leitor.nextLine();
        System.out.print("Digite a cor do carro: ");
        String cor = leitor.nextLine();
        System.out.println("Escolha o período (manha, tarde, noite): ");
        String periodo = leitor.nextLine();
        return new Carro(modelo, placa, cor, periodo);

    }

    public String getPlaca() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a placa do carro: ");
        return leitor.nextLine();
    }
}
