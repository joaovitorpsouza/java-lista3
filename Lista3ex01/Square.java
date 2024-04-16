package Lista3ex01;

public class Square {

    private double lado;

    public Square(double lado) {
        this.lado = lado;
    }
    
    public double getCalcularArea() {
        double valorarea = lado * lado;
        return valorarea;
    }

    public double getCalcularPerimetro() {
        double valorperimetro = lado * 4;
        return valorperimetro;
    }
}