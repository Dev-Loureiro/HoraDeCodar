import java.util.Scanner;

public class Parabens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0;

        System.out.println("Informe as notas das 4 avaliações:");

        for (int i = 1; i <= 4; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        scanner.close();

        double media = somaNotas / 4;

        System.out.println("Média do semestre: " + media);

        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado!");
        }
    }
}
