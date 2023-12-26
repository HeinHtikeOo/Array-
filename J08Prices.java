package org.unit5;

public class J08Prices {
    public static void main(String[] args) {
        double[] prices = {2.34, 7.89, 1.34, 2.45, 3.35, 2.25,
                4.45,5.15, 5.16, 2.16};
        double sum = 0, avg;
        int i;

        for (i = 0; i < 10; i++)
            sum += prices[i];
        System.out.println("Sum of All Prices: " + sum);
        avg = sum/prices.length;
        System.out.println("Average of the Prices: " + avg);

        System.out.println("\nLess Than 5");
        for (i = 0; i < 10; i++)
        {
            if (prices[i] < 5)
                System.out.println(prices[i]);
        }

        System.out.println("\nHigher Than Average value");
        for (i = 0; i < 10; i++)
        {
            if (prices[i] > avg)
                System.out.println(prices[i]);
        }
    }
}
