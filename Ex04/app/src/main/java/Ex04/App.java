package Ex04;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = leitorScanner.nextLine();

        System.out.print("Digite o salario fixo do vendedor: ");
        double salarioVendedor = leitorScanner.nextDouble();

        System.out.print("Digite o valor de vendas do vendedor no mês: ");
        double vendasMes = leitorScanner.nextDouble();

        double salarioComissao = (vendasMes * 0.15) + salarioVendedor;

        System.out.println("Vendedor: " + nomeVendedor);
        System.out.println("Salário de: " + salarioVendedor);
        System.out.println("O Salário com a comissão foi de: " + salarioComissao);

    }
}
