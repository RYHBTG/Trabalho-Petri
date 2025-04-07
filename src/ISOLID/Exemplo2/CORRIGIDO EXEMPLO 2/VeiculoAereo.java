
public interface VeiculoAereo extends MeioDeTransporte {
    void voar();
    
    default void mostrarAcao() {
        System.out.println("ZOOOOOM! Veículo aéreo decolando...");
    }
}