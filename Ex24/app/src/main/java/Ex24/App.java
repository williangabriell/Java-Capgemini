package Ex24;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            
            System.out.print("Digite um número: ");
            int numero = leitorScanner.nextInt();

            if (numero == 0) {
                System.out.println("O numero é zero");

            } else {
                if (numero > 0) {
                    System.out.println("O numero é positivo");
                } else {
                    System.out.println("O numero é negativo");
                }
            }
            System.out.print("Deseja continuar? S - Sim / N - Não ");
            desejaContinuar = leitorScanner.next().charAt(0); // IRÁ LER A PRIMEIRA PALAVRA DIGITADA NO SCANNER

        }

        
    }
}
