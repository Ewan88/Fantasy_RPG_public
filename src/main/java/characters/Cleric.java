package characters;

import items.Item;

public class Cleric extends Character{

    public Cleric(){

    }

    public void heal(Item item, Character target){
        target.updateHp(item.getEffect());
    }

}
