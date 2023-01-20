package bot;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static final int yearOfCreation = Calendar.getInstance().get(Calendar.YEAR);
    public static Scanner scanner = new Scanner(System.in);
    public static final String botName = "Siri";

    public static void main(String[] args) {
        greet(botName, yearOfCreation);
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    public static void greet(String assistantName, int birthYear) {
        System.out.printf("Hello! My name is %s.\n", assistantName);
        System.out.printf("I was created in %d.\n", birthYear);
        System.out.println("Please, remind me your name.");
    }

    public static void remindName() {
        System.out.print("> ");
        String userName = scanner.nextLine();

        System.out.printf("What a great name you have, %s!\n", userName);
    }

    public static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int[] remaindersOfAge = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("> ");
            remaindersOfAge[i] = scanner.nextInt();
        }

        int age = (remaindersOfAge[0] * 70 + remaindersOfAge[1] * 21 + remaindersOfAge[2] * 15) % 105;

        System.out.printf("Your age is %s; that's a good time to start programming!\n", age);
    }

    public static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");

        System.out.print("> ");
        int counting = scanner.nextInt();

        for (int i = 0; i <= counting; i++) {
            System.out.printf("%d! ", i);
        }

        System.out.println();
    }

    public static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");

        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        while (true) {
            System.out.print("> ");
            int userResponse = scanner.nextInt();

            if (userResponse == 2) {
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }

    public static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}