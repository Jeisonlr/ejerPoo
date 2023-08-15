package herencia.FigurasGeometricas;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        Triangulo triangulo = new Triangulo(6, 4, 5, 5, 7);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());

        Circulo circulo = new Circulo(3);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
    }
}