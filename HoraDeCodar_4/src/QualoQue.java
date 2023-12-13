import java.util.Scanner;
public class QualoQue {
    public static void main(String[] args){
        QualoQue();
    }
    public static void QualoQue() {
        Scanner scanner = new Scanner(System.in);
        int numero1  = scanner.nextInt();
        int numero2  = scanner.nextInt();
        int numero3  = scanner.nextInt();

        if ((numero1 >= numero2 && numero1 >= numero3) || (numero1 <= numero2 && numero1 <= numero3)) {
            System.out.println(numero2 + numero3);
        } else if ((numero2 >= numero1 && numero2 >= numero3) || (numero2 <= numero1 && numero2 <= numero3)) {
            System.out.println(numero1 + numero3);
        } else {
            System.out.println(numero1 + numero2);
        }
    }
}