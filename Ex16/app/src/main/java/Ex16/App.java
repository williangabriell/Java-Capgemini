package Ex16;

import java.util.Scanner;

public class App {    
    public static void main(String[] args) {
       
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double notaUm = leitorScanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double notaDois = leitorScanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double notaTres = leitorScanner.nextDouble();
        
        
        double media = (notaUm + notaDois + notaTres) / 3;
        
        if(media >= 7) {
            System.out.println("Aprovado");
        } else {
            if(media >= 5.1 && media <= 6.9){
                System.out.print("Recuperação");
            } else {
                System.out.print("Reprovado");
            }
        }
        
        
        
        
    }
}
