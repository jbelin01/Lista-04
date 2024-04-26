package br.edu.up.controls;

import br.edu.up.models.Estacionamento;
import br.edu.up.models.Veiculo;
import br.edu.up.views.*;


public class EstacionamentoController {
    public Estacionamento estacionamento;
    public EstacionamentoView view;

    public EstacionamentoController(Estacionamento estacionamento, EstacionamentoView view) {
        this.estacionamento = estacionamento;
        this.view = view;
    }

    public void iniciar() {
        while (true) {
            view.mostrarMenu();
            String opcao = view.solicitarOpcao();
            switch (opcao) {
                case "1":
                    entrarVeiculo();
                    break;
                case "2":
                    sairVeiculo();
                    break;
                case "3":
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void entrarVeiculo() {
        String placa = view.solicitarPlaca();
        Veiculo veiculo = view.solicitarDadosEntrada();
        if (estacionamento.entrarVeiculo(veiculo, placa)) {
            System.out.println("Veículo estacionado com sucesso!");
        } else {
            System.out.println("Estacionamento lotado!");
        }
    }

    public void sairVeiculo() {
        Veiculo veiculo = view.solicitarDadosEntrada();
        if (estacionamento.sairVeiculo(veiculo)) {
            System.out.println("Veículo retirado do estacionamento.");
        } else {
            System.out.println("Veículo não encontrado no estacionamento.");
        }
    }
    
}

