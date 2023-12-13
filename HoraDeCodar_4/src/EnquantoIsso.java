import java.util.Scanner;

public class EnquantoIsso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double primeiroValor = scanner.nextDouble();

        double segundoValor;
        do {
            System.out.println("Informe o segundo valor (não pode ser zero nem negativo):");
            segundoValor = scanner.nextDouble();
        } while (segundoValor <= 0);

        scanner.close();

        double resultadoDivisao = primeiroValor / segundoValor;
        System.out.println("O resultado da divisão é: " + resultadoDivisao);
    }
}
