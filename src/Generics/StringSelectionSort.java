package Generics;

import java.util.ArrayList;

public class StringSelectionSort {

    /**
     * Sorts the arrayList so that a.get(0), a.get(1), ..., a.get(a.size() - 1)
     * are in lexicographic order.
     */
    public static void sort(ArrayList<String> a) {
        int index, indexOfNextSmallest;

        for (index = 0; index < a.size(); index++) {
            // place the correct value in position index.
            indexOfNextSmallest = indexOfSmallest(index, a);
            interchange (index, indexOfNextSmallest, a);
        }
    }

    /**
     * Precondition: i and j are legal indices for the ArrayList a.
     * PostCondition: The values of a.get(i) and a.get(j) have been interchanged.
     * @param i
     * @param j
     * @param a
     */
    public static void interchange(int i, int j, ArrayList<String> a) {
        String temp;
        temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }

    /**
     * Returns the index of the lexicographically first value among a.get(startIndex),
     * a.get(startIndex + 1), ..., a.get(a.size() - 1)
     * @param startIndex
     * @param a
     * @return
     *
     * lexicographically means that the words are alphabetically ordered based on
     * their component alphabets
     */
    public static int indexOfSmallest(int startIndex, ArrayList<String> a) {
        String min = a.get(startIndex);
        int indexOfMin = startIndex;
        int index;

        for (index = startIndex + 1; index < a.size(); index++)
            if ((a.get(index)).compareTo(min) < 0) {
                min = a.get(index);
                indexOfMin = index;
            }
        return indexOfMin;
    }
}
