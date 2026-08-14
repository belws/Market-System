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




    public boolean hasItem(Item item){
        return this.item.equals(item);
    }
    public boolean addItem(int quantity){
        if(quantity<1){
            System.out.println("Quantity must be positive");
            return false;
        }
        setQuantity(getQuantity() + quantity);
        return true;
    }
    public boolean removeItem(int quantity){
        if(quantity >= getQuantity()){
            System.out.println("You cant remove the ItemStack yet");
            // Logic for this will be next
            setQuantity(1);
            return false;
        }
        setQuantity(getQuantity() - quantity);
        return true;
    }

/*
    I think for now an item stack can be equal to another item stack if their items are considered equal.
    Also I might remove this later but I wanted to see if I got the concept down.
 */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ItemStack stack){
            return getItem().equals(stack.getItem());
        }
        return false;
    }
}

