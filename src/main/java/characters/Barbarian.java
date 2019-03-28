package characters;


import monsters.Monster;

public class Barbarian extends Character {
    int powerHit;

    public Barbarian(){
        this.updateHp(20);
        this.setMaxhp(this.getHp());
        this.powerHit = 9;
    }

    @Override
    public void attack(Monster target) {
        int min = currentItem.getMinDmg();
        int max = currentItem.getMaxDmg();
        int damage = (int)(Math.random() * max + min);
        int increase = (int)(Math.random() * this.powerHit + 1);
        int totalDmg = -damage - increase;
        target.updateHp(totalDmg);
    }
}
