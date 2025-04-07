package OSolid.Exemplo2;

public class Main {
    public static void main(String[] args) {
        PagamentoSistema ps = new PagamentoSistema();
        PagamentoBoleto pb = new PagamentoBoleto();
        PagamentoCartao pc = new PagamentoCartao();
        PagamentoPix pix = new PagamentoPix();

        ps.pagar(pb, 100);
        ps.pagar(pc, 100);
        ps.pagar(pix, 100);

    }
}
