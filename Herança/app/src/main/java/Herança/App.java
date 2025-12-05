package Herança;

import java.util.Date;

public class App {

    public static void main(String[] args) {
       
        Vendedor v = new Vendedor();
        v.setNome("Willian");
        v.setSalario(2500.0f);
        v.setCpf("10112201203");
        v.setDataNascimento(new Date());  
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salario do vendedor é: " + v.calcularSalario());
                
        Motorista m = new Motorista();
        
    }
}
