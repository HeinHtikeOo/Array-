package org.unit5;

import java.io.IOException;

public class J09VowelArray {
    public static void main(String[] args) throws IOException {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        char input;
        int i;
        boolean found = false;

        System.out.println("Enter word : ");
        input = (char)System.in.read();

        for (i=0;i<5;i++){
            if (input == vowel[i]){
                System.out.println("Vowel");
                found =true;
            }
            if (found == false){
                System.out.println("Consonant.");
            }
        }
    }
}
