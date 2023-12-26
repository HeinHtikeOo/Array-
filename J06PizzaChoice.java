package org.unit5;

import java.io.IOException;

public class J06PizzaChoice {
    public static void main(String[] args) throws IOException {
        char[] size = {'S','M','L','X'};
        double[] prize = {6.99, 8.99, 12.50, 15.00};
        char input;
        int i;
        System.out.print("Enter Pizza Size: ");
        input = (char) System.in.read();
        for (i=0; i <= 3; i++)
            if (input == size[i])
                System.out.println("The pirze for your Pizza is: " + prize[i]);
    }
}
