import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        System.out.println("Please enter a product name");
        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine();
        System.out.println("Please enter the description of the product");
        String description = sc.nextLine();

        //first product
        Product p = new Product();
        p.setName(productName);
        p.setDescription(description);

        //second product
        Product p2 = new Product("screwdriver", "Philips head");

        getDetails();
    }
        public static String[] getDetails()
        {
        Scanner sc = new Scanner(System.in);
        //prompting for details for products
        String[] details = new String[2];
        System.out.println("Please enter a product name");
        String productName = sc.nextLine();
        System.out.println("Please enter the description of the product");
        String description = sc.nextLine();
        return details;
    }
}
