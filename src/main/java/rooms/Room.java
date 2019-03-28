package rooms;

import characters.Character;
import items.Item;
import monsters.Monster;

import java.util.ArrayList;

public class Room {

    ArrayList<Character> characters;
    ArrayList<Monster> monsters;
    ArrayList<Item> loot;

    public Room(){
        characters = new ArrayList<Character>();
        monsters = new ArrayList<Monster>();
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void addCharacters(Character character) {
        this.characters.add(character);
    }

    public void addMonsters(Monster monster) {
        this.monsters.add(monster);
    }
}
