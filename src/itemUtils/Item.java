package itemUtils;

/*
    Since this is eventually going to be used for Minecraft Forge purposes,
    I will try to make classes Minecraft oriented.
 */
public class Item {
    String name; // I decided itemUtils.Item having only name for now is enough.
    ItemCategory itemCategory;

    public Item(String name, ItemCategory itemCategory) {
        if(name == null) throw new IllegalArgumentException("itemUtils.Item must have a name!");
        this.name = name;
        this.itemCategory = itemCategory;
    }

    //Getters
    public String getName() {
        return name;
    }

    public ItemCategory getItemCategory(){
        return itemCategory;
    }
    //I need to override .equals() for Item so ItemStacks can get quantity accordingly.
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Item otherItem){
            return getName().equals(otherItem.getName());
        }
        return false;
    }

}
