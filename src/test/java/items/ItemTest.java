package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    Item sword;
    Item potion;

    @Before
    public void setUp(){
        sword = new Item(-10);
        potion = new Item(5);
    }

    @Test
    public void swordHasNegativeInt() {
        assertEquals(-10, sword.getEffect());
    }

    @Test
    public void potionhasPositiveInt() {
        assertEquals(5, potion.getEffect());
    }
}
