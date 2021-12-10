package Project3;
import javax.swing.*;
import java.awt.*;
import java.util.Set;
import java.util.TreeMap;

public class Date212GUI {

    TextArea myTextArea, sorted;
    Date212[] dateList;
    int dateSize;
    JFrame frame;

    public void myGUI() {

        frame = new JFrame();
        Container myContentPane = frame.getContentPane();
        myTextArea = new TextArea();
        sorted = new TextArea();
        myContentPane.add(myTextArea);
        myContentPane.add(sorted);
        dateList = new Date212[20];
        dateSize = 0;
        frame.setSize(400, 300);
        frame.setLocation(200, 200);
        frame.setTitle("Project 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));

        createFileMenu();
        frame.setVisible(true);
    } // initialize

    // TreeMapping both sorted and unsorted
    public void put(UnsortedDate212List unSor, SortedDate212List sor) {
        TreeMap<Date212, String> dateMap = new TreeMap<Date212, String>(); // TreeMap

      Date212Node temp = sor.first.next;
      while(temp.next!=null){
          dateMap.put(temp.data,null);
          temp = temp.next;
      }
      String date ="";
      Set<Date212> keys = dateMap.keySet();
      for(Date212 key : keys){
          date += key.toString()+"\n";
      }
      // System.out.println(date);
        myTextArea.append("Dates from file:\n\n" + unSor.toString() + "\n");
        sorted.append("Sorted Dates - Old to New:\n\n" + date);

    } // put()

    private void createFileMenu() {

        JMenuItem item;
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        FileMenuHandler fmh = new FileMenuHandler(this);

        item = new JMenuItem("Open"); // Open
        item.addActionListener(fmh);
        fileMenu.add(item);

        fileMenu.addSeparator(); // add a horizontal separator line

        item = new JMenuItem("Quit"); // Quit
        item.addActionListener(fmh);
        fileMenu.add(item);

        frame.setJMenuBar(menuBar);
        menuBar.add(fileMenu);

    } // createMenu
}