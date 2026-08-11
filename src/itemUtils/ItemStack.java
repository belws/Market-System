package itemUtils;
/*
    This class represents an Item and it's quantity.
 */
public class ItemStack {
    Item item;
    int quantity;

    public ItemStack(Item item, int quantity){
        this.item = item;
        if(quantity < 1){
            quantity = 1; //Set quantity to 1.
            System.out.println("Quantity must be positive");
        }
        else this.quantity = quantity;
    }
}

