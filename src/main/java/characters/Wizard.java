package characters;

public class Wizard extends Character {

    public Wizard(){
        this.updateHp(-20);
        this.setMaxhp(this.getHp());
    }

}
