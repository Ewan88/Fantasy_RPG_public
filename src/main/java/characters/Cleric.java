package characters;

import items.Item;

public class Cleric extends Character {

    public Cleric(){

    }

    public void heal(Item item, Character target){
        if (target.getHp() < target.getMaxhp() && target.getHp() > 0){
            int min = item.getMinDmg();
            int max = item.getMaxDmg();
            int damage = (int)(Math.random() * max + min);
            target.updateHp(damage);
        }
    }

}
