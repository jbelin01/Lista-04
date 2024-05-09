package br.edu.up.views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import br.edu.up.models.Aeronave;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Passagem;
import br.edu.up.models.Pessoa;
import br.edu.up.models.Tripulacao;

public class Voo {

    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static ArrayList<Aeronave> aenavez = new ArrayList<>();

    public void adicionarPassageiro(){
        Passageiro passageiro = VooView.getPassageiro();
        pessoas.add(passageiro);
        System.out.println("Passageiro adicionado com sucesso!");

    }

    public void adicionarTripulacao(){
        Tripulacao tripulacao = VooView.geTripulacao();        
        pessoas.add(tripulacao);
        System.out.println("Tripulante adicionado com sucesso!");
    }

    public void acentos(){

    }

    
}
