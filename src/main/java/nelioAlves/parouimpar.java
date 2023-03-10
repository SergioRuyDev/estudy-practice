package nelioAlves;

import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero natural.");
        int numero = scanner.nextInt();
        int par = numero % 2;
        if (par == 0) {
            System.out.println("Numero é Par!");
        } else {
            System.out.println("Numero é Impar!");
        }

        scanner.close();
    }
}
