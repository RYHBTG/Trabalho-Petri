import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Implementações genéricas usando as próprias interfaces
        VeiculoTerrestre terrestre = () -> System.out.println("Direção iniciada...");
        VeiculoAereo aereo = () -> System.out.println("Voo iniciado...");
        VeiculoAquatico aquatico = () -> System.out.println("Navegação iniciada...");

        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Veículo Terrestre");
            System.out.println("2 - Veículo Aéreo");
            System.out.println("3 - Veículo Aquático");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            int tipo = scanner.nextInt();
            
            if (tipo == 0) {
                System.out.println("Saindo...");
                break;
            } else if (tipo == 1) {
                terrestre.mostrarAcao();
                terrestre.dirigir();
                break;
            } else if (tipo == 2) {
                aereo.mostrarAcao();
                aereo.voar();
                break;
            } else if (tipo == 3) {
                aquatico.mostrarAcao();
                aquatico.navegar();
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}