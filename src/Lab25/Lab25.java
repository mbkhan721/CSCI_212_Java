package Lab25;

public class Lab25 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] intArray = { 3, 5, 9, 4, 10, 33, 12, 19, 4, 16, 23, 30 };
        int[] intArray1 = { 1, 2, 4, 5, 5, 6, 7, 8, 9, 100 };


        int large = largest(intArray, 0);
        System.out.println("Largest number in intArray is " + large);

        int sum = sum(intArray, 0);
        System.out.println("The sum of intArray is " + sum);

        boolean sort = isSorted(intArray, 0);
        System.out.println("Is intArray sorted? " + sort);

        sort = isSorted(intArray1, 0);
        System.out.println("Is intArray1 sorted? " + sort);

        // largest number in array without recursive function.
//        int max = intArray[0];
//        for (int i = 0; i < intArray.length; i++) {
//            if (intArray[i] > max)
//                max = intArray[i];
//        }
    }

    public static int largest(int[] myArray, int index) {
        // base case
//
//        if (index >= myArray.length)
//            return Integer.MIN_VALUE;

        if (index >= myArray.length - 1)
            return myArray[myArray.length - 1];

        return Math.max(myArray[index], largest(myArray, index + 1));
//        if (index > 0) {
//            return Math.max(myArray[index],largest(myArray, index - 1));
//        }
//        else
//            return myArray[0];
    }

    public static int sum(int[] myArray, int index) {
//        if (index <= 0) {
//            return 0;
//        }
//        return sum(myArray, index - 1) + myArray[index - 1];

        if (index >= myArray.length)
            return 0;

        return myArray[index] + sum(myArray, index + 1);

    }

    public static boolean isSorted(int[] myArray, int index) {
//        if (index == 1 || index == 0) {
//            return true;
//        }
//        return myArray[index - 1] >= myArray[index - 2] && isSorted(myArray, index - 1);

        if (index + 1 >= myArray.length)
            return true;

        return myArray[index] <= myArray[index + 1] && isSorted(myArray, index + 1);
    }

}
