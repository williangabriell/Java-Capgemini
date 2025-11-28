package Ex03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite a distancia percorrida: ");
        float distanciaPercorrida = leitorScanner.nextInt();
        System.out.print("Digite o total de combustivel gasto: ");
        float totalCombustivel = leitorScanner.nextInt();
        
        float consumoMedio = (distanciaPercorrida + totalCombustivel)/2;
        
        System.out.println("O consumo medio desse automovel foi de: " + consumoMedio);
        
        
        
    }
}
