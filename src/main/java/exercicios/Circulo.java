package exercicios;

public class Circulo {
    public Double area;
    public Double raio;
    public final Double pi = 3.1416;

    public Double calcularArea(){
        return area = pi * (raio * raio);

    }

    public Double calcularPerimetro(){
        return 2 * (pi * raio);
    }
}
