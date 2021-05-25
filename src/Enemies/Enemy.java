package Enemies;

public abstract class Enemy {
    private int expValue;

    public Enemy(int expValue) {
        this.expValue = expValue;
    }

    public int getExpValue() {
        return expValue;
    }
}
