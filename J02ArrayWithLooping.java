package org.unit5;

public class J02ArrayWithLooping {
    public static void main(String[] args) {
        int [] mark=new int[5];
        int i,j;

        for (i=0;i<=4;i++){
            mark[i]=100*(i+1);
        }
        for (j=0;j<=4;j++){
            System.out.println(mark[j]);
        }
    }
}
