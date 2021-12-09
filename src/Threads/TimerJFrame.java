package Threads;

import javax.swing.*;
import java.awt.*;

public class TimerJFrame extends JFrame implements Runnable {

    private int secondsRemaining;
    private JTextArea text = new JTextArea();

    public TimerJFrame(int seconds) {
        secondsRemaining = seconds;
        setTitle("Time Remaining...");
        setSize(150, 150);
        setLocation(400, 200);
        Container cp = getContentPane();
        text.setFont(new Font("Arial", 2, 72));
        cp.add(text);
        text.append(Integer.toString(secondsRemaining));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Thread timer = new Thread(this);
        timer.start();
    }

    public void run() {
        System.out.println("The game has started...");
        while (secondsRemaining > 0) {
            try {
                Thread.sleep(1000);
                secondsRemaining--;
                text.setText(Integer.toString(secondsRemaining));
                setVisible(true);
            }
            catch (InterruptedException ie) {
                System.out.println("Timer is interrupted.");
            }
        }
        JOptionPane.showMessageDialog(null, "Time is up!");
    }
}




