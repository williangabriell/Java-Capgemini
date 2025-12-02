package Ex13;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        double numero = leitorScanner.nextDouble();
        
        if(numero > 10){
            
            System.out.print("O numero é maior que 10");
            
            
        } else {
            System.out.print("O numero é menor que 10");
        }
        
       
    }
}
