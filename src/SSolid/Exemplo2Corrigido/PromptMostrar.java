package SSolid.Exemplo2Corrigido;

import java.util.Scanner;

public class PromptMostrar {

    Scanner sc = new Scanner(System.in);

    public int ObterID(){
        System.out.print("Digite um ID: ");
        return Integer.parseInt(sc.nextLine());
    }
    public double ObterPeso(){
        System.out.print("Digite um peso: ");
        return Integer.parseInt(sc.nextLine());
    }
    public void MostrarFreteEncomenda(double valorFrete){
        System.out.println("Valor do frete calculado: " + valorFrete);
    }
    public void SucessoMsg(){
        System.out.println("Arquivo Salvo Com Sucesso!");
    }
}
