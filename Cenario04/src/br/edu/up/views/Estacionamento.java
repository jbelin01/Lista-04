package br.edu.up.views;


















































// import java.util.Scanner;
// import br.edu.up.models.Carro;

// public class Estacionamento {
    
//     public Carro[] carrosEstacionados = new Carro[10];
    
//     public void entrarVeiculo(Carro veiculo) {
//         Carro carro = new Carro();
//         Scanner scanner = new Scanner(System.in);
//         for (int i = 1; i < carrosEstacionados.length; i++) {
//             System.out.print("Informe a placa do carro: ");
//             carro.setPlaca(scanner.nextLine());
//             System.out.print("Informe o modelo do carro: ");
//             carro.setModelo(scanner.nextLine());
//             System.out.print("Informe a cor do carro: ");
//             carro.setCor(scanner.nextLine());
//             carrosEstacionados[i] = Carro();
//             System.out.println("Carro estacionado na vaga " + i);
//             break;
            
//         }
//     }

//     public void sairVeiculo() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Informe a placa do carro: ");
//         String placa = scanner.nextLine();
//         for (int i = 0; i < carrosEstacionados.length; i++) {
//             if(carrosEstacionados[i].getPlaca() == placa){
//                 carrosEstacionados[i] = null;
//                 System.out.println("Carro retirado da vaga " + i);   
//             }
//             else{
//                 System.out.println("Carro não encontrado");
//             }
//         }
//     }

//     public void Relatorio(Carro veiculo){
//         int vagas = carrosEstacionados.length;
//         System.out.println("Carros estacionados: " + carrosEstacionados);
//         System.out.println("Vagas disponíveis: " + (10 - vagas));
//     }

// }
