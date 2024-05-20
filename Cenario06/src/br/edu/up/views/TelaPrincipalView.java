package br.edu.up.views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import br.edu.up.controls.TrafegoController;
import br.edu.up.models.Aeronave;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Passagem;
import br.edu.up.models.Pessoa;
import br.edu.up.models.Tripulante;

public class TelaPrincipalView {

    TrafegoController controller = new TrafegoController();

    public void mostrar() {

        // Nâo pode
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarMenu();
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    adicionarPassageiro();
                    break;
                case "2":
                    adicionarTripulacao();
                    break;
                case "3":
                    adicionarAeronave();
                    break;
                case "4":
                    System.out.println("\nPassageiro:");
                    for (Pessoa pessoa : TrafegoController.passageiro) {
                        System.out.println(pessoa);
                    }
                    break;
                case "5":
                    System.out.println("\nTripulante:");
                    break;
                case "6":
                    System.out.println("\nAeronave:");
                    for (Aeronave aeronave : TrafegoController.aeronaves) {
                        System.out.println(aeronave);
                    }
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

    public void adicionarPassageiro() {
        Passageiro passageiro = getPassageiro();
        TrafegoController.passageiro.add(passageiro);
        System.out.println("Passageiro adicionado com sucesso!");

    }

    public void adicionarTripulacao() {
        Tripulante tripulacao = geTripulacao();
        TrafegoController.tripulante.add(tripulacao);
        System.out.println("Tripulante adicionado com sucesso!");
    }

    public void adicionarAeronave() {
        Aeronave aeronave = getAeronave();
        TrafegoController.aeronaves.add(aeronave);
        System.out.println("Aeronave adicionada com sucesso!");
    }

    public void mostrarMenu() {
        System.out.println("** Bem-Vindo ao Terminal **");
        System.out.println("1. Adicionar passageiro");
        System.out.println("2. Adicionar tripulação");
        System.out.println("3. Adicionar aeronave");
        System.out.println("4. Listar passageiros");
        System.out.println("5. Listar tripulantes");
        System.out.println("6. Listar aeronaves");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static Passageiro getPassageiro() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do passageiro: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o RG do passageiro: ");
        String rg = leitor.nextLine();

        System.out.print("Digite o identificador de bagagem do passageiro: ");
        String identificadorBagagem = leitor.nextLine();

        System.out.print("Digite o número do acento da passagem do passageiro: ");
        String numAcento = leitor.nextLine();

        System.out.print("Digite a classe do acento da passagem do passageiro: ");
        String classe = leitor.nextLine();

        System.out.print("Digite a data do voo (dd/MM/yyyy HH:mm): ");
        String dataVooStr = leitor.nextLine();

        // Em Java, a classe "SimpleDateFormat" é usada para formatar e analisar datas
        // em texto. O método "parse(String)" é usado para analisar texto de uma string
        // para produzir um Date.

        Date dataVoo = null;
        try {
            dataVoo = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataVooStr);
        } catch (ParseException e) {
            System.out.println("Erro ao analisar a data. Certifique-se de que está no formato Corretamente!!!");
        }

        Passagem passagem = new Passagem(numAcento, classe, dataVoo);
        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, passagem);

        return passageiro;
    }

    public static Tripulante geTripulacao() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do Tripulante: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o RG do Tripulante: ");
        String rg = leitor.nextLine();

        System.out.print("Digite o RAB do tripulante: ");
        String identificadorAeronautica = leitor.nextLine();

        System.out.print("Digite a matricula: ");
        String matricula = leitor.nextLine();
        String[] matriculas = new String[]{matricula};

        Tripulante tripulacao = new Tripulante(nome, rg, identificadorAeronautica, matriculas);

        return tripulacao;
    }

    public static Aeronave getAeronave() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código da aeronave: ");
        String codigo = leitor.nextLine();
        String[] codigos = new String[]{codigo};

        System.out.println("Digite o tipo da aeronave: ");
        String tipo = leitor.nextLine();

        System.out.println("Digite a quantidade de acentos: ");
        int quantidadeAssentos = leitor.nextInt();

        Aeronave aeronave = new Aeronave(codigos, tipo, quantidadeAssentos);

        return aeronave;
    }

}
