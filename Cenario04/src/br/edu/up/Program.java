package br.edu.up;

import br.edu.up.controls.*;
import br.edu.up.views.*;

public class Program {
    public static void main(String[] args) {
        Estacionamento model = new Estacionamento();
        EstacionamentoView view = new EstacionamentoView();
        EstacionamentoController controller = new EstacionamentoController(model, view);
        
        controller.iniciar();
    }
}
