package Ex21;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
     
        char desejaContinuar = 'S';
        
        Scanner leitorScanner = new Scanner(System.in);
        
         while (desejaContinuar == 'S' || desejaContinuar == 's') {
             
         leitorScanner.nextLine();     
        
        System.out.println("Digite o seu nome: ");
        String nome = leitorScanner.nextLine();
        
        System.out.println("Digite o seu sexo: ");
        char sexo = leitorScanner.next().charAt(0);
        
        System.out.println("Digite a sua idade: ");
        int idade = leitorScanner.nextInt();
        
         leitorScanner.nextLine();
        
        System.out.println("Digite o seu estado de saude: ");
        String saude = leitorScanner.nextLine();
        
        if(idade >= 18 && saude.equalsIgnoreCase("ok")){
            System.out.println("APTO");
        } else {
            System.out.println("INAPTO");
        
        }      
        
        System.out.print("Deseja continuar? S - Sim / N - Não ");
        desejaContinuar = leitorScanner.next().charAt(0);
    }
         
         
}
}
