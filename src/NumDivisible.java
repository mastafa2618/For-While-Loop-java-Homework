import java.util.Scanner;
//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
public class NumDivisible {

    public static void main(String[] args) {

        // Scanner class objects read to input value
        Scanner sc = new Scanner(System.in);
              // variable declaration
        int num =100;
        // user need to enter the value of num which is 100

        System.out.println("Enter the value of num :");
        num = sc.nextInt();

        System.out.println("Numbers divisible by 3  :");

        for( int i = 1 ; i <=num ; i++ )
            {
            if(i % 3 == 0)
            {

                System.out.print(i + ", ");   // output numbers divisible by 3
            }

        }
        System.out.println();
        System.out.println("Numbers divisible by 5 :");
        for (int i = 1 ; i<=num ; i ++){
            if(i % 5 ==0){

                System.out.print(i  + ", ");  // output numbers divisible by 5
            }
        }




    }
}
