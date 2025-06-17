package Variables;

public class Variables {

    public static void main(String[] args) {
        // variable = a reusable container for  a value
        //            a variable behaves as if it was the value it contains

        // primitive = simple value stored directly in the memory
        // reference = memory address (stack) that points to the (heap)

        // primitve = int, double, char, boolean
        // reference = String, Array, Class, Interface, Enum, Object

        // 2 step to creating a variable
        // 1. declaration
        // 2 . assignment

        int age = 30;
        int year = 2025;
        int quantity = 2;

        double price = 19.99;
        double pi = 3.14;
        double gpa = 3.85;

        char grade = 'A';
        char initial = 'J';
        char symbol = '$';

        boolean isAcive = false;
        boolean isAvailable = true;
        boolean isStudent = true;

        String name = "John Doe";
        String city = "New York";
        String email = "example@example.com";

        System.out.println("Hello " + name);
    }

}
