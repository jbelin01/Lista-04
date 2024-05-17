package br.edu.up;

public class Ano {
 
    private int ano;

    private boolean bissexto;

    Mes[] meses = new Mes[12];


    public Ano(int ano, boolean bissexto, Mes[] meses) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = meses;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBissexto() {
        return this.bissexto;
    }

    public boolean getBissexto() {
        return this.bissexto;
    }

    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }

    public Mes[] getMeses() {
        return this.meses;
    }

    public void setMeses(Mes[] meses) {
        this.meses = meses;
    }
    
    public void adicionarMes(Mes mes){
        for(int i = 0; i < meses.length; i++){
            if(meses[i] == null){
                meses[i] = mes;
                break;
                }
        }
    }

    // para testar
}
