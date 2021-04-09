import java.util.*;

public abstract class ItemPack extends Item {
    private ArrayList<Item> items;

    public ItemPack(String name){
        super(name);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems(){
        return items;
    }
}
