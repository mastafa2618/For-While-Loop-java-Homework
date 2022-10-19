import java.util.Scanner;
//11. WAP to input any five digit number and then count total number of odd and even digit and find out sum of them
public class CountEvenOdd {
    // Scanner class objects to read input values

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user need to enter any five digits number
        System.out.println(" Enter any five digits number : ");
        int num;                      // Variable declaration
        num = sc.nextInt();
        int even_count = 0;
        int odd_count = 0;



        // Looping condition
        for(int i = 0 ; i <= num; i++)
        {
            int rem = num%10;
            if (rem%2 ==0){
                even_count++;   // increase even_count
            }
            else
            {
                odd_count++;   // increase odd_count
            }
            num = num/10;
        }

        // output

        System.out.println(even_count);
        System.out.println( odd_count);

    }
}



