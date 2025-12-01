package Ex09;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
       
        System.out.print("Digite o valor que gostaria de depositar: ");
        float valorDepositado = leitorScanner.nextFloat();
        
        double valorCorrigido = valorDepositado * 0.07;
        
        double valorFinal = valorDepositado + valorCorrigido ;
        
        System.out.print("O valor apos um mes e de: " + valorFinal );
        
        
        
    }
}
