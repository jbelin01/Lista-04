package br.edu.up.Controller;

import br.edu.up.Models.*;

public class EventoController {
    
    private Evento[] eventos;

    private Reserva[] reservas;

    public EventoController(Evento[] eventos, Reserva[] reservas) {

        this.eventos = eventos;
        this.reservas = reservas;

    }

    public void adicionaEvento(Evento evento) {

        for (int i = 0; i < eventos.length; i++) {

            if (eventos[i] == null) {

                eventos[i] = evento;
                break;

            }
        }
    }

    public void alterarEvento(int indice, Evento evento) {

        if (indice >= 0 && indice < eventos.length && eventos[indice] != null) {

            eventos[indice] = evento;

        }
    }


    public void excluirEvento(int indice) {

        if (indice >= 0 && indice < eventos.length && eventos[indice] != null) {

            eventos[indice] = null;

        }
    }

    public void listarEventos() {

        for (int i = 0; i < eventos.length; i++) {

            if (eventos[i] != null) {

                System.out.println((i + 1) + ". " + eventos[i].getNome());

            }
        }
    }

    public void adicionarReserva(Reserva reserva) {

        for (int i = 0; i < reservas.length; i++) {

            if (reservas[i] == null) {

                reservas[i] = reserva;
                break;

            }
        }
    }

    public void alterarReserva(int indice, Reserva reserva) {

        if (indice >= 0 && indice < reservas.length && reservas[indice] != null) {

            reservas[indice] = reserva;

        }
    }

    public void excluirReserva(int indice) {

        if (indice >= 0 && indice < reservas.length && reservas[indice] != null) {

            reservas[indice] = null;

        }
    }

    public void listarReservas() {
        
        for (int i = 0; i < reservas.length; i++) {

            if (reservas[i] != null) {

                System.out.println((i + 1) + ". " + reservas[i].getResponsavel());

            }
        }
    }
}
