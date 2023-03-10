package nelioAlves;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Minutos da Conta: ");
        int minutos = scanner.nextInt();
        double valorTotal = 50.0;
        if (minutos >= 100) {
            valorTotal += (minutos - 100) * 2;
        }

        System.out.printf("Sua conta é: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
