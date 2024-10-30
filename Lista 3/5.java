import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteHashSetCPF {
    public static void main(String[] args) {
        Set<String> cpfs = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o CPF " + (i + 1) + ": ");
            String cpf = scanner.nextLine();
            cpfs.add(cpf); 
        }

        scanner.close();

        System.out.println("\nCPFs únicos armazenados no conjunto:");
        for (String cpf : cpfs) {
            System.out.println(cpf);
        }
    }
}
