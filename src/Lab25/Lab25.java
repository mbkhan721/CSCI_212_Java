package Lab25;

public class Lab25 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] intArray = { 3, 5, 9, 4, 10, 33, 12, 19, 4, 16, 23, 30 };
        int[] intArray1 = { 1, 2, 4, 5, 5, 6, 7, 8, 9, 100 };

        System.out.println(largest(intArray, intArray.length - 1));
        System.out.println(sum(intArray, intArray.length - 1));
        System.out.println(isSorted(intArray, intArray.length - 1));
        System.out.println(isSorted(intArray1, intArray1.length - 1));
    }

    public static int largest(int[] myArray, int index) {
        if (index > 0) {
            return Math.max(myArray[index],largest(myArray, index - 1));
        }
        else
            return myArray[0];
    }

    public static int sum(int[] myArray, int index) {
        if (index <= 0) {
            return 0;
        }
        return sum(myArray, index - 1) + myArray[index - 1];
    }

    public static boolean isSorted(int[] myArray, int index) {
        if (index == 1 || index == 0) {
            return true;
        }
        return myArray[index - 1] >= myArray[index - 2] && isSorted(myArray, index - 1);
    }

}
