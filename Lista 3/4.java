import java.util.ArrayList;
import java.util.List;


class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}

//ebaaaa
public class TestaCirculos {
    public static void main(String[] args) {

        List<Circulo> circulos = new ArrayList<>();

        circulos.add(new Circulo(2));
        circulos.add(new Circulo(3.5));
        circulos.add(new Circulo(4));
        circulos.add(new Circulo(5.5));
        circulos.add(new Circulo(6));

        for (Circulo circulo : circulos) {
            System.out.printf("Área do círculo com raio %.2f: %.2f%n", circulo.raio, circulo.calculaArea());
        }
    }
}
