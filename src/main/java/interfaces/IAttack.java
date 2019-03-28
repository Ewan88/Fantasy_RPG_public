package interfaces;

import items.Item;
import monsters.Monster;

public interface IAttack {

    public void attack(Item weapon, Monster target);
}
