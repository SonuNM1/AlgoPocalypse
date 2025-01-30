package Numbers;

import java.util.Scanner;

/*
Check if a Number is Divisible by the Sum of its Digits
*/

public class NumDivSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;

        // Calculate sum of digits
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        // Check divisibility
        if (originalNum % sum == 0) {
            System.out.println("\n✅ " + originalNum + " is divisible by the sum of its digits (" + sum + ").");
        } else {
            System.out.println("\n❌ " + originalNum + " is NOT divisible by the sum of its digits (" + sum + ").");
        }

        sc.close(); // Close scanner to avoid memory leak
    }
}
