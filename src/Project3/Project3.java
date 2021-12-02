package Project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project3 {
    static ArrayList<Date212> unsorted = new ArrayList<>();
    static ArrayList<Date212> sorted = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "Project3Data.txt";
        myTokenizer(filename);
        Date212GUI myObj = new Date212GUI();
        myObj.unsortedDates.append("Dates from file:\n\n");
        myObj.unsortedDates.append(myList(unsorted));
        selectionSort(sorted);
        myObj.sortedDates.append("Sorted Dates - Old to New:\n\n");
        myObj.sortedDates.append(myList(sorted));
    }

    public static String myList(ArrayList<Date212> dates) {
        String dateList = "";
        for (Date212 date : dates) {
            dateList += date.toString()+"\n";
        }
        return dateList;
    }

    public static void selectionSort(ArrayList<Date212> dates) {
        for (int endDate = dates.size()-1; endDate > 0; endDate--) {
            int myNum = 0;
            for (int j = 1; j <= endDate; j++) {
                if (dates.get(j).compareTo(dates.get(myNum)) ==1) {
                    myNum = j;
                }
            }
            Date212 temp = dates.get(myNum);
            dates.set(myNum, dates.get(endDate));
            dates.set(endDate, temp);
        }
    }

    public static void myTokenizer(String fileName) throws FileNotFoundException {
        Scanner f;
        f = new Scanner(new File(fileName));
        String line;
        while (f.hasNextLine()) {
            line = f.nextLine();
            StringTokenizer tokens = new StringTokenizer(line, ",");
            while (tokens.hasMoreTokens()) {
                String inStr = tokens.nextToken();
                Date212 date = new Date212(inStr);
                unsorted.add(date);
                sorted.add(date);
            }
        }
    }
}


