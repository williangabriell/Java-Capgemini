package Ex17;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int numeros = 80;
        int contadorIntervalo = 0;

        while (numeros > 0) {

       if (numeros >= 10 && numeros <= 150) {
                contadorIntervalo = contadorIntervalo + 1;
            }
            numeros = numeros - 1;
        }
        
        System.out.println("Números dentro do intervalor: " + contadorIntervalo);

    }
}
