package org.unit5;

import java.io.IOException;
import java.util.Scanner;

public class J07PizzaChoice2 {
    public static void main(String[] args) throws IOException {
        char[] size = {'S', 'M', 'L', 'X'};
        double[] prize = {6.99, 8.99, 12.50, 15.00};
        char input;
        int i, total;

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter Pizza Size: ");
        input = (char) System.in.read();

        System.out.print("How many Pizza?: ");
        total = input2.nextInt();

        for (i = 0; i <= 3; i++)
            if (input == size[i])
                System.out.println("The pirze for your Pizza is: " + (prize[i] * total));
    }
}
