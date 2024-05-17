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

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        for (Mes mes : meses) {
            if (mes != null && mes.getNome().equals(nomeMes)) {
                mes.excluirCompromisso(diaMes, hora);
                break;
            }
        }
    }

    public String listarCompromissos(String nomeMes) {
        for (Mes mes : meses) {
            if (mes != null && mes.getNome().equals(nomeMes)) {
                return mes.listarCompromissos();
            }
        }
        return "Mês não encontrado.";
    }

    public String listarCompromissos(){
        String retorno = "";
        for (Mes mes : meses) {
            if (mes != null) {
                retorno += mes.listarCompromissos() + "\n";
                }
            }
            return retorno;
    }

    
}
