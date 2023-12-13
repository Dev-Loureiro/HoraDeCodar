import java.util.Scanner;

public class CincoVezes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe o primeiro valor:");
        int numero1 = scanner.nextInt();

        System.out.println("Informe o segundo valor (diferente do primeiro):");
        int numero2 = scanner.nextInt();

        System.out.println("Informe o terceiro valor (diferente dos anteriores):");
        int numero3 = scanner.nextInt();

        System.out.println("Informe o quarto valor (diferente dos anteriores):");
        int numero4 = scanner.nextInt();

        System.out.println("Informe o quinto valor (diferente dos anteriores):");
        int numero5 = scanner.nextInt();


        scanner.close();


        int somaDosDoisMaiores = calcularSomaDosDoisMaiores(numero1, numero2, numero3, numero4, numero5);

        System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);
    }


    private static int calcularSomaDosDoisMaiores(int a, int b, int c, int d, int e) {
        int[] valores = {a, b, c, d, e};

        java.util.Arrays.sort(valores);

        return valores[3] + valores[4];
    }
}
