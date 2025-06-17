package userInput;

import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What's your gpa? ");
        double gpa = scanner.nextDouble();

        System.out.print("Do you like programming? (true/false): ");
        boolean likesProgramming = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your GPA is " + gpa);
        System.out.println("Do you like programming? " + likesProgramming);

    }

}
