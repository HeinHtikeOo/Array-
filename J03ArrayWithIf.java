package org.unit5;

public class J03ArrayWithIf {
    public static void main(String[] args) {
        int []mark=new int[5];
        int i,j;
        boolean found=false;
        for (i=0;i<=4;i++){
            mark[i]=100*(i+1);
            for (j=0;j<=4;j++){
                if (mark[j] == 200){
                    System.out.println(mark[j]);
                    found=true;
                }
                if (found == false){
                    System.out.println("Not Found.");
                }
            }
        }
    }
}
