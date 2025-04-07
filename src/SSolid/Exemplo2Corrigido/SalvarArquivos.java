package SSolid.Exemplo2Corrigido;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SalvarArquivos {

    public void SalvarEncomenda(int idEncomenda, double valorFrete) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("encomendas.txt", true))) {
            bw.write("ID: " + idEncomenda + " - Frete: " + valorFrete);
            bw.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
