
public interface VeiculoTerrestre extends MeioDeTransporte {
    void dirigir();
    
    default void mostrarAcao() {
        System.out.println("VRUM VRUM! Veículo terrestre em movimento...");
    }
}