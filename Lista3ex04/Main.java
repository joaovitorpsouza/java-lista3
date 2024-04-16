package Lista3ex04;

public class Main {
    
    public static void main(String[] args) {
        // Criação de dois pontos para teste
        Point p1 = new Point(1, 1);
        Point p2 = new Point(-1, -1);

        // Verificação de quadrantes
        System.out.println("Quadrante do Ponto 1: " + p1.getQuadrante());
        System.out.println("Quadrante do Ponto 2: " + p2.getQuadrante());

        // Cálculo e exibição da distância
        System.out.printf("Distância entre p1 e p2: %.2f\n", p1.calcularDistancia(p2));
    }
}