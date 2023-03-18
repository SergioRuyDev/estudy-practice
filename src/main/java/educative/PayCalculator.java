package educative;

import java.util.Scanner;

public class PayCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the hours worked on the week.");
        int hours = scanner.nextInt();

        System.out.println("Type the hourly pay rate.");
        double rate = scanner.nextDouble();

        double regularPay;

        if ( hours <= 40) {

            regularPay = hours * rate;
            System.out.println("Regular Pay: " + regularPay);

        } else {
            regularPay = 40 * rate;
            double overTime = hours - 40;
            double increasePay = (rate + (rate / 2));
            double overPay = increasePay * overTime;
            System.out.println("Regular pay: " + regularPay);
            System.out.println("Overtime pay: " + overPay);
            System.out.println("Total pay: " + (regularPay + overPay));

        }

        scanner.close();
    }
}
