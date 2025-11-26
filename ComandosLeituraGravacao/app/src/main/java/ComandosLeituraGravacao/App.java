package ComandosLeituraGravacao;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();     // Lê toda a frase
        String codigoRua = leitor.next();   // Lê apenas uma palavra
        
        System.out.println("Texto que será exibido no console"); // Pula o cursor para próxima linha
        System.out.print("Texto que será exibido no console");  // Deixa o cursor na mesma linha
       
    }
}
