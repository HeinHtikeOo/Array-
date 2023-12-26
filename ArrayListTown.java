package org.unit5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTown {
    public static void main(String[] args) {
        ArrayList town = new ArrayList();
        town.add("Natogyi");
        town.add("Mandalay");
        town.add("Amarapura");
        town.add("PyinOoLwin");
        town.add("Yangon");

        Iterator it=town.iterator();

        while (it.hasNext()){
            System.out.println(it.next()+ " ");
        }
        town.remove(1);
        System.out.println("\nWhole List: " + town);
        System.out.println("Position 1: " + town.get(1));
    }
}
