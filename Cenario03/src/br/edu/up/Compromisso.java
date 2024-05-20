package br.edu.up;

public class Compromisso {

    private String pessoa;

    private String local;

    private String assunto;

    private int hora;


    public Compromisso(String pessoa, String local, String assunto, int hora) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.hora = hora;
    }


    public String getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAssunto() {
        return this.assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    @Override
    public String toString() {
        
        return "Comprimisso: " + this.pessoa + "| local: " + this.local + "| Assunto: " + this.assunto + "| Hora: " + this.hora;
    }

    
}
// reiniciar git