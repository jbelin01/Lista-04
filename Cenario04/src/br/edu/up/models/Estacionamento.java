package br.edu.up.models;


public class Estacionamento {
    private int vagasDisponiveis;
    private Veiculo[] carrosEstacionados;

    public Estacionamento() {
        this.vagasDisponiveis = 10;
        this.carrosEstacionados = new Veiculo[10]; // Tamanho do array é 10
    }

    public boolean entrarVeiculo(Veiculo veiculo, String placa) {
        if (vagasDisponiveis > 0) {
            for (int i = 0; i < carrosEstacionados.length; i++) {
                if (carrosEstacionados[i] == null) {
                    carrosEstacionados[i] = veiculo;
                    vagasDisponiveis--;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean sairVeiculo(Veiculo veiculo) {
        for (int i = 0; i < carrosEstacionados.length; i++) {
            if (carrosEstacionados[i] != null && carrosEstacionados[i].equals(veiculo)) {
                carrosEstacionados[i] = null;
                vagasDisponiveis++;
                return true;
            }
        }
        return false;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public int getTotalVeiculosEstacionados() {
        int total = 0;
        for (Veiculo veiculo : carrosEstacionados) {
            if (veiculo != null) {
                total++;
            }
        }
        return total;
    }
}
