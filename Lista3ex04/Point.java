package Lista3ex04;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int getQuadrante() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0; // O ponto está sobre um dos eixos ou na origem
        }
    }

    public double calcularDistancia(Point otherPoint) {
        double deltaX = this.x - otherPoint.x;
        double deltaY = this.y - otherPoint.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}