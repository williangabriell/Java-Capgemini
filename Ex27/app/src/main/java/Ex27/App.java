package Ex27;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        int tipoDesconto;
        
        double valorCarro;
        double desconto = 0;
        double valorFinal;
        
        double totalDescontos = 0;
        double totalPago = 0;
        
        
        while(true){
        
        System.out.print("Digite o valor do carro(0) para encerrar: ");
        valorCarro = leitorScanner.nextDouble();
        
        if (valorCarro == 0) {
                break;
            }
        
        System.out.print("Selecione o tipo de combustível utilizado 1 - Alcool | 2 - Gasolina | 3 - Diesel: ");
        tipoDesconto = leitorScanner.nextInt();
        
        switch (tipoDesconto) {
            case 1: 
                desconto = valorCarro * 0.25;                
                break;
            case 2:
                desconto = valorCarro * 0.21;
                break;
            case 3:
                desconto = valorCarro * 0.14;
                break;
            default:
                System.out.print("Tipo não existente, utilize os indicados");
        }
        valorFinal = valorCarro - desconto;
        System.out.println("Desconto: " + desconto + " R$");
        System.out.println("Total pago: " + valorFinal);
        
        totalDescontos += desconto;
        totalPago += valorFinal;        
        }        
        
        System.out.println("Total de desconto dos clientes: " + totalDescontos);
        System.out.println("Total pago dos clientes: " + totalPago);
        
        
        
        
        
        
    }
}
