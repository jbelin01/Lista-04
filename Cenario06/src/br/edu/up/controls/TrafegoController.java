package br.edu.up.controls;

import br.edu.up.models.Aeronave;
import br.edu.up.models.Comandante;
import br.edu.up.models.Comissario;
import br.edu.up.models.Passageiro;
import br.edu.up.models.Tripulante;

public class TrafegoController {

    public Passageiro[] passageiros = new Passageiro[2];
    public Tripulante[] tripulantes = new Tripulante[2];
    public Aeronave[] aeronaves = new Aeronave[2];

    /* INCLUIR NOS VETORES */

    public String incluirPassageiro(Passageiro passageiro) {
        boolean adicionado = false;
        for (int i = 0; i < passageiros.length; i++) {
            if (passageiros[i] == null) {
                passageiros[i] = passageiro;
                adicionado = true;
                break;
            }
        }
        if (adicionado) {
            return "Passageiro adicionado com sucesso!";
        } else {
            return "Não foi possível adicionar o passageiro.";
        }

    }

    public String incluirComissario(Comissario comissario) {
        boolean adicionado = false;
        for (int i = 0; i < tripulantes.length; i++) {
            if (tripulantes[i] == null) {
                tripulantes[i] = comissario;
                adicionado = true;
                break;
            }
        }
        if (adicionado) {
            return "Tripulante adicionado com sucesso!";
        } else {
            return "Não foi possível adicionar o Tripulante.";
        }
    }

    public String incluirComandante(Comandante comandante) {
        boolean adicionado = false;
        for (int i = 0; i < tripulantes.length; i++) {
            if (tripulantes[i] == null) {
                tripulantes[i] = comandante;
                adicionado = true;
                break;
            }
        }
        if (adicionado) {
            return "Tripulação adicionado com sucesso!";
        } else {
            return "Não foi possível adicionar o Tripulação.";
        }
    }

    public String incluirAeronave(Aeronave aeronave) {
        boolean adicionado = false;
        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i] == null) {
                aeronaves[i] = aeronave;
                adicionado = true;
                break;
            }
        }
        if (adicionado) {
            return "Aeronave adicionado com sucesso!";
        } else {
            return "Não foi possível adicionar o Aeronave.";
        }
    }

    /* EXIBIR OS VETORES */

    public void exibirPassageiros() {
        int i = 0;
        for (i = 0; i < passageiros.length; i++) {
            if (passageiros[i] != null) {
                Passageiro p = passageiros[i];
                System.out.println(p);
                break;
            }
        }
    }

    public void exibirTripulantes() {
        for (int i = 0; i < tripulantes.length; i++) {
            if (tripulantes[i] != null) {
                Tripulante t = tripulantes[i];
                System.out.println(t);
                break;
            }
        }
    }

    public void exibirAeronaves() {
        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i] != null) {
                Aeronave a = aeronaves[i];
                System.out.println(a);
                break;
            }
        }
    }

}
