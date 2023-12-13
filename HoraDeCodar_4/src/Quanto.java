import java.util.Scanner;

public class Quanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroNumero, segundoNumero;

        do {
            System.out.println("Informe o primeiro número inteiro:");
            primeiroNumero = scanner.nextInt();

            System.out.println("Informe o segundo número inteiro (maior que o primeiro):");
            segundoNumero = scanner.nextInt();

            if (primeiroNumero >= segundoNumero) {
                System.out.println("Erro: O primeiro número deve ser menor que o segundo. Por favor, informe novamente.");
            }
        } while (primeiroNumero >= segundoNumero);

        scanner.close();

        double mediaAritmetica = (primeiroNumero + segundoNumero) / 2.0;

        System.out.println("Média Aritmética: " + mediaAritmetica);
        System.out.println("Números inteiros entre " + primeiroNumero + " e " + segundoNumero + ":");

        int i = primeiroNumero + 1;
        while (i < segundoNumero) {
            System.out.print(i + " ");
            i++;
        }
    }
}

