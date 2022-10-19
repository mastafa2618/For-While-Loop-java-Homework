import java.util.Scanner;
//WAP to print multiplication table for given number (for loop)
public class MultiplicationNum {

    public static void main(String[] args) {

         // Scanner objects class to read objects values

        Scanner sc = new Scanner(System.in);
        // user need to enter any number to get multiplication table
        System.out.print("Enter number:");
        int num=sc.nextInt();

        for(int i=1; i <= 5; i++)   // for loop condition
        {
            System.out.println("Multiplication table : " +  num +" * "+i+" = "+num*i);   // output
        }


    }

}
