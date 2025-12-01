package Ex07;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
       
    Scanner leitorScanner = new Scanner(System.in);
    
    System.out.print("Digite o valor da temperatura em Graus Celsius: ");
    float grausCelsius = leitorScanner.nextInt();
    
    float grausFaren = (9 * grausCelsius + 160)/ 5;
    
    
    
    System.out.print("A temperatura convertida é: " + grausFaren);   
        
        
        
    }
}
