import java.util.Scanner;
     // WAP to check if given number is Prime number or not?

 // Prime number - a number that is divisible 1 and itself, example - 2, 3, 7, 11, 13, 17


public class PrimeNumber {

    public static void main(String[] args)
    // Scanner class object to read input value
    {
        Scanner s = new Scanner(System.in);

        int n; int count = 0;  // variable declaration

        // user need to enter any number
        System.out.print("Enter any number : ");
         n = s.nextInt();




        for(int i = 1 ; i <=n ; i++ )  // Condition
        {
            if(n % i ==0){
                count++;
            }
        }
        if (count ==2)
        {
            System.out.println(" is a Prime Number" + " ");   // output
        }
        else {
            System.out.println(" is not a Prime Number");
        }




    }
}
