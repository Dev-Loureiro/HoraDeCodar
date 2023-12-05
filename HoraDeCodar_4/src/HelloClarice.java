//Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
import java.util.Scanner;

public class HelloClarice {
    public static void main(String[] args){
        HelloClarice();
    }
    public static void HelloClarice() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.printf("Olá, %s", name);
    }
} 
