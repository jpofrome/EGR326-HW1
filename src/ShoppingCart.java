import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //variables
    private boolean discount;
    protected List<Purchase> cart;
    private static double discountPercentage = 10;
    private static int discountQuantity = 20;

    //getters
    public static double getDiscountPercentage() {return discountPercentage;}
    public static int getDiscountQuantity() {return discountQuantity;}

    //constructor: creates empty shopping cart of purchase
    public ShoppingCart() {
        discount = false;
        cart = new ArrayList<Purchase>();
    }

    //add a purchase to cart and replace previous purchases
    public void add(Purchase purchase) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).matches(purchase)) {
                cart.remove(i);
                cart.add(purchase);
                return;
            }
        }
        cart.add(purchase);
    }

    //delete all purchases
    public void clearAll() {cart.clear();}

    //gets total cost in shopping cart
    public double getTotal() {
        double totalCost = 0.0;
        for (Purchase purchase : cart) {
            totalCost += purchase.getPrice();
            System.out.println(purchase.item.getName());
        }
        return totalCost;
    }

    //returns true if there is a discount
    public boolean hasDiscount() {return discount;}

    //setter
    public void setDiscount(boolean discount) {this.discount = discount;}

    //returns total quantity of cart
    public int totalQuantity() {
        int totalQuantity = 0;
        for (Purchase purchase : cart) {
            totalQuantity += purchase.getQuantity();
        }
        return totalQuantity;
    }

}