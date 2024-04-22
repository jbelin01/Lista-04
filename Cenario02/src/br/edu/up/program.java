package br.edu.up;

import java.util.Scanner;

import br.edu.up.models.*;
import br.edu.up.controls.*;

public class program {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Ponto ponto = new Ponto();
        
        System.out.println("informe o ponto x1");
        ponto.setX1(leitor.nextDouble());

        System.out.println("informe o ponto y1");
        ponto.setY1(leitor.nextDouble());
        
        System.out.println("informe o ponto x2");
        ponto.setX2(leitor.nextDouble());

        System.out.println("informe o ponto y2");
        ponto.setY2(leitor.nextDouble());

        System.out.println("A soma dos dois pontos são: " + Ponto.distancia(ponto.getX1(), Ponto.getX2, Ponto.getY1, Ponto.getY2));

        leitor.close();
    }
}

