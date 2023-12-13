package ABitofGeometry;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args){
        Quadrado();
    }
    public static void Quadrado() {
        Scanner scanner = new Scanner(System.in);
        int lado = scanner.nextInt();
        int area = lado*lado;

        System.out.printf("A área do quadrado é: %d", area);
    }
}
