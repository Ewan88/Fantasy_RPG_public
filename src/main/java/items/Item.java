package items;

public class Item {
    private int minDmg;
    private int maxDmg;

    public Item(int minDmg, int maxDmg){
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
    }

    public int getMinDmg() {
      return minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }
}
