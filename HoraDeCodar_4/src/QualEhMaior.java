import java.util.Scanner;
// Faça um programa que leia um valor informado pelo usuário e diga se
// o valor informado é positivo, negativo ou neutro.
public class QualEhMaior {
    public static void main(String[] args){
        QualEhMaior();
    }
    public static void QualEhMaior() {
        Scanner scanner = new Scanner(System.in);
        int numero1  = scanner.nextInt();
        int numero2  = scanner.nextInt();
        int numero3  = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.printf("Maior numero: %d", numero1);
        } else if ( numero2 > numero3) {
            System.out.printf("Maior numero: %d", numero2);
        } else {
            System.out.printf("Maior numero: %d", numero3);
        }
    }
}