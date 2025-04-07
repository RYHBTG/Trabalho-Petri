
public abstract class Conta {
    protected double saldo;
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public abstract void sacar(double valor); // Método abstrato
    
    public double getSaldo() {
        return saldo;
    }
    
    
    public static void main(String[] args) {
            // Teste Conta Corrente
            // ContaBancaria cc = new ContaBancaria();
            // cc.depositar(1200);
            // cc.sacar(500);
            // System.out.println("Saldo CC: " + cc.getSaldo()); // Deve mostrar 500
            ContaPoupanca cp = new ContaPoupanca();
            cp.depositar(12000);
            cp.sacar(12001);
            System.out.println();
            System.out.println("Saldo CP: "+ cp.getSaldo());
    }

}