import java.util.Scanner;
// Faça um programa que leia um valor informado pelo usuário e diga se
// o valor informado é positivo, negativo ou neutro.
public class QualEhMaior2 {
    public static void main(String[] args){
        QualEhMaior2();
    }
    public static void QualEhMaior2() {
        Scanner scanner = new Scanner(System.in);
        int numero1  = scanner.nextInt();
        int numero2  = scanner.nextInt();
        int numero3  = scanner.nextInt();
        int numero4  = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.printf("Maior numero: %d", numero1);
        } else if ( numero2 > numero3) {
            System.out.printf("Maior numero: %d", numero2);
        } else if ( numero3 > numero4) {
            System.out.printf("Maior numero: %d", numero3);
        } else {
            System.out.printf("Maior numero: %d", numero4);
        }
    }
}