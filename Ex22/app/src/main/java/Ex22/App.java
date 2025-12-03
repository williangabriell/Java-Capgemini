package Ex22;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        int quantProdutos = 40;
        double contPrecoCusto = 0;
        double contPrecoVenda = 0;
        double media = 0;
        
        while(quantProdutos > 0) {
            
        System.out.println("Digite o nome do item: ");
        String nomeItem = leitorScanner.nextLine();
        
        System.out.println("Digite o preço de custo do produto: ");
        double precoCusto = leitorScanner.nextDouble();
        
        System.out.println("Digite o preço de venda do produto: ");
        double precoVenda = leitorScanner.nextDouble();
        
        if (precoCusto < precoVenda) {
            System.out.println("O item " + nomeItem + " deu Lucro");
            System.out.println("Valor de custo de " + precoCusto + " R$");
            System.out.println("Valor de vende de " + precoVenda + " R$");
            
        } else {
            if(precoCusto == precoVenda) {
                System.out.println("Esse item ficou empatado o valor");
                System.out.println("Valor de custo de " + precoCusto + " R$");
                System.out.println("Valor de vende de " + precoVenda + " R$");
            } else {
                System.out.println("Esse item deu prejuizo");
                System.out.println("Valor de custo de " + precoCusto + " R$");
                System.out.println("Valor de vende de " + precoVenda + " R$");
            }
            quantProdutos--;  
            contPrecoCusto = contPrecoCusto + precoCusto;
            contPrecoVenda = contPrecoVenda + precoVenda;
        }
       }
        media = (contPrecoCusto + contPrecoVenda) / quantProdutos;
        System.out.print("Media do preço de custo e do preço de venda: " + media);
        
        
    }
}
