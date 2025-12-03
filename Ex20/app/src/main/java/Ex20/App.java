package Ex20;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        char desejaContinuar = 'S';
        int contadorCarros2000 = 0;
        int contadorCarrosGeral = 0;

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.print("Digite o valor do carro: ");
            double valorCarro = leitorScanner.nextDouble();

            System.out.print("Digite o ano do carro: ");
            int anoCarro = leitorScanner.nextInt();

            double desconto;
            double valorFinal;

            if (anoCarro <= 2000) {
                desconto = valorCarro * 0.12;
                contadorCarros2000++;
            } else {
                desconto = valorCarro * 0.07;
            }

            valorFinal = valorCarro - desconto;
            contadorCarrosGeral++;

            System.out.println("Valor do desconto: R$ " + desconto);
            System.out.println("Valor a pagar: R$ " + valorFinal);

            System.out.print("Deseja continuar? S - Sim / N - Não: ");
            desejaContinuar = leitorScanner.next().charAt(0);
        }

        System.out.println("\nResumo da operação:");
        System.out.println("Quantidade de carros até 2000: " + contadorCarros2000);
        System.out.println("Quantidade de carros geral: " + contadorCarrosGeral);

        leitorScanner.close();
    }
}


        
        
        


