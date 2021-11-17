package Lab21;

import java.io.File;
import javax.swing.*;
public class ListFiles {

    public static void main(String[] args) {
        JFileChooser fd = new JFileChooser();
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY
//            * JFileChooser.FILES_AND_DIRECTORIES
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
        File f = fd.getSelectedFile();
        System.out.println("Largest file: " + listFiles(f,""));

    }
    public static long listFiles(File f, String indent) {
        File files[] = f.listFiles();
        long runningMax = 0;
        for (int i = 0; i<files.length; i++) {
            File f2 = files[i];
//            System.out.print(indent+f2.getName());
//            System.out.print("...");
//            System.out.print(f2.lastModified());
//            System.out.print("...");
//            System.out.print(f2.length());
//            System.out.println();
            long res = 0;
            if (f2.isDirectory()) {
                res = listFiles(f2, indent + "   ");
            }
            else {
                res = f2.length();
            }

            runningMax = Math.max(runningMax, res);
        }
        return runningMax;
    }
}

// Find the largest file and display it.
