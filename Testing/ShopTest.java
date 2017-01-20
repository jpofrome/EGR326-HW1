import org.junit.Assert;
import org.junit.Test;

public class ShopTest {
    @Test
    public void getNameTest() {
        //given
        Item itemObj = new Item("Death Note", 1.0);
        //when
        itemObj.getName();
        //then
        Assert.assertEquals("wrong name", "Death Note", itemObj.getName());
    }

    @Test
    public void priceForDiscountedItemTest() {
        //given
        DiscountedItem obj = new DiscountedItem("Notebook", 3.0, 10, 2.0);
        //when
        obj.priceFor(23);
        //then
        Assert.assertEquals("wrong price", 49, obj.priceFor(23), 0.001);
    }
}
