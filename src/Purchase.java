public class Purchase {
    //variables
    int quantity;
    Item item;

    //constructor
    public Purchase(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    //getters
    public double getPrice() {return item.priceFor(quantity);}
    public int getQuantity() {return quantity;}

    //returns true if quantity is 0
    public boolean isEmpty() {return (quantity == 0);}

    //returns true if this purchase is the same item as the given other purchase
    public boolean matches(Purchase purchase) {
        return ((item.getName().equals(purchase.item.getName())));
    }

    //setter
    public void updateQuantity(int quantity) {this.quantity = quantity;}
}