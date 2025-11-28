package Ex01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
         Scanner leitorScanner = new Scanner(System.in);
        
         System.out.print("Digite o primeiro numero da soma: ");
         float numero1 = leitorScanner.nextInt();
         System.out.print("Digite o segundo numero da soma: ");
         float numero2 = leitorScanner.nextInt();
         
         float soma = numero1 + numero2;
         
         System.out.print("A soma dos dois numeros: " + soma);
        
        
    }
}
