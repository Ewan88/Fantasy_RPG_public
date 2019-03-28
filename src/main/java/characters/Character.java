package characters;

import interfaces.IAttack;
import items.Item;
import monsters.Monster;

import java.util.ArrayList;

public abstract class Character implements IAttack {

    private int hp;
    private ArrayList<Item> items;
    private Item currentItem;

    public Character(){
        this.hp = 100;
        this.items = new ArrayList<Item>();
        this.currentItem = null;
    }

    public int getHp() {
        return hp;
    }

    public void updateHp(int value) {
        this.hp += value;
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

    public void attack(Monster target){
        target.updateHp(currentItem.getEffect());
    }
}
