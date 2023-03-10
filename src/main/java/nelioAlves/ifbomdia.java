package nelioAlves;

import java.util.Scanner;

public class ifbomdia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que horas são?");
        int hora = scanner.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

//        if (x > 0) {
//            System.out.println("Boa tarde");
//        }

//        if (x > 6)
//        System.out.println("Boa noite");
    }
}
