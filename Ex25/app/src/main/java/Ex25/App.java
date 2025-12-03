package Ex25;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        double numeroUm = leitorScanner.nextDouble();
        
        System.out.print("Digite outro valor: ");
        double numeroDois = leitorScanner.nextDouble();
        
        if (numeroUm == numeroDois){        
            System.out.print("Valores Iguais");
            
        } else {
            if(numeroUm > numeroDois){
                System.out.print("Numero " + numeroUm + " e maior e são diferentes");                
            } else {
                System.out.print("Numero " + numeroDois + " e maior e são diferentes");
            }
        }
        
    }
}
