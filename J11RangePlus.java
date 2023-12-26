package org.unit5;

import java.util.Scanner;

public class J11RangePlus {
    public static void main(String[] args) {
        double[] discount = {0.0, 0.1, 0.14, 0.18, 0.2};
        int[] rangeLimit = { 1, 13, 50, 100, 200};
        double custDiscount = 0.00;
        int noOfItem, sub;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Item: ");
        noOfItem = input.nextInt();

        for (sub = 0; sub <= 4; sub++)
        {
            if (noOfItem >= rangeLimit[sub])
                custDiscount = discount[sub];
        }
        System.out.print("Discount Percentage: " + custDiscount);
    }
}
