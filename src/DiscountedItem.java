public class DiscountedItem extends Item{
    //variables
    private int bulkQuantity;
    private double bulkPrice;

    //constructor
    public DiscountedItem(String name, double price, int bulkQuantity, double bulkPrice) {
        super(name, price);
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

    //override priceFor
    @Override
    public double priceFor (int quantity) {
        return ((quantity / bulkQuantity) * bulkPrice) + ((quantity % bulkQuantity) * price);
        /*if (quantity >= bulkQuantity) {
            if (quantity % bulkQuantity == 0)
                return (quantity * bulkPrice);
            else
                return ((((quantity - (quantity % bulkQuantity)) / bulkQuantity) * bulkPrice) +
                        ((quantity % bulkQuantity) * price));
        } else if (quantity < bulkQuantity)
            return (quantity * price);
        else
            return 0;
            */
    }

    //gives name and price plus bulk amount and bulk price
    @Override
    public String toString() {
        return (name + " costs $" + price + ". (" + bulkQuantity + " for " + bulkPrice);
    }
}


//math for priceFor
//x = quan % bq
//q2 = q-x
//y = q2 / bq
//y * bp + x * p