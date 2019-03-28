package characters;

import monsters.Monster;

public class Dwarf extends Character {

    public Dwarf(){
        this.updateHp(40);
        this.setMaxhp(this.getHp());
    }

    @Override
    public void attack(Monster target){
        int ulti = (int)(Math.random() * 1000 + 1);
        if (ulti >= 900){
            int min = currentItem.getMinDmg();
            int max = currentItem.getMaxDmg();
            int damage1 = (int)(Math.random() * max + min);
            int damage2 = (int)(Math.random() * max + min);
            int damage3 = (int)(Math.random() * max + min);
            int damage4 = (int)(Math.random() * max + min);
            target.updateHp(-damage1);
            target.updateHp(-damage2);
            target.updateHp(-damage3);
            target.updateHp(-damage4);
        } else{
            int min = currentItem.getMinDmg();
            int max = currentItem.getMaxDmg();
            int damage = (int)(Math.random() * max + min);
            target.updateHp(-damage);
        }
    }

}
