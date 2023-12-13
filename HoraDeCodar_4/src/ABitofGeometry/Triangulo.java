package ABitofGeometry;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){
        Triangulo();
    }
    public static void Triangulo() {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int altura = scanner.nextInt();
        int area = (base*altura)/2;

        System.out.printf("A área do Triangulo é: %d", area);
    }
}