package characters;

public class Warlock extends Character {

    public Warlock(){
        this.updateHp(-10);
        this.setMaxhp(this.getHp());
    }



}
