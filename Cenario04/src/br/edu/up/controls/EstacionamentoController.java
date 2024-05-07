package br.edu.up.controls;


import java.util.Scanner;
import br.edu.up.models.*;
import br.edu.up.views.*;

public class EstacionamentoController {

    public Estacionamento views;
    public EstacionamentoView view;


    public EstacionamentoController(Estacionamento views, EstacionamentoView view) {
        this.views = views;
        this.view = view;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            view.mostrarMenu();
            String opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    Carro carro = view.getCarroInfo();
                    views.entrarVeiculo(carro);
                    break;
                case "2":
                    String placa = view.getPlaca();
                    views.sairVeiculo(placa);
                    break;
                case "3":
                    views.vagas();
                    break;
                case "4":
                    views.relatorio();
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
}