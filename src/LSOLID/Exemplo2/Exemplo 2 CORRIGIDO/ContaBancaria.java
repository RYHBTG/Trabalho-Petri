
public class ContaBancaria extends Conta {
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
}