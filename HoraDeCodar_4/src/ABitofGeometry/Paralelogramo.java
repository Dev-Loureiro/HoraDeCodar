package ABitofGeometry;

import java.util.Scanner;

public class Paralelogramo {
    public static void main(String[] args){
        Paralelogramo();
    }
    public static void Paralelogramo() {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int altura = scanner.nextInt();
        int area = base*altura;

        System.out.printf("A área do Paralelogramo é: %d", area);
    }
}