import java.util.*;

public class Productof2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstInput = sc.nextInt();
        System.out.println("Input second number:");
        int secondInput = sc.nextInt();
        System.out.println("Product of two numbers is:" + firstInput * secondInput);
        sc.close();
    }
}
