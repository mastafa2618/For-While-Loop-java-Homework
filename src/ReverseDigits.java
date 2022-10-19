import java.util.Scanner;
// WAP to input the 5 digit number and then reverse it
public class ReverseDigits {

    public static void main(String[] args) {
        // scanner class objects to read input values

        Scanner sc = new Scanner(System.in);
        // user need to enter five digits number. example- 12345
        System.out.println("Enter the Five Digits Numbers :");
        int num = sc.nextInt();
        // variable declaration
        int sum = 0;
        // Using algorithm
        int rev =0;
        for(  ; num> 0 ; num = num /10 )  // for loop condition
        {
            rev = num % 10;
            sum = sum * 10 +rev;
            // output
        }
        System.out.println(sum);

    }
}
