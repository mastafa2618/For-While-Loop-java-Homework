import java.util.Scanner;
//WAP to display sum of n Natural number
public class NaturalNum {


    public static void main(String[] args)
    {
// scanner class objects need to reed input values
        int n, sum = 0; // declaration variables
        Scanner sc = new Scanner(System.in);
        // user need to enter the number
        System.out.println(" enter the number : ");
        n = sc.nextInt();
        // condition
        for(int i = 1 ; i <=n ; i ++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of input natural number :"  + sum);  // output
    }
}
