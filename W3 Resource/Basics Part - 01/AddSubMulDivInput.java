import java.util.Scanner;

public class AddSubMulDivInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int firstInput = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int secondInput = sc.nextInt();
        System.out.println(firstInput + " + " + secondInput + " = " + (firstInput + secondInput));
        System.out.println(firstInput + " - " + secondInput + " = " + (firstInput - secondInput));
        System.out.println(firstInput + " * " + secondInput + " = " + (firstInput * secondInput));
        System.out.println(firstInput + " / " + secondInput + " = " + (firstInput / secondInput));
        System.out.println(firstInput + " % " + secondInput + " = " + (firstInput % secondInput));
        sc.close();
    }
}
