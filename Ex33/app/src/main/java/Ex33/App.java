package Ex33;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        int nivelProfessor;
        double salario = 0;
        double tempoAula;
        
        System.out.print("Digite o nivel do professor (1 | 2 | 3): ");
        nivelProfessor = leitorScanner.nextInt();
        
        System.out.print("Quanto tempo de aula: ");
        tempoAula = leitorScanner.nextDouble();
        
        switch (nivelProfessor) {
            case 1: salario =  12 * tempoAula;                
                break;
            case 2: salario = 17 * tempoAula;
                break;
            case 3: salario = 25 * tempoAula;    
            default:
                System.out.print("Nivel inexistente");
        }
        
        System.out.print("Salario do professor é: " + salario);
        
        
    }
}
