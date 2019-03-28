package characters;

import items.Item;
import monsters.Monster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CharacterTest {

    Character barbarian, dwarf, knight, warlock, wizard;
    Item sword, axe, club, fireball, lightning, potion;
    Cleric cleric;

    Monster orc, goblin;

    @Before
    public void setup(){
        barbarian = new Barbarian();
        cleric = new Cleric();
        dwarf = new Dwarf();
        knight = new Knight();
        warlock = new Warlock();
        wizard = new Wizard();

        sword = new Item(-10);
        axe = new Item(-20);
        club = new Item(-15);
        fireball = new Item(-15);
        lightning = new Item(-20);
        potion = new Item(10);

        goblin = new Monster(125, 23);
        orc = new Monster(200, 8);

    }

    @Test
    public void canAddItems(){
        barbarian.addItem(axe);
        assertEquals(1, barbarian.getItems().size());
    }

    @Test
    public void canChooseItem(){
        barbarian.addItem(axe);
        barbarian.selectItem(axe);
        assertEquals(axe, barbarian.getCurrentItem());
        barbarian.selectItem(sword);
        assertEquals(axe, barbarian.getCurrentItem());
    }

    @Test
    public void hasDifferentHP(){
        assertEquals(120, barbarian.getHp());
        assertEquals(100, cleric.getHp());
        assertEquals(100, knight.getHp());
        assertEquals(90, warlock.getHp());
        assertEquals(80, wizard.getHp());
        assertEquals(140, dwarf.getHp());
    }

    @Test
    public void canHeal() {
        barbarian.updateHp(-10);
        cleric.heal(potion, barbarian);
        assertEquals(120, barbarian.getHp());
    }

    @Test
    public void cannotOverheal() {
        cleric.heal(potion, barbarian);
        assertEquals(120, barbarian.getHp());
    }

    @Test
    public void playersCanAttack() {
        knight.addItem(sword);
        knight.selectItem(sword);
        knight.attack(orc);
        assertEquals(190, orc.getHp());
    }
}
