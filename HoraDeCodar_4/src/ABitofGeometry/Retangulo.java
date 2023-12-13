package ABitofGeometry;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args){
        Retangulo();
    }
    public static void Retangulo() {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int altura = scanner.nextInt();
        int area = base*altura;

        System.out.printf("A área do retangulo é: %d", area);
    }
}
