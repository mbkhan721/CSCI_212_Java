package PracticeExam02;

public class Q1 {

    public static void A() {
        try {
            int myInt;
            myInt = Integer.parseInt("NumberFormatException");
        }
        catch(NumberFormatException a) {
            System.out.println("Num format exp");
            D();
        }
    }

    public static void B() {
        int x = 25;
        try {
            if(x < 50)
                throw new IllegalArgumentException("IllegalArgumentException");
        }
        catch(IllegalArgumentException b) {
            System.out.println("Illegal arg exp");
            D();
        }
    }

    public static void C() {
        int[] myArray = {5, 10, 15, 20};
        try {
            System.out.print(myArray[5]);
        }
        catch(IndexOutOfBoundsException c){
            System.out.println("Out of bounds exp");
            D();
        }
    }

    public static void D() {}

    public static void main(String[] args) {
        A();
        B();
        C();
    }
}