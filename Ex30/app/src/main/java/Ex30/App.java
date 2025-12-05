package Ex30;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int menor = Math.min(a, Math.min(b, c));
        int maior = Math.max(a, Math.max(b, c));
        int meio = a + b + c - menor - maior; 

        System.out.println("Valores em ordem crescente: " + menor + " " + meio + " " + maior);

        sc.close();
    }
}