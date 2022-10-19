import java.util.Scanner;
//WAP to input any number and check if its Palindrome or not?
public class PalindromeNum {

    public static void main(String[] args) {
        String original, reverse = ""; // Variable declaration
        // Scanner class objects to read user input value
        Scanner in = new Scanner(System.in);
        // user need to enter a string/number to check if it is a palindrome

        System.out.println("Enter a string/number to check if it is a palindrome :");

        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )   // condition to check
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}
