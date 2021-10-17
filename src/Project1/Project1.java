package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project1 {
    static ArrayList<Date212> unsorted = new ArrayList<Date212>();
    static ArrayList<Date212> sorted = new ArrayList<Date212>();

    public static void main(String[] args) {
        String filename = "dates.txt";
        readDates(filename);
        DateGUI gui = new DateGUI();
        gui.unsortedDates.append("Unsorted Dates\n");
        gui.unsortedDates.append(getListAsString(unsorted));
        selectionSort(sorted);
        gui.sortedDates.append("Sorted Dates - Low to High\n");
        gui.sortedDates.append(getListAsString(sorted));
    }

    public static String getListAsString(ArrayList<Date212> dates) {
        String dateList = "";
        for (Date212 date : dates) {
            dateList += date.toString()+"\n";
        }
        return dateList;
    }

    public static void selectionSort(ArrayList<Date212> dates) {
        for (int lastPlace = dates.size()-1; lastPlace > 0; lastPlace--) {
            int myNum = 0;
            for (int j = 1; j <= lastPlace; j++) {
                if (dates.get(j).compareTo(dates.get(myNum))==1) {
                    myNum = j;
                }
            }
            Date212 temp = dates.get(myNum);
            dates.set(myNum,dates.get(lastPlace));
            dates.set(lastPlace,temp);
        }
    }
    public static void readDates(String fileName) {
        Scanner filescanner = null;
        try {
            filescanner=new Scanner(new File(fileName));
            String line;
            while (filescanner.hasNextLine()) {
                line = filescanner.nextLine();
                StringTokenizer tokens = new StringTokenizer(line, ",");
                while (tokens.hasMoreTokens()) {
                    String inStr = tokens.nextToken();
                    Date212 date = new Date212(inStr);
                    unsorted.add(date);
                    sorted.add(date);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
