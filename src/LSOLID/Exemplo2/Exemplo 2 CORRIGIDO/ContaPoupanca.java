
public class ContaPoupanca extends Conta {
    @Override
    public void sacar(double valor) {
        if (valor <= saldo){
            saldo -= valor;
        }else{
            System.out.print("Saque bloqueado!");
        }
    }
}