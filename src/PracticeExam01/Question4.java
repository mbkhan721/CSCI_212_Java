package PracticeExam01;

public class Question4 {

    static String s1,s2,s3,s4;

    public static void main (String[] args){
        s1 = new String("CAT");
        s2 = new String("DOG");
        s3 = new String("RAT");

        animal(s1,s2);
        System.out.println(mixThem(s2,s3));
    } //main

    private static void animal (String a1, String a2) { // CAT DOG
        if(a1.equals(a2))
            System.out.println(a1);                     // Prints DOG
        else
            System.out.println(a2);
    }

    private static String mixThem (String b1, String b2){ // DOG RAT
        String c1 = b1;                                     // c1 = DOG, temp
        b1 = b2;                                            // b1 = RAT
        b2 = new String ("HAT");                    // b2 = HAT
        System.out.println(b1);                             // RAT
        System.out.println(b2);                             // HAT
        System.out.println(c1);                             // DOG
        System.out.println(s2);                             // DOG
        return b2;                                          // HAT
    }
}
