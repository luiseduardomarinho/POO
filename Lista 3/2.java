
public interface AreaCalculavel {
    double calculaArea();
}

class Quadrado implements AreaCalculavel {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}

class Retangulo implements AreaCalculavel {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }
}

class Circulo implements AreaCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}

//testerrr
public class Teste {
    public static void main(String[] args) {
        AreaCalculavel[] formas = new AreaCalculavel[5];
        
        formas[0] = new Quadrado(4);
        formas[1] = new Retangulo(3, 5);
        formas[2] = new Circulo(2);
        formas[3] = new Retangulo(6, 7);
        formas[4] = new Quadrado(5);
        
        for (AreaCalculavel forma : formas) {
            System.out.println("Área: " + forma.calculaArea());
        }
    }
}
