import java.util.Scanner;
//WAP to enter any String and count total numbers of 'a' in that String
public class StringCount {


    public static void main(String[] args) {
        // Scanner class objects to read input values
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string :"); // user need to enter the string, for example: "Thank you Test Fusion"
        String a = sc.nextLine();

        int count = 0; // declaration variable

        //Counts each character except space
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ')
                count++;
        }
        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);

    }


    }

