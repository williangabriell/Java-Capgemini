package Ex11;

import java.util.Scanner;


public class App {
   

    public static void main(String[] args) {
       
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite o preço do custo do produto em reais: ");
        double precoCusto = leitorScanner.nextDouble();
        
        System.out.print("Digite a porcentagem do acrescimo que deseja: ");
        double valorAcrescimo = leitorScanner.nextDouble();
        
        double calculoAcrescimo = (precoCusto * valorAcrescimo)/ 100;
        
        double valorFinal = precoCusto + calculoAcrescimo;
        
        
        System.out.print("Valor da venda indicado: " + valorFinal);
        
        
        
        
    }
}
