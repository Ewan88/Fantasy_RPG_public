package monsters;

import characters.Character;
import characters.Knight;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MonsterTest {
    Monster orc;
    Monster goblin;
    Character knight;

    @Before
    public void setUp(){
        orc = new Monster(250, 20);
        goblin = new Monster(120, 15);
        knight = new Knight();
    }

    @Test
    public void monsterHasHP() {
        assertEquals(250, orc.getHp());
        assertEquals(120, goblin.getHp());
    }

    @Test
    public void monsterCanAttack() {
        orc.attack(knight);
        assertTrue(knight.getHp() >= 80);
    }
}
