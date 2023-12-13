package ABitofGeometry;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
        Circulo();
    }
    public static void Circulo() {
        Scanner scanner = new Scanner(System.in);
        int raio = scanner.nextInt();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do Circulo é: %.2f\n", area);
    }
}