package org.unit5;

public class J01Array {
    public static void main(String[] args) {
        int[] mark = new int[5];
        mark[0] = 100;
        mark[1] = 200;
        mark[2] = 300;
        mark[3] = 400;
        mark[4] = 500;
//mark[5] = 600;
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
        System.out.println(mark[4]);
        System.out.println("********");
//System.out.println(mark[5]);
        mark[0] = mark[0] + 10;
        mark[1] = mark[1] + 10;
        mark[2] = mark[2] + 10;
        mark[3] = mark[3] + 10;
        mark[4] = mark[4] + 10;
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
        System.out.println(mark[4]);
    }
}
