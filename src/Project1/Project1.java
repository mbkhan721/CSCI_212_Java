package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project1
{
    //create two arraylist objects of type Date212
    static ArrayList<Date212> unsorted = new ArrayList<Date212>();
    static ArrayList<Date212> sorted = new ArrayList<Date212>();

    public static void main(String[] args)
    {
        String filename = "dates.txt";
        readDates(filename);
        DateGUI gui = new DateGUI();
        gui.unsortedDates.append("Unsorted Dates\n");
        gui.unsortedDates.append(getListAsString(unsorted));
        selectionSort(sorted);
        gui.sortedDates.append("Sorted Dates(Ascending Order)\n");
        gui.sortedDates.append(getListAsString(sorted));
    }

    /**
     * Method that takes ArrayList as input
     * and returns string representation of arraylist
     * */
    public static String getListAsString(ArrayList<Date212> dates){
        String datelist="";
        for (Date212 date : dates) {
            datelist+=date.toString()+"\n";
        }
        return datelist;
    }

    /**
     * Selection Sort on arraylist
     * */
    public static void selectionSort(ArrayList<Date212> dates) {

        for (int lastPlace = dates.size()-1; lastPlace > 0; lastPlace--) {
            int maxLoc = 0;
            for (int j = 1; j <= lastPlace; j++) {
                //for ascending sort
                if (dates.get(j).compareTo(dates.get(maxLoc))==1) {
                    maxLoc = j;
                }
            }
            Date212 temp = dates.get(maxLoc);
            dates.set(maxLoc,dates.get(lastPlace));
            dates.set(lastPlace,temp);

        }
    }
    /**
     * Method that take file name
     * and read dates from the file
     * and add to the sorted and unsorted arraylist
     * */
    public static void readDates(String fileName) {

        Scanner filescanner=null;
        try {

            filescanner=new Scanner(new File(fileName));
            String line;
            /* read until no line is left */
            while (filescanner.hasNextLine())
            {
                line = filescanner.nextLine();
                /* tokenize the line and get date */
                StringTokenizer tokens = new StringTokenizer(line, ",");
                while (tokens.hasMoreTokens())
                {
                    String inStr = tokens.nextToken();
                    if (isvalid(inStr))
                    {
                        Date212 date = new Date212(inStr);
                        unsorted.add(date);
                        sorted.add(date);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Method that retuns boolean true if date is valid
     * */
    public static boolean isvalid(String date) {
        if (date.length() == 8) {
            for (int i = 0; i < 8; i++) {
                if (!Character.isDigit(date.charAt(i))) {
                    return false;
                }
            }
            int month = Integer.parseInt(date.substring(4, 6));
            if (month <= 0 || month > 12) {
                return false;
            }
            int day = Integer.parseInt(date.substring(6, 8));
            if (day <= 0 || day > 31) {
                return false;
            }
            return true;
        }
        return false;
    }
}
