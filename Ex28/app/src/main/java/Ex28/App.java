package Ex28;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

       
        double totalAumento = 0; // quanto a empresa vai aumentar a folha
        double salarioMinimo;

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = leitorScanner.nextDouble();

        for (int i = 1; i <= 548; i++) {
            System.out.println("\nFuncionário " + i + ":");
            System.out.print("Nome: ");
            String nome = leitorScanner.next();

            System.out.print("Salário atual: ");
            double salario = leitorScanner.nextDouble();

            double percentualReajuste;
            if (salario < 3 * salarioMinimo) {
                percentualReajuste = 0.50; // 50%
            } else if (salario <= 10 * salarioMinimo) {
                percentualReajuste = 0.20; // 20%
            } else if (salario <= 20 * salarioMinimo) {
                percentualReajuste = 0.15; // 15%
            } else {
                percentualReajuste = 0.10; // 10%
            }

            double reajuste = salario * percentualReajuste;
            double novoSalario = salario + reajuste;

            System.out.println("Nome: " + nome);
            System.out.println("Reajuste: R$ " + reajuste);
            System.out.println("Novo salário: R$ " + novoSalario);

            totalAumento += reajuste;
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Aumento total da folha de pagamento: R$ " + totalAumento);

        leitorScanner.close();
    }
}
