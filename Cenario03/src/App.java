import br.edu.up.*;

public class App {
    public static void main(String[] args) {
        // Criação dos meses
        Mes janeiro = new Mes("Janeiro", 31);
        Mes fevereiro = new Mes("Fevereiro", 28); // Considere o ano não bissexto
        Mes marco = new Mes("Março", 31);
        // Adicione os outros meses conforme necessário
        
        // Criação do ano com os meses
        Ano ano = new Ano(2023, false, new Mes[12]);
        ano.adicionarMes(janeiro);
        ano.adicionarMes(fevereiro);
        ano.adicionarMes(marco);
        // Adicione os outros meses ao ano

        // Adiciona compromissos em janeiro
        janeiro.adicionarCompromisso("João", "Sala 1", "Reunião", 10, 1);
        janeiro.adicionarCompromisso("Maria", "Sala 2", "Entrevista", 14, 1);
        janeiro.adicionarCompromisso("João", "Sala 3", "Reunião", 10, 2);
        janeiro.adicionarCompromisso("Pedro", "Sala 4", "Treinamento", 16, 3);

        // Exclui compromisso em janeiro
        janeiro.excluirCompromisso(1, 14);

        // Adiciona compromissos em fevereiro
        fevereiro.adicionarCompromisso("Ana", "Sala 5", "Workshop", 11, 5);
        fevereiro.adicionarCompromisso("Carlos", "Sala 6", "Seminário", 13, 8);

        // Adiciona compromissos em março
        marco.adicionarCompromisso("Lucas", "Sala 7", "Conferência", 15, 10);
        marco.adicionarCompromisso("Fernanda", "Sala 8", "Reunião", 9, 20);

        // Lista compromissos do ano inteiro detalhadamente
        System.out.println("Compromissos do ano de " + ano.getAno() + ":");
        for (Mes mes : ano.getMeses()) {
            if (mes != null) {
                System.out.println("Compromissos do mês de " + mes.getNome() + ":");
                for (int dia = 1; dia <= mes.getQtdDias(); dia++) {
                    System.out.println("Dia " + dia + " do mês de " + mes.getNome() + ":");
                    System.out.println(mes.listarCompromissos(dia));
                    System.out.println();
                }
            }
        }
    }
    

    
}
