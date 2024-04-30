package br.edu.up;

public class Dia {

    private int diaMes; 
    
    Compromisso[] compromissos = new Compromisso[24];


    public Dia() {
    }


    public Dia(int diaMes) {
        this.diaMes = diaMes;
    }
    
    

    public int getDiaMes() {
        return this.diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public Compromisso[] getCompromissos() {
        return this.compromissos;
    }

    public void setCompromissos(Compromisso[] compromissos) {
        this.compromissos = compromissos;
    }

    public void adicionarCompromisso(Compromisso compromisso){
        compromissos[compromisso.getHora()] = compromisso;
    }

    public void excluirCompromisso(int hora){
        compromissos[hora] = null;
    }

    public Compromisso[] listarCompromissos(){
        return compromissos;
    }

    public Compromisso consultarCompromisso(int hora){

        return compromissos[hora];

    }


    
}
