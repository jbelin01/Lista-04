package br.edu.up.models;

public class Ponto {
    private Double x;
    private Double y;
    


    public Ponto() {
    }

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return this.y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double CalcularDistancia(Ponto ponto){
        double difX = ponto.getX() - this.x;
        double difY = ponto.getY() - this.y;
        
        double distancia = Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
        
        return distancia;
         
    }
}
