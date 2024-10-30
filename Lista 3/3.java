
public interface Tributavel {
    double calculaTributos();
}

abstract class Conta {
    protected double saldo;

    public void depositar(double valor) { saldo += valor; }
    public void sacar(double valor) { saldo = (saldo >= valor) ? saldo - valor : saldo; }
    public double obterSaldo() { return saldo; }
}

class ContaCorrente extends Conta implements Tributavel {
    @Override
    public double calculaTributos() { return saldo * 0.01; }
}

class ContaPoupanca extends Conta {}

class SeguroDeVida implements Tributavel {
    @Override
    public double calculaTributos() { return 42.0; }
}

// tetixs
public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(); cc.depositar(1000);
        ContaPoupanca cp = new ContaPoupanca(); cp.depositar(2000);
        SeguroDeVida seguro = new SeguroDeVida();

        System.out.println("Saldo Conta Corrente: " + cc.obterSaldo() + " | Tributo: " + cc.calculaTributos());
        System.out.println("Saldo Conta Poupança: " + cp.obterSaldo() + " | Tributo: Não aplicável");
        System.out.println("Tributo Seguro de Vida: " + seguro.calculaTributos());
    }
}
