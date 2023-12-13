package ABitofGeometry;

import java.util.Scanner;

public class Losango {
    public static void main(String[] args){
        Losango();
    }
    public static void Losango() {
        Scanner scanner = new Scanner(System.in);
        int dMaior = scanner.nextInt();
        int dMenor = scanner.nextInt();
        int area = (dMaior*dMenor)/2;

        System.out.printf("A área do losango é: %d", area);
    }
}
