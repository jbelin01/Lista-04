package br.edu.up.views;

import java.util.Scanner;

import br.edu.up.controller.ReservaController;

public class TelaPrincipal {
    ReservaController controller = new ReservaController();

    public void mostrarMenu() {
        System.out.println("** Bem-Vindo ao Terminal **");
        System.out.println("1. Adicioanr Evento");
        System.out.println("2. Listar Evento");
        System.out.println("3. Excluir Evento");
        System.out.println("4. Adicionar Reserva");
        System.out.println("5. Listar Reserva");
        System.out.println("6. Excluir Reserva");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void mostrar() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarMenu();
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":
                
                    break;
                case "7":
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }

    }

}

// Uma empresa de eventos precisa de um sistema que lhe permita gerenciar
// eventos e reservas. Para
// cada evento ela precisa registrar nome, data, local, lotação máxima do
// evento, quantidade de ingressos
// vendidos e o preço do ingresso. Os clientes podem realizar a reserva para o
// evento informando nome do
// responsável pela reserva e quantidade de pessoas. Na reserva ainda deve ser
// registrado a data e o
// valor total da reserva. O sistema deve ser desenvolvido no padrão
// arquitetural Model-View-Controller
// (MVC), possuir uma classe Programa que inicia a execução do software e um
// menu que permita ao
// usuário realizar as operações de inclusão, alteração, listagem e exclusão de
// eventos e reservas
