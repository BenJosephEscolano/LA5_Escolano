package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample extends JFrame{
    public JPanel panelMain;
    private JTextField yearTextField;
    private JButton checkYearButton;

    Sample(){
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sYear = yearTextField.getText();
                int year = 0;
                for (int i = 0; i < sYear.length(); i++){
                    year *= 10;
                    year += sYear.charAt(i) - '0';
                }
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                    JOptionPane.showMessageDialog(null, "Leap Year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a Leap Year");
                }
            }
        });
    }
}
