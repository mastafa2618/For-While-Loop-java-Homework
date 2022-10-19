import java.util.Scanner;
//WAP to input any five digit number and then find sum of each digit
public class SumOfDigits {

    public static void main(String[] args) {
                               // Scanner class objects to read input values

        Scanner sc = new Scanner(System.in);
                                        // user need to input any five digit number, example; 45612
        System.out.println("Enter any five digit number : ");
        Long num = sc.nextLong();
        long sum;

                                 //executes until the condition number!=0 becomes false
        for(sum=0; num!=0; num=num/10)
        {
                              //finds the last digit and add it to the variable sum
            sum = sum + num % 10;
        }
                                                  //prints the output
        System.out.println("Sum of digits: "+sum);


    }
}
