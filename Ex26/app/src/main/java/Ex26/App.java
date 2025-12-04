package Ex26;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {        
        Scanner leitorScanner = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Digite um numero: ");
        numero = leitorScanner.nextInt();
        
        switch (numero) {
            case 1:
                System.out.print("UM");
                break;
            case 2:
                System.out.print("DOIS");
                break;
            case 3:
                System.out.print("TRES");
                break;
            case 4:
                System.out.print("QUATRO");
                break;
            case 5:
                System.out.print("CINCO");
                break;
            default:
                System.out.print("NUMERO INVALIDO");
                
        }
        
        
        
    }
}
