import javax.swing.*;

public class PracticeExam01b {
    public static void main(String[] args) {

        String inputStr = JOptionPane.showInputDialog(null,
                "Enter your message: ");
        int num = 0;

        for (int i = 0; i < inputStr.length()-1; i++) {
            if (Character.isDigit(inputStr.charAt(i))
                    && Character.isDigit(inputStr.charAt(i + 1))) {
                ++num;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Two digits happen " + num + " times.");
    }
}
