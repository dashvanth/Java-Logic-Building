import java.util.*;

public class MulTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number:");
        int tableInput = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(+tableInput + " X " + i + " = " + (tableInput * i));
        }
        sc.close();
    }
}
