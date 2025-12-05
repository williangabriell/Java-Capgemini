package Ex35;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o tipo de cliente (R - Residência, C - Comércio, I - Indústria): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite o consumo em kWh: ");
        double consumo = sc.nextDouble();

        double valorKwh;
        double conta;

        // Verificação do tipo de cliente
        switch (tipo) {
            case 'R':
                valorKwh = 0.60;
                conta = consumo * valorKwh;
                System.out.println("Conta de luz (Residência): R$ " + conta);
                break;
            case 'C':
                valorKwh = 0.48;
                conta = consumo * valorKwh;
                System.out.println("Conta de luz (Comércio): R$ " + conta);
                break;
            case 'I':
                valorKwh = 1.29;
                conta = consumo * valorKwh;
                System.out.println("Conta de luz (Indústria): R$ " + conta);
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
        }

        sc.close();
    }
}