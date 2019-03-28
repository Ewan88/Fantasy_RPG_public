package characters;

import interfaces.IAttack;
import items.Item;
import monsters.Monster;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Random;

public abstract class Character implements IAttack {

    protected int hp, maxhp, armor;
    protected ArrayList<Item> items;
    protected Item currentItem;

    public Character(){
        this.hp = 100;
        this.maxhp = this.hp;
        this.items = new ArrayList<Item>();
        this.currentItem = null;
    }

    public int getHp() {
        return hp;
    }

    public void updateHp(int value) {
        this.hp += value;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
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
        int min = currentItem.getMinDmg();
        int max = currentItem.getMaxDmg();
        int damage = (int)(Math.random() * max + min);
        target.updateHp(-damage);
    }

}
