package OSolid.Exemplo2;

public class PagamentoSistema {

    public void pagar(IPagamento pagamento, double valor) {
        pagamento.Calcular(valor);

    }
}
