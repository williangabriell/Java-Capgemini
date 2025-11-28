package Ex02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
         Scanner leitorScanner = new Scanner(System.in);
        
         System.out.print("Digite o primeiro numero das operacoes: ");
         float numero1 = leitorScanner.nextInt();
         System.out.print("\"Digite o segundo numero das operacoes: ");
         float numero2 = leitorScanner.nextInt();
         
         float soma = numero1 + numero2;
         float subtracao = numero1 - numero2;
         float multiplicacao = numero1 * numero2;
         float divisao = numero1 / numero2;
         
         System.out.println("A soma dos dois numeros: " + soma);
         System.out.println("A subtracao dos dois numeros: " + subtracao);
         System.out.println("A multiplicacao dos dois numeros: " + multiplicacao);
         System.out.println("A divisao dos dois numeros: " + divisao);
    }
}
