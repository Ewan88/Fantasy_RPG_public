package characters;

import items.Item;

import java.util.ArrayList;

public abstract class Character {

    private ArrayList<Item> items;
    private Item currentItem;

    public Character(){
        this.items = new ArrayList<Item>();
        this.currentItem = null;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void selectItem(Item item) {
        int i = this.items.indexOf(item);
        if (i >= 0){
            this.currentItem = this.items.get(i);
        }
    }

    public Item getCurrentItem() {
        return currentItem;
    }
}
