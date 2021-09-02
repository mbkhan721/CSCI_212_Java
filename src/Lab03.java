public class Lab03 {
    public static void main(String [] args) {
        // static means that this function belongs to Lab03 class. [] array of String class

        float f, c;

        // step 3
        f = (float) 98.6;

        // step 4
        c = (f - 32) * 5/9;
        // OR
        // c = (float) (5.0/9.0 * (f - 32));

        System.out.println("\nf = " + f + "\nc = " + c + "\n");
        // System is class, out is the object, println is a function
        // ln = endl

        // step 5: for loop
        for (float i = 0; i <= 40.0; i+=5) {
            // f = i;
            // c = (f - 32) * 5/9;
            // System.out.println("f = " + f + "c = " + c);
            System.out.println("f = " + i + "\tc = " + (i - 32) * 5/9);
        }
        System.out.println("\n");

        // step 6
        float index = 0;
        while (index <= 40.0) {
            System.out.println("f = " + index + "\tc = " + (index - 32) * 5/9);
            index += 5;
        }
    }
}
