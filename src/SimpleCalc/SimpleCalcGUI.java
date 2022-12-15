package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }

    public SimpleCalcGUI(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer();
            }
        });
    }

    public int get_tfNumber1(){
        return Integer.parseInt(tfNumber1.getText());
    }
    public int get_tfNumber2(){
        return Integer.parseInt(tfNumber2.getText());
    }

    public void answer() {
        try {
            if (Objects.equals(cbOperations.getSelectedItem(), "+")) {
                lblResult.setText(String.valueOf(get_tfNumber1() + get_tfNumber2()));
            } else if (Objects.equals(cbOperations.getSelectedItem(), "-")) {
                lblResult.setText(String.valueOf(get_tfNumber1() - get_tfNumber2()));
            } else if (Objects.equals(cbOperations.getSelectedItem(), "*")) {
                lblResult.setText(String.valueOf(get_tfNumber1() * get_tfNumber2()));
            } else if (Objects.equals(cbOperations.getSelectedItem(), "/")) {
                lblResult.setText(String.valueOf(get_tfNumber1() / get_tfNumber2()));
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Input must be a number. Try again.");
        }
    }
}
