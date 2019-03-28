package monsters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {
    Monster orc;
    Monster goblin;

    @Before
    public void setUp(){
        orc = new Monster(250, 5);
        goblin = new Monster(120, 15);
    }

    @Test
    public void monsterHasHP() {
        assertEquals(250, orc.getHp());
        assertEquals(120, goblin.getHp());
    }
}
