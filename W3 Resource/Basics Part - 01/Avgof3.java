import java.util.*;

public class Avgof3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first input:");
        int input1 = sc.nextInt();
        System.out.println("Enter the second input:");
        int input2 = sc.nextInt();
        System.out.println("Enter the third input:");
        int input3 = sc.nextInt();

        int avg = (input1 + input2 + input3);
        System.out.println("Average of 3 numbers is: " + avg / 3);
        sc.close();
    }
}
