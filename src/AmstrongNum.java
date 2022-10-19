import java.util.Scanner;
//WAP to input any number and find out if its Armstrong number or not?
public class AmstrongNum {
    public static void main(String[] args) {

        int num, temp, totalDigit=0, res=0, rem;  // variable declaration and algorithm

        Scanner scan = new Scanner(System.in);  // Scanner class objects to read user input


        System.out.print("Enter the Number: ");   // user need to enter any number to check Armstrong or not
        num = scan.nextInt();

        for(temp=num; num>0; num /= 10)  // for loop condition
            totalDigit++;

        for(num=temp; num>0; num /= 10)
        {
            rem = num%10;
            res = res + (int) Math.pow(rem, totalDigit);
        }

        if(res==temp)
            System.out.println("\nArmstrong Number");     // output
        else
            System.out.println("\nNot an Armstrong Number.");

            }

    }

