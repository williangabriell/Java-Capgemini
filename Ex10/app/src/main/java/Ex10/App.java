package Ex10;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
       
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra em Reais: ");
        double valorCompra = leitorScanner.nextDouble();
        
        
        double valorParcelado = valorCompra / 5;
        
        System.out.print("O valor das parcelas ficara de: " + valorParcelado);
        
        
        
        
        
    }
}
