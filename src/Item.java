public class Item {
    //variables
    protected String name;
    protected double price;

    //constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getter
    public String getName() {return this.name;}

    //takes quantity of an item and gives price
    public double priceFor (int quantity) {return (price * quantity); }

    //gives name and price without discounts or quantity
    //LOOK AT PRICE NEEDING ONLY 2 DECIMAL PLACES????
    @Override
    public String toString () {
        return (name + " costs $" + price);
    }
}