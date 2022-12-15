package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");

        ButtonGroup group = new ButtonGroup();
        group.add(app.rb5);
        group.add(app.rbNone);
        group.add(app.rb10);
        group.add(app.rb15);
    }

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total();
            }
        });
    }

    public void total() {
        double total = 0;

        if(cPizza.isSelected()){
            total += 100;
        }
        if(cBurger.isSelected()){
            total += 80;
        }
        if(cFries.isSelected()){
            total += 65;
        }
        if(cSoftDrinks.isSelected()){
            total += 55;
        }
        if(cTea.isSelected()){
            total += 50;
        }
        if(cSundae.isSelected()){
            total += 40;
        }

        if(rb5.isSelected()){
            total -= (total*.05);
        }else if(rb10.isSelected()){
            total -= (total*.10);
        }else if(rb15.isSelected()){
            total -= (total*.15);
        }

        JOptionPane.showMessageDialog(null, "Total Price is Php " + String.format("%.2f", total));
    }
}
