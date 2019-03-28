package rooms;

import characters.Barbarian;
import characters.Character;
import monsters.Monster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {

    Room room;
    Monster orc;
    Monster goblin;
    Character barbarian;

    @Before
    public void setup(){
        room = new Room();
        barbarian = new Barbarian();
        orc = new Monster(250, 5);
        goblin = new Monster(120, 15);
    }

    @Test
    public void canPopulate(){
        room.addCharacters(barbarian);
        room.addMonsters(orc);
        room.addMonsters(goblin);
        assertEquals(1, room.getCharacters().size());
        assertEquals(2, room.getMonsters().size());
    }

}
