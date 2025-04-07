package OSolid.Exemplo2;

public class PagamentoPix implements IPagamento {
    @Override
    public void Calcular(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX");
    }
}
