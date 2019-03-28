import characters.*;
import characters.Character;
import items.Item;
import monsters.Monster;
import rooms.Room;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<Room>();
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        ArrayList<Character> characters = new ArrayList<Character>();
        ArrayList<Item> loot = new ArrayList<Item>();
        Character selectedCharacter;
        Room currentRoom;

        Barbarian barbarian = new Barbarian();
        Cleric cleric = new Cleric();
        Dwarf dwarf = new Dwarf();
        Knight knight = new Knight();
        Warlock warlock = new Warlock();
        Wizard wizard = new Wizard();

        Item axe = new Item(2, 15);
        Item club = new Item(5, 10);
        Item sword = new Item(8, 12);
        Item fireball = new Item(1, 30);
        Item lightning = new Item(5, 15);
        Item potion = new Item(0, 25);
        Item herb = new Item(5, 5);
        Item flail = new Item(1, 25);

        barbarian.addItem(flail);
        barbarian.selectItem(flail);
        cleric.addItem(club);
        cleric.selectItem(club);
        dwarf.addItem(axe);
        dwarf.selectItem(axe);
        knight.addItem(sword);
        knight.selectItem(sword);
        warlock.addItem(fireball);
        warlock.selectItem(fireball);
        wizard.addItem(lightning);
        wizard.selectItem(lightning);
        cleric.addItem(potion);
        cleric.addItem(herb);

        System.out.println("Welcome to the Dungeon!");
        System.out.println("\nChoose a class: ");
        System.out.println("a. Barbarian " + barbarian.getMaxhp()
                + "hp " + barbarian.getCurrentItem().getMaxDmg() + "dmg" + " - Increased Damage");
        System.out.println("b. Cleric " + cleric.getMaxhp()
                + "hp " + cleric.getCurrentItem().getMaxDmg() + "dmg" + " - Can Heal");
        System.out.println("c. Dwarf " + dwarf.getMaxhp()
                + "hp " + dwarf.getCurrentItem().getMaxDmg() + "dmg" + " - Berserker Mode");
        System.out.println("d. Knight " + knight.getMaxhp()
                + "hp " + knight.getCurrentItem().getMaxDmg() + "dmg" + " - Armor");
        System.out.println("e. Warlock " + warlock.getMaxhp()
                + "hp " + warlock.getCurrentItem().getMaxDmg() + "dmg" + " - ");
        System.out.println("f. Wizard " + wizard.getMaxhp()
                + "hp " + wizard.getCurrentItem().getMaxDmg() + "dmg" + " - Ultimate");





    }

}
