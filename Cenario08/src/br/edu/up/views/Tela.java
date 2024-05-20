package br.edu.up.views;

import java.util.Scanner;

public class Tela {
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
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }

    }

    public void mostrarMenu() {
        System.out.println("** Bem-Vindo ao  **");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }
}
