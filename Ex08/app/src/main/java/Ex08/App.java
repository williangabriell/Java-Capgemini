package Ex08;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
    Scanner leitorScanner = new Scanner(System.in);
    
    System.out.print("Digite o valor em real: ");
       float valorReal = leitorScanner.nextFloat();
       
    System.out.print("Digite o valor da conversão: ");
       float conversao = leitorScanner.nextFloat(); 
       
       
    float valorConvertido = valorReal / conversao;    
       
       
    System.out.print("Seus " + valorReal + " R$" + "Dão exatamente: " + valorConvertido + "$");   
        
        
    }
}
