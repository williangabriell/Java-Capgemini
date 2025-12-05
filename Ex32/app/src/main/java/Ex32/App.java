package Ex32;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos lados
        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();

        // Verificação da propriedade do triângulo
        if (a < b + c && b < a + c && c < a + b) {
            // Classificação
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isóscele");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        sc.close();
    }
}