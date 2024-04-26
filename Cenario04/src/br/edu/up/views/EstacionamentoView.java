package br.edu.up.views;

import br.edu.up.models.*;
import java.util.Scanner;

public class EstacionamentoView {
    private Scanner scanner;

    public EstacionamentoView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("### MENU ###");
        System.out.println("1. Entrar veículo");
        System.out.println("2. Sair veículo");
        System.out.println("3. Sair do programa");
    }
    
    public String solicitarOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextLine();
    }
    public String solicitarPlaca() {
        System.out.print("Informe a placa do veículo: ");
        return scanner.nextLine();
    }

    public Veiculo solicitarDadosEntrada() {
        System.out.print("Informe o modelo do veículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Informe a cor do veículo: ");
        String cor = scanner.nextLine();
        return new Veiculo(modelo, cor);
    }


}

