
public class PassParameters {

    public static void main (String[] args) {
        int a = 2, b = 4;
        doSomething(a, b);

        // String
        String s1 = "cat", s2 = "dog";
        passByString(s1, s2);
        System.out.println("s1 = " + s1 + ", s2 = " + s2);
    }

    public static void doSomething(int x, int y) {
        //x = 10;
        //y = 20;
        System.out.println("x = " + x + ", y = " + y);
    }
    // Each variable in the main program and the method has its own memory location for the reference

    // String
    public static void passByString(String x, String y) {
        x = "fish";
        y = "bird";
        System.out.println("String x = " + x + ", String y = " + y);
    }
}

