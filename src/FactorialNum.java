import java.util.Scanner;
//WAP to find a factorial for given number For eg. entered number is 5
public class FactorialNum {

    public static void main(String[] args) {
        // user need input any number to fid its factorial numbers
        // example: factorial number for 4----4*3*2*1 = 24

        int n, fact = 1; // variable declaration
        // scanner class objects need to reed input values
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for( int i = 1 ; i<=n; i++)  // condition
        {
            fact = fact*i;
        }
        System.out.println("Factorial numbers :" + fact);   // output


    }
}
