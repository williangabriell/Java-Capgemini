package Ex14;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        double primeiroNumero = leitorScanner.nextDouble();
        
        System.out.print("Digite o primeiro numero: ");
        double SegundoNumero = leitorScanner.nextDouble();
        
        if(primeiroNumero > SegundoNumero) {
            System.out.print("O primeiro numero digitado " + primeiroNumero + "e maior" );
        } else {
            System.out.print("O segundo numero digitado " + SegundoNumero + "e maior" );
        }
        
        
    }
}
