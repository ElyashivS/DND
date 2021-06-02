import Players.Mage;
import Players.Player;
import Players.Warrior;
import Tiles.Health;

public class Testers {
    public static void main(String[] args) {
        Health h = new Health(10, 10);
        Player w = new Warrior("John", h, 10, 10, 10, 1, 10, 10);
        Player m = new Mage("Harry", h, 10, 10, 10, 1, 10, 10, 10, 10, 10, 10);

        System.out.println("Health Pool is: " + h.getHealthPool());
        System.out.println("AttackPts is: " + w.getAttackPts());
        System.out.println("DefencePts is:" + w.getDefensePts());
        w.levelUp();
        System.out.println("Health Pool is: " + h.getHealthPool());
        System.out.println("AttackPts is: " + w.getAttackPts());
        System.out.println("DefencePts is:" + w.getDefensePts());
    }
}
