package br.edu.up;

import java.util.List;

public class Mes {

    private String nome;

    private int qtdDias;

    private Dia[] dias;
    
    public Mes(String nome, int qtdDias) {
        this.nome = nome;
        this.qtdDias = qtdDias;
        this.dias = new Dia[qtdDias]; 
        for (int i = 0; i < qtdDias; i++) {
            dias[i] = new Dia(i + 1); 
        }
    }

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

        } 
    }

   

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes){

        for (int i = 0; i < dias.length; i++) {
            
            Dia  d = dias[i];

            if(dias[i] != null){
                if(d.getDiaMes() == diaMes){
                    Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);
                    d.adicionarCompromisso(compromisso);
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


<<<<<<< HEAD
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
=======
    public String listarCompromissos(int diaMes) {
        String retorno = "";
        Dia dia = dias[diaMes - 1];
        for (int i = 0; i < 24; i++) {
            Compromisso c = dia.getCompromissos()[i];
            if (c != null) {
                retorno += i + " - " + c.getAssunto() + "\n";
            } else {
                retorno += i + " - Não tem compromisso\n";
>>>>>>> c9ddd6fd76a0dc4d2bba5be26258ae2611543d2e
            }
        }
        else{
            retorno +=  diaMes + " Não tem compromisso! \n";
        }
    }
<<<<<<< HEAD
    return retorno;
}

    
=======
>>>>>>> c9ddd6fd76a0dc4d2bba5be26258ae2611543d2e

    public String listarCompromissos(){
        String retorno = "";
        for (int i = 0; i < dias.length; i++) {
            Dia d = dias[i];
            if (d!= null) {
                for (int j = 0; j < d.getCompromissos().length; j++) {
                    Compromisso c = d.getCompromissos()[j];
                    if (c!= null) {
                        retorno += d.getDiaMes() + " " + c.getAssunto() + "\n";
                    }
                }
            }
        }
        return retorno;
    }





}
    

