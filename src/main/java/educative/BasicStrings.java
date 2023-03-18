package educative;

import java.util.Scanner;

public class BasicStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input below.");
        System.out.println("User’s name");
        String name = scanner.nextLine();

        System.out.println("User’s age");
        String age = scanner.nextLine();

        System.out.println("User’s city");
        String city = scanner.nextLine();

        System.out.println("User’s college");
        String college = scanner.nextLine();

        System.out.println("User’s profession");
        String profession = scanner.nextLine();

        System.out.println("User’s pet’s name");
        String petName = scanner.nextLine();

        System.out.println("There once was a person named " + name + " who lived in " + city +
                ". At the age of " + age + ", " + name + " went to college at " + college + ". " + name + " graduated " +
                "and went to work as a " + profession + ". Then, " + name + " adopted an animal named " + petName + ". " +
                "They both lived happily ever after!\n");

    }
}
