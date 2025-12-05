package Ex31;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos valores
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char c = sc.next().charAt(0);

        double resultado;

        switch (c) {
            case '+':
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Erro: divisão por zero não permitida!");
                } else {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operador não definido!");
        }

        sc.close();
    }
}