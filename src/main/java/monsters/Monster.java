package monsters;

public class Monster {
    int hp, damage;

    public Monster(int hp, int damage){
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int value) {
        this.hp += value;
    }

    public int getDamage() {
        return damage;
    }

}
