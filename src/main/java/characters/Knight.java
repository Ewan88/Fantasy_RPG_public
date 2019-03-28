package characters;

public class Knight extends Character {

    int minArmor, maxArmor;

    public Knight(){
        this.minArmor = 0;
        this.maxArmor = 5;
    }

    @Override
    public void updateHp(int value){
        if (value < 0){
            int absorbtion = (int)(Math.random() * this.maxArmor + this.minArmor);
            value += absorbtion;
            this.hp += value;
        } else {
            this.hp += value;
        }
    }
}
