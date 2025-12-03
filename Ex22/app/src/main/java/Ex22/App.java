package Ex22;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        double totalCusto = 0;
        double totalVenda = 0;
        String nomeItem;

        double precoCusto;
        double precoVenda;
        
        int i = 0;
        for (; i < 40; i++) {

            System.out.println("Digite o nome do item: ");
            nomeItem = leitorScanner.nextLine();

            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = leitorScanner.nextDouble();

            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = leitorScanner.nextDouble();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto < precoVenda) {
                System.out.println("O item " + nomeItem + " deu Lucro");
                System.out.println("Valor de custo de " + precoCusto + " R$");
                System.out.println("Valor de vende de " + precoVenda + " R$");

            } else {
                if (precoCusto == precoVenda) {
                    System.out.println("Esse item ficou empatado o valor");
                    System.out.println("Valor de custo de " + precoCusto + " R$");
                    System.out.println("Valor de vende de " + precoVenda + " R$");
                } else {
                    System.out.println("Esse item deu prejuizo");
                    System.out.println("Valor de custo de " + precoCusto + " R$");
                    System.out.println("Valor de vende de " + precoVenda + " R$");
                }

            }
        }

        System.out.println("Media do preço de custo: " + (totalCusto/ i) );
        System.out.println("Media do preço de venda: " + (totalVenda/ i) );

    }
}
