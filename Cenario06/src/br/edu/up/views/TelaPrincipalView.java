package br.edu.up.views;

import java.lang.ModuleLayer.Controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.edu.up.controls.TrafegoController;
import br.edu.up.models.Aeronave;
import br.edu.up.models.Comandante;
import br.edu.up.models.Comissario;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Passagem;

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
                    getPassageiro();
                    break;
                case "2":
                    geTripulacao();
                    break;
                case "3":
                    getAeronave();
                    break;
                case "4":
                    System.out.println("Passageiros:");
                    controller.exibirPassageiros();
                    break;
                case "5":
                    System.out.println("Tripulantes:");
                    controller.exibirTripulantes();
                    break;
                case "6":
                    System.out.println("Aeronaves:");
                    controller.exibirAeronaves();
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

    public void getPassageiro() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("** ADICIONAR PASSAGEIRO **");
        System.out.println("-------------------------------");
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
        String resultado = controller.incluirPassageiro(passageiro);
        System.out.println(resultado);

    }

    public void menu2() {
        System.out.println("-------------------------------");
        System.out.println("Qual deseja incluir?");
        System.out.println("1. Comissario");
        System.out.println("2. Comandante");
        System.out.print("Escolha uma das opções: ");
    }

    public void geTripulacao() {
        Scanner leitor = new Scanner(System.in);
        menu2();
        int vlr = leitor.nextInt();
        if (vlr == 1) {
            /* Comissario */
            System.out.println("-------------------------------");
            System.out.println("** ADICIONAR COMISSARIO **");
            System.out.println("-------------------------------");
            System.out.print("Digite o nome do comissario: ");
            String nome = leitor.next();

            System.out.print("Digite o RG do comissario: ");
            String rg = leitor.next();

            System.out.print("Digite o RAB do comissario: ");
            String identificadorAeronautica = leitor.next();

            System.out.print("Digite a matricula: ");
            String matricula = leitor.next();

            System.out.println("Digite os idiomas fluentes: ");
            String idioma = leitor.next();
            String[] idiomas = new String[] { idioma };

            Comissario comissario = new Comissario(nome, rg, identificadorAeronautica, matricula, idiomas);
            String result = controller.incluirComissario(comissario);
            System.out.println(result);

        } else if (vlr == 2) {
            /* Comandante */
            System.out.println("-------------------------------");
            System.out.println("** ADICIONAR COMANDANTE **");
            System.out.println("-------------------------------");
            System.out.print("Digite o nome do comandante: ");
            String nome = leitor.next();

            System.out.print("Digite o RG do comandante: ");
            String rg = leitor.next();

            System.out.print("Digite o RAB do comandante: ");
            String identificadorAeronautica = leitor.next();

            System.out.print("Digite a matricula: ");
            String matricula = leitor.next();

            System.out.println("Digite o total de Horas de voo");
            int totalHorasVoo = leitor.nextInt();

            Comandante comandante = new Comandante(nome, rg, identificadorAeronautica, matricula, totalHorasVoo);
            String re = controller.incluirComandante(comandante);
            System.out.println(re);
        }

    }

    public void getAeronave() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("** ADICIONAR AERONAVE **");
        System.out.println("-------------------------------");

        System.out.println("Digite o código da aeronave: ");
        String codigo = leitor.nextLine();

        System.out.println("Digite o tipo da aeronave: ");
        String tipo = leitor.nextLine();

        System.out.println("Digite a quantidade de acentos: ");
        int quantidadeAssentos = leitor.nextInt();

        Aeronave aeronave = new Aeronave(codigo, tipo, quantidadeAssentos);
        String r = controller.incluirAeronave(aeronave);
        System.out.println(r);
    }

}
