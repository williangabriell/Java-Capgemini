package Ex19;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int contadorPessoas = 2;
        int contadorSexoMas = 0;
        int contadorSexoFem = 0;

        while (contadorPessoas > 0) {

            System.out.print("Digite o seu nome: ");
            String nomes = leitorScanner.nextLine();

            System.out.print("Digite o seu sexo (M/F): ");
            String sexos = leitorScanner.nextLine();

            if (sexos.equalsIgnoreCase("m")) {
                contadorSexoMas++;
            } else if (sexos.equalsIgnoreCase("f")) {
                contadorSexoFem++;
            }

            contadorPessoas--;
        }

        System.out.println("O total de homens é de: " + contadorSexoMas);
        System.out.println("O total de mulheres é de: " + contadorSexoFem);

        leitorScanner.close();
    }
}
