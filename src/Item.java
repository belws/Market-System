/*
    Since this is eventually going to be used for Minecraft Forge purposes,
    I will try to make classes Minecraft oriented.
 */
public class Item {
    String name; // I decided Item having only name for now is enough.

    public Item(String name) {
        if(name == null) throw new IllegalArgumentException("Item must have a name!");
        this.name = name;
    }
}
