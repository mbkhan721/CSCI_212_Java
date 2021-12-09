package Threads;

import java.util.LinkedList;

public class LoggingThread extends Thread {

    private LinkedList linesToLog = new LinkedList();
    private volatile boolean terminateRequested;

    public void run() {
        try {
            while (!terminateRequested) {
                String line;
                synchronized (linesToLog) {
                    while (linesToLog.isEmpty())
                        linesToLog.wait();
                    line = (String) linesToLog.removeFirst();
                }
                doLogLine(line);
            }
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private void doLogLine(String line) {
        // write to wherever
    }

    public void log(String line) {
        synchronized (linesToLog) {
            linesToLog.add(line);
            linesToLog.notify();
        }
    }
}
