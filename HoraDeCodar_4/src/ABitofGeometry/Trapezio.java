package ABitofGeometry;

import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args){
        Trapezio();
    }
    public static void Trapezio() {
        Scanner scanner = new Scanner(System.in);
        int bMaior = scanner.nextInt();
        int bMenor = scanner.nextInt();
        int h = scanner.nextInt();
        int area = ((bMaior+bMenor)*h)/2;

        System.out.printf("A área do trapezio é: %d", area);
    }
}