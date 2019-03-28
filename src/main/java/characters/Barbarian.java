package characters;



public class Barbarian extends Character {

    public Barbarian(){
        this.updateHp(20);
        this.setMaxhp(this.getHp());
    }
}
