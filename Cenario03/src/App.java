import br.edu.up.*;

public class App {
    public static void main(String[] args) {
        // Criando um mês de janeiro com 31 dias
        Mes janeiro = new Mes("Janeiro", 31);

        // Adicionando alguns compromissos
        Compromisso compromisso1 = new Compromisso("João", "Escritório", "Reunião", 10);
        Compromisso compromisso2 = new Compromisso("Maria", "Café", "Café com amigos", 15);
        Compromisso compromisso3 = new Compromisso("Carlos", "Cinema", "Assistir filme", 20);

        // Adicionando os compromissos aos dias do mês
        janeiro.adicionarCompromisso(compromisso1, 5);
        janeiro.adicionarCompromisso(compromisso2, 15);
        janeiro.adicionarCompromisso(compromisso3, 20);

        // Listando os compromissos do dia 5 de janeiro
        System.out.println("Compromissos do dia 5 de Janeiro:");
        System.out.println(janeiro.listarCompromissos(5));

        // Listando todos os compromissos do mês de janeiro
        System.out.println("Todos os compromissos do mês de Janeiro:");
        System.out.println(janeiro.listarCompromissos());
    }
}
