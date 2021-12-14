package Generics;

import java.util.ArrayList;

public class StringSelectionSortDemo {

    public static void main(String[] args) {

        ArrayList<String> b = new ArrayList<String>();
        b.add("time");
        b.add("tide");
        b.add("clouds");
        b.add("rain");

        System.out.println("ArrayList values before sorting:");
        for (String e : b)
            System.out.println(e + " ");
        System.out.println();

        StringSelectionSort.sort(b);
        System.out.println("ArrayList values after sorting:");
        for (String e : b)
            System.out.println(e + " ");
        System.out.println();
    }
}
