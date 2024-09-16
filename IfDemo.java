package programs;
import java.util.Scanner;


public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        
        System.out.println("Choose an option:");
        System.out.println("1. Check if a string is a palindrome");
        System.out.println("2. Sum the digits of an integer");
        System.out.println("3. Convert a string to uppercase and reverse it");
        System.out.println("4. Exit");
        System.out.print("Input? ");

        // Read user choice
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        //FINISH THE CODE IN MAIN
    }

    // Method to manually reverse a string
    // You can call it like this:  String str = reverseString("hi") to get ih in str
    private static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
