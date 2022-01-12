import java.util.Scanner;
public class ShoppingCart {
    int noOfDoveSoaps = 0;
    double unitPriceOfDoveSoaps = 39.99;

    void addDoveSoaps(int noOfDoveSoaps) {
        this.noOfDoveSoaps = noOfDoveSoaps;
    }

    double calculateTotalPrice(){
        return noOfDoveSoaps * unitPriceOfDoveSoaps;
    }

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter no. of products");
        int numberOfDoveSoaps = userInput.nextInt();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addDoveSoaps(numberOfDoveSoaps);
        System.out.println("Total Shopping Cart value= $ "+shoppingCart.calculateTotalPrice() );
    }

}
