package competitive_programming.level_2;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);
        scanner.close();
    }
}
