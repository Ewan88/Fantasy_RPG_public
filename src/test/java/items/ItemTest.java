package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    Item sword;


    @Before
    public void setUp(){
        sword = new Item(2, 4);

    }

    @Test
    public void itemHasMinDmg() {
        assertEquals(2, sword.getMinDmg());
    }

    @Test
    public void itemHasMaxDmg() {
        assertEquals(4, sword.getMaxDmg());
    }
}
