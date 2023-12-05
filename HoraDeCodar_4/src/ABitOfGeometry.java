//Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas.
// O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.

import java.util.Scanner;

public class ABitOfGeometry {
    public static void main(String[] args){
        ABitOfGeometry();
    }
    public static void ABitOfGeometry() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int idade = scanner.nextInt();

        System.out.printf("Olá, %s sua idade é %d", name , idade);
    }
}
