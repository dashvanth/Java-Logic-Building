import java.util.Scanner;

public class Binaryadd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();
        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        int maxLength = Math.max(binary1.length(), binary2.length());

        // Make the lengths of the two binary numbers equal by padding zeros to the left
        binary1 = padZeros(binary1, maxLength);
        binary2 = padZeros(binary2, maxLength);

        String sum = addBinary(binary1, binary2);
        System.out.println("Sum of two binary numbers: " + sum);
    }

    // Pad zeros to the left of a binary number until it reaches the specified
    // length
    public static String padZeros(String binary, int length) {
        while (binary.length() < length) {
            binary = '0' + binary;
        }
        return binary;
    }

    // Add two binary numbers
    public static String addBinary(String binary1, String binary2) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;

        // Iterate from right to left (LSB to MSB) of the binary numbers
        for (int i = binary1.length() - 1; i >= 0; i--) {
            int bit1 = binary1.charAt(i) - '0';
            int bit2 = binary2.charAt(i) - '0';

            // Calculate the sum of current bits and the carry
            int bitSum = bit1 + bit2 + carry;

            // Determine the current bit and the carry for the next iteration
            sum.insert(0, bitSum % 2);
            carry = bitSum / 2;
        }

        // If there is still a carry after iterating through all the bits, add it to the
        // sum
        if (carry != 0) {
            sum.insert(0, carry);
        }

        return sum.toString();
    }
}
