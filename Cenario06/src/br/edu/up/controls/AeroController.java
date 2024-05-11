package br.edu.up.controls;

import java.util.Scanner;
import br.edu.up.views.Voo;
import br.edu.up.views.VooView;

public class AeroController{
    public VooView views;
    public Voo voo;


    public AeroController(VooView views, Voo voo) {
        this.views = views;
        this.voo = voo;
    }
   
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            views.mostrarMenu();
            String opcao = scanner.nextLine();
        
            switch (opcao) {
                case "1":
                    voo.adicionarPassageiro();
                    break;
                case "2":
                    voo.adicionarTripulacao();
                    break;
                case "3":
                    voo.acentos();
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

   
    
}
