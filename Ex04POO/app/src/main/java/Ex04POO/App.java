package Ex04POO;


public class App {


    public static void main(String[] args) {
        
        Invoice inv = new Invoice(1, "Mousepad", 10, 50);
        inv.setQuantidade(-1);
        System.out.println("Valor total = " + inv.getInvoiceAmount());
        
    }
}
