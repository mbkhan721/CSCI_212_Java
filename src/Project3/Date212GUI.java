package Project3;
import javax.swing.*;
import java.awt.*;
import java.util.StringTokenizer;

public class Date212GUI {

    TextArea myTextArea, sorted;
    UnsortedDate212List dl;
    SortedDate212List dl2;
    Date212[] dateList;
    int dateSize;
    String inFileName = "Project3Data.txt";
    JFrame myFrame;
    public StringTokenizer myTokens;

    /**
     * Creates GUI
     */
    public void initialize() {

        myFrame = new JFrame();
        Container myContentPane = myFrame.getContentPane();
        myTextArea = new TextArea();
        sorted = new TextArea();
        myContentPane.add(myTextArea);
        myContentPane.add(sorted);
        dateList = new Date212[20];
        dateSize = 0;
        myFrame.setSize(500, 500);
        myFrame.setLocation(100, 100);
        myFrame.setTitle("Dates");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new GridLayout(1, 2));

        createFileMenu();
        myFrame.setVisible(true);
    } // initialize

    /**
     * This method takes two linked lists, one unsorted and one sorted and place
     * them into the text areas of the gui.
     *
     * @param UnsortedDateList
     * ul
     * @param SortedDateList
     * sl
     */
    public void put(UnsortedDate212List ul, SortedDate212List sl) {

        myTextArea.append(ul.toString() + "\n");
        sorted.append(sl.toString() + "\n");

    }// put

    /**
     * Creates a menu with a JMunuBar and JMenuItems which have actionListeners
     * given to them to react to the user's choice.
     */
    private void createFileMenu() {

        JMenuItem item;
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        FileMenuHandler fmh = new FileMenuHandler(this);

        item = new JMenuItem("Open"); // Open...
        item.addActionListener(fmh);
        fileMenu.add(item);

        fileMenu.addSeparator(); // add a horizontal separator line

        item = new JMenuItem("Quit"); // Quit
        item.addActionListener(fmh);
        fileMenu.add(item);

        myFrame.setJMenuBar(menuBar);
        menuBar.add(fileMenu);

    } // createMenu

}// class DateGUI