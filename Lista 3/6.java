import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConjuntoDePalavras {
    private Set<String> conjuntoPalavras;

    public ConjuntoDePalavras() {
        conjuntoPalavras = new HashSet<>();
        conjuntoPalavras.add("java");
        conjuntoPalavras.add("coleção");
        conjuntoPalavras.add("programação");
        conjuntoPalavras.add("interface");
        conjuntoPalavras.add("herança");
    }

    public boolean contemTodas(String palavras) {
        String[] palavrasArray = palavras.split(" "); 
        for (String palavra : palavrasArray) {
            if (!conjuntoPalavras.contains(palavra)) {
                return false; 
            }
        }
        return true;
    }

    // blup
    public static void main(String[] args) {
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma sequência de palavras separadas por espaço: ");
        String entrada = scanner.nextLine();


        boolean resultado = conjunto.contemTodas(entrada);
        System.out.println("Todas as palavras estão no conjunto? " + resultado);

        scanner.close();
    }
}
