package competitive_programming.level_1;

import java.util.Scanner;

public class Handshake {
      public static void maxHandshakes() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);
        input.close();
    }    public static void main(String[] args) {
        maxHandshakes();
    }
    
}
