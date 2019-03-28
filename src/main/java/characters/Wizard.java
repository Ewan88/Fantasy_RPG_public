package characters;

import monsters.Monster;

public class Wizard extends Character {

    public Wizard(){
        this.updateHp(-20);
        this.setMaxhp(this.getHp());
    }

    @Override
    public void attack(Monster target){
        int ulti = (int)(Math.random() * 1000 + 1);
        if (ulti >= 900){
            target.updateHp(-100);
        } else{
            int min = currentItem.getMinDmg();
            int max = currentItem.getMaxDmg();
            int damage = (int)(Math.random() * max + min);
            target.updateHp(-damage);
        }
    }

}
