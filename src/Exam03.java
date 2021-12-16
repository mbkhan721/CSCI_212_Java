
public class Exam03 {

    public static void main(String[] args) {

        int[] numbers = {3,6,9,12,15};

        doSomething(numbers,4);

        for (int k=0;k<numbers.length;k++)

            System.out.print(numbers[k]+" ");

    }

    public static void doSomething(int[] n, int i){

        for (int j=0; j<n.length;j++)

            n[j] += i;

    }

}