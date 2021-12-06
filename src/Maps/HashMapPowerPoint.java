package Maps;

import java.util.*;

public class HashMapPowerPoint {

    public static void main(String[] args) {

        HashMap<String, String> french = new HashMap<>();
        french.put("Cat", "Chat");
        french.put("Water", "Eau");
        french.put("Moon", "Lune");

        // Powerpoint example
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        int myInt = (int) hashMap.get("Two");

        if (hashMap.containsValue(4))
            System.out.println("HashMap contains 1 as value");
        else {
            System.out.println("HashMap does not contain 1 as value");

            if (hashMap.containsKey("Four"))
                System.out.println("HashMap contains One as key");
            else
                System.out.println("HashMap does not contain One as value");
        }

        Iterator itr;
        System.out.println("\nRetrieving all keys from the HashMap");
        itr = hashMap.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nRetrieving all values from the HashMap");
        itr = hashMap.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nRetrieving all values from the French");
        itr = french.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        TreeMap<String, String> pashto = new TreeMap<String, String>();
        pashto.put("dog", "pisho");
        pashto.put("fire", "aor");
        pashto.put("sun", "noir");

        /*
          A TreeMap arranges the data keys so they come out in order when using the iterator.
          All the words come out in order of the keys
         */

        System.out.println("\nPrinting Pashto data in order:");
        String pashtoWord = french.get("fire");
        // pashto will get "aor"
        Set set = pashto.entrySet(); // entrySet() returns a collection of key/value pairs
        Iterator i = set.iterator();
        Map.Entry<String, String> me; // interface Map.Entry is a key/value pair.

        while (i.hasNext()) {
            me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    } // main
}
