package EstruturaCondicionalif;

public class App {

    public static void main(String[] args) {
        
        int media = 7;
        
        //OPERADORES RELACIONAIS
        // >  - MAIOR QUE
        // <  - MENOR QUE
        // <= - MAIOR OU IGUAL
        // >= - MENOR OU IGUAL
        // == - COMPARAÇÃO DE VALORES
        // != - DIFERENTE
        
        //OPERADORES LÓGICOS
        // && - E
        // || - OU
        // ! - NEGAÇÃO
        
        if(media >= 7 && media < 10){
            System.out.println("Aprovado na média");
        } else if(media >7 && media == 10){ 
                System.out.println("Aprovado com nota máxima");
            } else {
            System.out.println("Reprovado");
        }           
        
    }
}
