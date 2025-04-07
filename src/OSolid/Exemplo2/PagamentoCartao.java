package OSolid.Exemplo2;

public class PagamentoCartao implements IPagamento {
    @Override
    public void Calcular(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com CARTÃO.");
    }
}
