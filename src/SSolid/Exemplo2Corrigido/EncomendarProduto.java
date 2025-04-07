package SSolid.Exemplo2Corrigido;

public class EncomendarProduto {

    private PromptMostrar promptMostrar = new PromptMostrar();
    private SalvarArquivos salvarArquivos = new SalvarArquivos();
    private int idEncomenda;
    private double pesoEncomenda;
    private double valorFreteEncomenda;

    public void Encomendar(){
        try {
            ObterDadosEncomenda();
            Calcular();
            MostrarValorFreteEncomenda();
            SalvarDadosEncomenda();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    private void Calcular(){
        valorFreteEncomenda = pesoEncomenda * 10;
    }
    private void ObterDadosEncomenda(){
        idEncomenda = promptMostrar.ObterID();
        pesoEncomenda = promptMostrar.ObterPeso();
    }

    private void MostrarValorFreteEncomenda(){
        promptMostrar.MostrarFreteEncomenda(valorFreteEncomenda);
    }
    private void SalvarDadosEncomenda(){
        salvarArquivos.SalvarEncomenda(idEncomenda,valorFreteEncomenda);
        promptMostrar.SucessoMsg();

    }

}
