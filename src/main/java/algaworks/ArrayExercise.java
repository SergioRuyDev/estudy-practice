package algaworks;

import java.util.Scanner;

public class ArrayExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] tasks = new String[5];
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("Digite sua tarefa: " + i + ": ");
            tasks[i] = scanner.nextLine();
        }


        for (int i = 0; i < tasks.length; i++) {
            System.out.println("Your tasks are: " + tasks[i]);
        }

        scanner.close();

    }
}
