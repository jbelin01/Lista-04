package br.edu.up.views;

import java.util.ArrayList;

import br.edu.up.models.*;


public class Voo {

    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static ArrayList<Aeronave> aeronaves = new ArrayList<>();

    public void adicionarPassageiro() {
        Passageiro passageiro = VooView.getPassageiro();
        pessoas.add(passageiro);
        System.out.println("Passageiro adicionado com sucesso!");

    }

    public void adicionarTripulacao() {
        Tripulacao tripulacao = VooView.geTripulacao();
        pessoas.add(tripulacao);
        System.out.println("Tripulante adicionado com sucesso!");
    }

    public void acentos(){  
    //     for (Aeronave aeronave : aeronaves) {
    //         System.out.println("Aeronave: " + aeronave.getCodigo());
    //         for (int i = 0; i < aeronave.getQuantidadeAssentos(); i++) {
    //             if (aeronave.assentosDisponiveis[i]) {
    //                 System.out.println("Assento " + (i+1) + " está disponível");
    //             }
    //         }
    //     }
    }
    
}
 