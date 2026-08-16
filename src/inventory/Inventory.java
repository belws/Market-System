package inventory;

import itemUtils.Item;
import itemUtils.ItemStack;

import java.util.ArrayList;

public class Inventory {
    ArrayList<ItemStack> inventory = new ArrayList<>();
    ItemStack itemStack;

    public Inventory(){
    }

    public boolean getContent(){
        for(ItemStack stack : inventory){
            System.out.println(stack.getItem().getName() + "x" + stack.getQuantity());
        }
        return true;
    }
}
