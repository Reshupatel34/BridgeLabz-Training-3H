package competitive_programming.level_1;

import java.util.Scanner;

public class FeeDiscounter {
      public static void courseFeeDiscountUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter Discount Percent: ");
        double discountPercent = input.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        input.close();
    }    public static void main(String[] args) {
        courseFeeDiscountUser();
    }
    
}
