package Board;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double range (Point p, Point q) {
        return Math.sqrt(Math.pow((p.getX()-q.getX()), 2) + Math.pow((p.getY()-q.getY()), 2));
    }
}
