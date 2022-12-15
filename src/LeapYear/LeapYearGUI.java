package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.panel1);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                is_LeapYear();
            }
        });
    }

    public int get_Year() {
        String str = this.tfYear.getText();
        return Integer.parseInt(str);
    }
    public void is_LeapYear() {
        try{
            int year = get_Year();

            if( year % 4 == 0){
                JOptionPane.showMessageDialog(null, "Leap year");
                tfYear.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Not a leap year");
                tfYear.setText("");
            }
        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Input must be a number. Try again.");
            tfYear.setText("");
        }
    }
}
