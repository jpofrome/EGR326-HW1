import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalog implements Iterable<Item>{
    //variables
    String storeName;
    protected List<Item> catalog;

    //constructor
    //?
    public Catalog(String storeName) {
        this.storeName = storeName;
        catalog = new ArrayList<Item>();
    }

    //adds item to end of catalog collection of items
    public void add(Item item) {catalog.add(item);}

    // returns item with matching name
    public Item getItem(String name) {
        for (Item itemObj : catalog) {
            if (itemObj.getName().equals(name))
                return itemObj;
        }
        return null;
    }

    //returns store name
    public String getStoreName() {return this.storeName;}

    //iterator
    @Override
    public Iterator<Item> iterator() {return catalog.iterator();}
}