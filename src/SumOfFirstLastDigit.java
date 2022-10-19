import java.util.Scanner;
//WAP to input any five digit number and then find sum of first and last digit
public class SumOfFirstLastDigit {


    public static void main(String[] args) {
        // Scanner class objects to read input values

        Scanner sc = new Scanner(System.in);
        // User need to enter any five digits then find sum of first and last digit
        System.out.println("enter five digits number :");
        int firstDigit = 0;
        int lastDigit = 0;
        int number;           // variable declaration
        number = sc.nextInt();

        lastDigit = number%10;         // algorithm
        System.out.println("Last digit: "+lastDigit);
                                  // while loop condition
        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }                                           // output
        System.out.println("First digit: "+firstDigit);
        System.out.println("Sum of First and Last digit :" + firstDigit
        + lastDigit );


    }
        }
