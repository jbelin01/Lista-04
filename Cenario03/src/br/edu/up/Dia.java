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

    public Compromisso consultarCompromisso(int hora){

        return compromissos[hora];

    }
    public String listarCompromissos(int hora){
        String retorno = "";
        for (int i = 0; i < compromissos.length; i++) {
            Compromisso c = compromissos[i];
            if (c!= null && c.getHora() == hora) {
                retorno += hora + " " + c.getAssunto() + "\n";
            } else {
                retorno += hora + " Não tem compromisso! \n";
            }
        }
        return retorno;
    }
    




// reiniciar git

    
}
