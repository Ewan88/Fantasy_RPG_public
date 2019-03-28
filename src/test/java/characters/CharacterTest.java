package characters;

import items.Item;
import monsters.Monster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CharacterTest {

    Character barbarian, dwarf, knight, warlock, wizard;
    Item sword, axe, club, fireball, lightning, potion, herb;
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

        sword = new Item(6, 15);
        axe = new Item(1, 20);
        club = new Item(4, 14);
        fireball = new Item(5, 25);
        lightning = new Item(1, 30);
        potion = new Item(5,15);
        herb = new Item(2,3);

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
        boolean expected = barbarian.getHp() >= 115;
        assertEquals(true, expected);
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
        assertTrue(orc.getHp() >= 185);
    }
}
