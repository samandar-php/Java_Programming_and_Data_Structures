package task10_4;


public class MyPoint {
    private final double x;
    private final double y;
    public MyPoint() {
        this(0, 0);
    }
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}
