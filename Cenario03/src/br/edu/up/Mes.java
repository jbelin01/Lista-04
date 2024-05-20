package br.edu.up;

import java.util.List;

public class Mes {

    private String nome;

    private int qtdDias;

    Dia[] dias = new Dia[qtdDias];


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdDias() {
        return this.qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }


    public Mes(String nome, int qtdDias) {
        this.nome = nome;
        this.qtdDias = qtdDias;
    }

    public void adicionarDia(Dia dia){
        for (int i = 0; i < dias.length; i++) {
            if(dias[i] == null){
                dias[i] = dia;
                break;
            }
        }
    }

    public void adicionarCompromisso(Compromisso compromisso, int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdDias) {
            dias[diaMes - 1].adicionarCompromisso(compromisso);
        } else {
            System.out.println("Erro: Dia do mês inválido.");
        }
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes){

        for (int i = 0; i < dias.length; i++) {

            if(dias[i] != null){
                if(dias[i].getDiaMes() == diaMes){
                    Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);
                    dias[i].adicionarCompromisso(compromisso);
                }
            }
            
        }


    }


    public void excluirCompromisso(int diaMes, int hora){

        for (int i = 0; i < dias.length; i++){
            
                if(dias[i].getDiaMes() == diaMes){

                    dias[i].excluirCompromisso(hora);

                }
            

        }
         
    }


    // public String listarCompromissos(int diaMes){
        

    //     String retorno = "";

    //    for (int i = 0; i < dias.length; i++) {

    //     Dia  d = dias[i];
        
            
    //      if(d.getDiaMes() == diaMes ){
    //            retorno += diaMes + "" + c.getAssunto() + "\n";
    //         }
    //         else{
    //             retorno +=  diaMes + " Não tem compromisso! \n";
    //         }
    //     }
    //     return retorno;
    // }
    public String listarCompromissos(int diaMes){
    String retorno = "";

    for (int i = 0; i < dias.length; i++) {
        Dia d = dias[i];

        if(d.getDiaMes() == diaMes ){
            List<Compromisso> compromissosDoDia = d.getCompromissos[];
            for (Compromisso c : compromissosDoDia) {
                retorno += diaMes + " " + c.getAssunto() + "\n";
            }
        }
        else{
            retorno +=  diaMes + " Não tem compromisso! \n";
        }
    }
    return retorno;
}

    

    

    
    
}
