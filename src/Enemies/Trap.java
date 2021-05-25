package Enemies;

public class Trap extends Enemy{
    private int visibilityTime;
    private int invisibilityTime;
    private int ticksCount;
    private boolean visible = true;

    public Trap(int expValue, int visibilityTime, int invisibilityTime, int ticksCount, boolean visible) {
        super(expValue);
        this.visibilityTime = visibilityTime;
        this.invisibilityTime = invisibilityTime;
        this.ticksCount = ticksCount;
        this.visible = visible;
    }
}
