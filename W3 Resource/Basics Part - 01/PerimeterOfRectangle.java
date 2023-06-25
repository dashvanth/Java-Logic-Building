import java.util.*;

public class PerimeterOfRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width:");
        float width = sc.nextFloat();
        System.out.println("Enter the height:");
        float height = sc.nextFloat();
        float area = width * height;
        float perimeter = 2 * (width + height);
        System.out.println("Area of a rectangle is=" + area);
        System.out.println("Perimeter of a reactangle is=" + perimeter);
        sc.close();
    }
}
