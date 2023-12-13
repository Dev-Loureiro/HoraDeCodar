import java.util.Scanner;

public class PassouNoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados = 0;

        do {
            double somaNotas = 0;

            System.out.println("Informe as 6 notas do aluno:");

            for (int i = 1; i <= 6; i++) {
                System.out.print("Nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double mediaFinal = somaNotas / 6;

            System.out.printf("Média Final: %.2f%n", mediaFinal);

            if (mediaFinal >= 6.5) {
                System.out.println("Aluno Aprovado!");
                alunosAprovados++;
            } else {
                System.out.println("Aluno Reprovado.");
            }

            System.out.print("Calcular a média de outro aluno? (S/N): ");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }

        } while (true);

        System.out.println("Programa encerrado. Total de alunos aprovados: " + alunosAprovados);

        scanner.close();
    }
}
