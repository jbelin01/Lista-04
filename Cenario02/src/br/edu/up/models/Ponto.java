package br.edu.up.models;

public class Ponto {
    public Double x1;
    public Double y1;
    public Double x2;
    public Double y2;


    public Ponto() {
    }

    public Ponto(Double x1, Double y1, Double x2, Double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return this.x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getY1() {
        return this.y1;
    }

    public void setY1(Double y1) {
        this.y1 = y1;
    }

    public Double getX2() {
        return this.x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }

    public Double getY2() {
        return this.y2;
    }

    public void setY2(Double y2) {
        this.y2 = y2;
    }

    public Double SomarPontos(Double x1, Double y1, Double x2, Double y2){
        double difX = x2 - x1;
        double difY = y2 - y1;
        
        double XSquare = Math.pow(difX, 2);
        double YSquare = Math.pow(difY, 2);
        
        double soma = XSquare + YSquare;

        double distancia = Math.sqrt(soma);
        
        return distancia;   
    }
}
