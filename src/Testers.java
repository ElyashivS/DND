import Players.Mage;
import Players.Player;
import Players.Warrior;
import Tiles.Health;

public class Testers {
    public static void main(String[] args) {
        Health h = new Health(10, 10);
        Player p = new Warrior("John", h, 10, 10, 10, 1, 10, 10);

        System.out.println("Health Pool is: " + h.getHealthPool());
        p.levelUp();
        System.out.println("Health Pool is: " + h.getHealthPool());
    }
}
