package br.edu.up;

import java.util.Scanner;
import java.text.DecimalFormat;

import br.edu.up.models.*;
// import br.edu.up.controls.*;

public class program {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Ponto ponto1 = new Ponto();
        
        System.out.println("informe o primeiro pronto: ");
        System.out.print("informe o valor X pronto: ");
        ponto1.setX(leitor.nextDouble());
        System.out.print("informe o valor Y pronto: ");
        ponto1.setY(leitor.nextDouble());
        System.out.println("O ponto criado é: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
        
        Ponto ponto2 = new Ponto();
        
        System.out.println("informe o segundo pronto");
        System.out.print("informe o valor X pronto: ");
        ponto2.setX(leitor.nextDouble());
        System.out.print("informe o valor Y pronto: ");
        ponto2.setY(leitor.nextDouble());
        System.out.println("O ponto criado é: (" + ponto2.getX() + ", " + ponto2.getY() + ")");
        
        double distancia = ponto1.CalcularDistancia(ponto2);

        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("A distância entre os pontos é: " + formato.format(distancia));

        leitor.close();
    }
}
