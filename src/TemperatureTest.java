public class TemperatureTest {

    // temperature
    public static void main(String[] args) {
        float t1 = 32.0f;
        System.out.println("t1 is " + t1);
        doSomething(t1);
        System.out.println("t1 is " + t1);

        // Array
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        passArray(numbers, 2);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
    public static void doSomething(float x) {
        x = 98.6f;
    }

    // Array
    public static void passArray(int[] n, int i) {
        for (int j = 0; j < n.length; j++) {
            n[i] += i;
        }
    }

}
// Left at slide 21