interface Tributavel {
    double getValorTributo();
}

class ContaCorrente implements Tributavel {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getValorTributo() {
        return saldo * 0.01; 
    }
}

class SeguroDeVida implements Tributavel {
    @Override
    public double getValorTributo() {
        return 42; 
    }
}

class GerenciadorDeImpostoDeRenda {
    private double totalTributos;

    public void adicionar(Tributavel t) {
        totalTributos += t.getValorTributo();
    }

    public double getTotalTributos() {
        return totalTributos;
    }
}

public class Main {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        
        gerenciador.adicionar(new ContaCorrente(1000));
        gerenciador.adicionar(new ContaCorrente(2000));
        gerenciador.adicionar(new SeguroDeVida());
        
        System.out.println("Total de tributos: " + gerenciador.getTotalTributos());
    }
}
