package Ex23;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite um numero qualquer: ");
        int numero = leitorScanner.nextInt();
        
        switch (numero){            
        case 25: 
                System.out.print("Numero selecionado 25");
                break;            
        case 40:
                System.out.print("Numero selecionado 40");
                break;
        case 80:        
                System.out.print("Numero selecionado 80");
                break;
        default:    
                System.out.print("Numero nao selecionado");
        }
        
    }
}
