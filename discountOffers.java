import java.util.Scanner;

public class discountOffers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product= scanner.nextLine().toLowerCase();
        double price = scanner.nextDouble();
        double discount=0;

       if (product.equalsIgnoreCase("clothes")) {
           discount = price - price*0.2;
           System.out.println("clothes: " + discount);

        }else if (product.equalsIgnoreCase("shoes")) {
           discount = price - price*0.1;
           System.out.println("shoes: "+ discount);

       }else{
           product.equalsIgnoreCase("articles");
           discount = price - price*0.05;
           System.out.println("Articles: " + discount);
        }

    }
}
