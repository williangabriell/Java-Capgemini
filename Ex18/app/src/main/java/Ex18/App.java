package Ex18;

public class App {
    public static void main(String[] args) {
        
        int idades = 75;
        
        while(idades > 0) {
            
            if(idades >= 18){
                System.out.println(idades + " MAIOR DE IDADE");
            } else {
                System.out.println(idades + " MENOR DE IDADE");
            }
            
            
            idades = idades -1;
        }
        
    }
}
