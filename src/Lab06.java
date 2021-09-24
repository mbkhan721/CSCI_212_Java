import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Lab06 {
    public static void main(String[] args) {
        String filename = args[0];
        int length = 10;
        int[] array = new int[length];
        inputFromFile(array,filename);

        //printing array
        for(int i=0; i < length && array[i] != 0; i++)
            System.out.print(array[i] + " ");


        int sum = sum (array, array.length);
        JOptionPane.showMessageDialog(null,
                "The sum of all int  " + sum);

        float average = average(array, array.length);
        JOptionPane.showMessageDialog(null,
                "The average is  " + average);
    }

    public static void inputFromFile(int[] array, String filename) {
        Scanner input;
        try{
            FileReader fr = new FileReader(filename);
            input = new Scanner(fr);
        }
        catch(FileNotFoundException e){
            System.err.println("File not Found!!");
            return;
        }
        int index = 0;
        while(input.hasNext()) {
           array[index] = Integer.parseInt(input.next());
           index++;
        }
    }

    public static int sum (int[] myArray, int myArraySize) {
        myArraySize = myArray.length;
        int sum = 0;
        for (int i = 0; i < myArraySize; i++) {
            sum += myArray[i];
        }
        return sum;
    }

    public static float average (int[] myArray, int myArraySize){
        myArraySize = myArray.length;
        float average = 0.0f;
        for (int i = 0; i < myArraySize; i++) {
            average += myArray[i];
        }
        return average / myArraySize;
    }
}
