package Classes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        Pessoa objetoPessoa = new Pessoa();
        float imc;
        
        System.out.print("Digite o peso da pessoa: ");
        objetoPessoa.peso = leitor.nextFloat();
        System.out.print("Digite a altura da pessoa: ");
        objetoPessoa.altura = leitor.nextFloat();
        
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}
