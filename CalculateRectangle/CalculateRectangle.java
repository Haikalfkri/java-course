package CalculateRectangle;

import java.util.Scanner;

public class CalculateRectangle {

    public static void main(String[] args) {

        double widht = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        widht = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = widht * height;

        System.out.println("The area of the rectangle is: " + area + " cm");

        scanner.close();

    }

}
