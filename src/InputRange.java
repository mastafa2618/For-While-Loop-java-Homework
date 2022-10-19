import java.util.Scanner;
//Print any 10 numbers between given/user input range. FOr eg.. between 23-33
public class InputRange {


    public static void main(String[] args)
    {
        // Scanner class object to read input value
        Scanner scanner = new Scanner(System.in);
        // declare variables
        int n1=13;
        int n2 = 22;
        // read range from user
        System.out.print(" enter the value of n1 :");
         n1 = scanner.nextByte();
        System.out.print(" enter the value of n2 :" );
         n2 = scanner.nextByte();

         // print 10 number between 13 and 22

        for( int i = n1 ; i<=n2; i++)
        {
            System.out.println(i);
        }




    }
}








        




