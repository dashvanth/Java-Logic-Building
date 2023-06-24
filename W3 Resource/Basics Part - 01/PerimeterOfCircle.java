import java.util.*;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        // here Math.PI=3.14
        // The math.pi is taken over the 3.14 value becasue it gives all the output
        // without rounding up the values
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
        sc.close();
    }
}
