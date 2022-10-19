import java.util.Scanner;
//Print the sequence for fibonacci series for given limitation n - for eg 1 1 2 3 5 8 13 21
public class Fibonacci {


    public static void main(String[] args) {

        // Scanner class object to read input values

        Scanner scan = new Scanner(System.in);
        // declare variables
        int n, a = 0, b = 1, c = 0;
        // read limit from user
        System.out.print("Enter the limit : ");
        n = scan.nextInt();
        // print fibonacci series
        System.out.print("Fibonacci Series Upto " + n + ": ");     //  for loop condition to get Fibonacci series
         for (int i = 0 ; i<= n; i++) {
            System.out.print(c + ",");
             c = a + b;
             a = b;
             b = c;

    }
}
}
