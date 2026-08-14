package itemUtils;

public enum ItemCategory {
    FOOD("This item is consumable"),
    EQUIPMENT("This item can be equipped"),
    BLOCKS("This item can be placed");
    String description;
    ItemCategory(String description){
    this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
