package br.edu.up.Views;

import br.edu.up.Models.Evento;
import br.edu.up.Models.Reserva;
import br.edu.up.Controller.*;

public class EventoView {

    public void exibirEventos(EventoView[] eventos) {

        System.out.println("Lista de eventos:");

        for (int i = 0; i < eventos.length; i++) {

            Evento e = eventos[i];

            if (eventos[i]!= null) {
                System.out.println((i + 1) + ". " + e.getNome() + " - " + e.getData());
            }
            
        }
    }

    public void exibirEvento(EventoView evento) {
        
        System.out.println("Nome: " + evento.getNome());

        System.out.println("Data: " + evento.getData());

        System.out.println("Local: " + evento.getLocal());

        System.out.println("Lotação máxima: " + evento.getLotacaoMaxima());
        
        System.out.println("Ingressos vendidos: " + evento.getIngressosVendidos());

        System.out.println("Preço do ingresso: " + evento.getPrecoIngresso());

    }

    public void exibirReservas(Reserva[] reservas) {

        System.out.println("Lista de reservas:");

        for (int i = 0;i < reservas.length; i++) {

            if (reservas[i] != null) {
                System.out.println((i + 1) + ". " + reservas[i].getResponsavel());
            }
            
        }
    }

    public void exibirReserva(Reserva reserva) {

        System.out.println("Responsável: " + reserva.getResponsavel());

        System.out.println("Quantidade de pessoas: " + reserva.getQuantidadePessoas());

        System.out.println("Data da reserva: " + reserva.getDataReserva());

        System.out.println("Valor total: " + reserva.getValorTotal());

        System.out.println("Evento: " + reserva.getEvento().getNome());
        
        
    }
}
