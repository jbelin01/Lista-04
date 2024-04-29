package br.edu.up.controls;

import br.edu.up.models.Estacionamento;
import br.edu.up.models.Carro;
import br.edu.up.views.*;


public class EstacionamentoController {
    public Estacionamento estacionamento;
    public EstacionamentoView view;
    public Carro veiculo;

    public EstacionamentoController(Estacionamento estacionamento, EstacionamentoView view)  {
        this.estacionamento = estacionamento;
        this.view = view;
        
    }

    public void iniciar() {
        while (true) {
            int opcao = view.mostrarMenu();
            if (opcao == 1){
                estacionamento.entrarVeiculo(veiculo);
            } else if (opcao == 2) {
                estacionamento.sairVeiculo(veiculo);
            } else if (opcao == 3) {
                estacionamento.Relatorio(veiculo);
            }else if (opcao == 4){
                break;
            }
        }
    }   
    // public void iniciar() {
    //     while (true) {
    //         int opcao = view.mostrarMenu();
    //         if (opcao == 1){
    //             Carro veiculo = view.getCarroInfo();
    //             estacionamento.entrarVeiculo(veiculo);
    //         } else if (opcao == 2) {
    //             String placa = view.getPlaca();
    //             estacionamento.sairVeiculo(placa);
    //         } else if (opcao == 3) {
    //             estacionamento.Relatorio();
    //         }else if (opcao == 4){
    //             break;
    //         }
    //     }
    // }
}

