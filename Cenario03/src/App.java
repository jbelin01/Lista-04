import br.edu.up.*;

public class App {
    

        public static void main(String[] args) {
            Mes mes = new Mes("Janeiro", 31);
    
            // Adiciona compromissos
            mes.adicionarCompromisso("João", "Sala 1", "Reunião", 10, 1);
            mes.adicionarCompromisso("Maria", "Sala 2", "Entrevista", 14, 1);
            mes.adicionarCompromisso("João", "Sala 3", "Reunião", 10, 2);
            mes.adicionarCompromisso("Pedro", "Sala 4", "Treinamento", 16, 3);
    
            // Exclui compromisso
            mes.excluirCompromisso(1, 14);
    
            // Lista compromissos por dia
            for (int i = 1; i <= mes.getQtdDias(); i++) {
                System.out.println("Dia " + i + " do mês:");
                System.out.println(mes.listarCompromissos(i));
                System.out.println();
            }
        }
    
        
}
