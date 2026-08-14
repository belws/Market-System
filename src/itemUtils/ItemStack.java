package itemUtils;
/*
    This class represents an Item and it's quantity.
 */
public class ItemStack {
    Item item;
    int quantity;

    public ItemStack(Item item, int quantity){
        if(item == null) throw new IllegalArgumentException("Item cannot be null!");
        this.item = item;
        if(quantity < 1){
            quantity = 1; //Set quantity to 1.
            System.out.println("Quantity must be positive");
        }
        else this.quantity = quantity;
    }
    //Getters
    public Item getItem(){
        return item;
    }
    public int getQuantity(){
        return quantity;
    }

    //Setters
    public boolean setQuantity(int quantity){
        if(quantity < 1){
            quantity = 1;
            System.out.println("Quantity must be positive");
        }
        this.quantity = quantity;
    return true;
    }
}

