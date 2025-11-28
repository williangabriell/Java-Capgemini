package Ex05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = leitorScanner.nextLine();
        
        System.out.print("Digite a primeira nota do aluno(a)" + nomeAluno + ": ");
        float notaUm = leitorScanner.nextFloat();
       
        System.out.print("Digite a segunda nota do aluno(a)" + nomeAluno + ": ");
        float notaDois = leitorScanner.nextFloat();
        
        System.out.print("Digite a terceira nota do aluno(a)" + nomeAluno + ": ");
        float notaTres = leitorScanner.nextFloat();
        
        float media = (notaUm + notaDois + notaTres) / 3;
        
        System.out.print("Aluno(a)" + nomeAluno);
        System.out.print("Ficou com media " + media);
    }
}
