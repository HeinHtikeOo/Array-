package org.unit5;

import java.util.Scanner;

public class J04ArrayMatch {
    public static void main(String[] args) {
        int[] validValues = {101, 108, 201, 213, 266, 304, 311, 409,
                411, 412};
        double[] prices = {0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99,
                0.89, 1.26, 8.00};

        int itemOrdered, i;
        Scanner input = new Scanner(System.in);
        boolean found = false;
        System.out.print("Enter Item Ordered: ");
        itemOrdered = input.nextInt();

        for (i=0; i <= 9; i++){
            if (itemOrdered == validValues[i])
            {
                System.out.println(prices[i]);
                found = true;
            }
        }
        if (found == false)
            System.out.println("Invalid Item Ordered!");
    }
}
