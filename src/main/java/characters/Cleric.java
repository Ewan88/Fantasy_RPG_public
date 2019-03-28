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
            if (damage > (target.getMaxhp() - target.getHp())){
                target.updateHp(target.getMaxhp() - target.getHp());
            } else {
                target.updateHp(damage);
            }
        }
    }

}
