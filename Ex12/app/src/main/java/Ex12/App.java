package Ex12;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
       
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de custo do carro: ");
        double valorCusto = leitorScanner.nextDouble();
        
        double valorComImpostos = valorCusto * 1.45;
        
        double impostoDistribuidor = valorComImpostos * 1.28;
        
        double valorFinal = valorCusto + impostoDistribuidor;
        
        
        System.out.print("Valor final do carro: " + valorFinal);
        
        
        
        
    }
}
