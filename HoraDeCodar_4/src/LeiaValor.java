import java.util.Scanner;
// Faça um programa que leia um valor informado pelo usuário e diga se
// o valor informado é positivo, negativo ou neutro.
public class LeiaValor {
    public static void main(String[] args){
        LeiaValor();
    }
    public static void LeiaValor() {
        Scanner scanner = new Scanner(System.in);
        int numero  = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Seu numero é positivo");
        } else if ( numero == 0) {
            System.out.println("Seu numero é neutro");
        } else {
            System.out.println("Seu numero é negativo");
        }
    }
}