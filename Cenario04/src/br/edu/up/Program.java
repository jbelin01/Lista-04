package br.edu.up;

import br.edu.up.controls.*;
import br.edu.up.models.*;
import br.edu.up.views.*;

public class Program {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        EstacionamentoView view = new EstacionamentoView();
        EstacionamentoController controller = new EstacionamentoController(estacionamento, view);
        controller.iniciar();
    }
}
