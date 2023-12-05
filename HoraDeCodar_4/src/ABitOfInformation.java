//Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará
// idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

import java.util.Scanner;

public class ABitOfInformation {
    public static void main(String[] args){
        ABitOfInformation();
    }
    public static void ABitOfInformation() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int idade = scanner.nextInt();

        System.out.printf("Olá, %s sua idade é %d", name , idade);
    }
}
