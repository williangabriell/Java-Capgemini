package Ex06;

import java.util.Scanner;


public class App {
 
    public static void main(String[] args) {
       
         Scanner leitorScanner = new Scanner(System.in);
         
         System.out.print("Digite o Valor A: ");
         int valorUm = leitorScanner.nextInt();
         
         System.out.print("Digite o Valor B: ");
         int valorDois = leitorScanner.nextInt();
         
         int valorFinal = valorUm;
         
         valorUm = valorDois;
         valorDois = valorFinal;
         
         
         System.out.println("Valor A trocado: " + valorUm);
         System.out.println("Valor A trocado: " + valorDois);
        
        
    }
}
