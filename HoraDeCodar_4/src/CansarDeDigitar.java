import java.util.Scanner;

public class CansarDeDigitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        System.out.println("Informe 10 valores:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
            System.out.println(valor);
        }

        scanner.close();

        double media = soma / 10;
        System.out.println("Média aritmética dos valores: " + media);
    }
}
