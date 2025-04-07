
public interface VeiculoAquatico extends MeioDeTransporte {
    void navegar();
    
    default void mostrarAcao() {
        System.out.println("GLUB GLUB! Veículo aquático navegando...");
    }
}