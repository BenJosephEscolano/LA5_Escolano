package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample extends JFrame {
    public JPanel panelMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JButton btnCompute;

    Sample(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sFirst = tfNumber1.getText();
                int first = 0;
                for (int i = 0; i < sFirst.length(); i++){
                    first *= 10;
                    first += sFirst.charAt(i) - '0';
                }

                String sSecond = tfNumber2.getText();
                int second = 0;
                for (int i = 0; i < sSecond.length(); i++){
                    second *= 10;
                    second += sSecond.charAt(i) - '0';
                }
                int result = 0;
                int op = cbOperations.getSelectedIndex();
                switch (op){
                    case 0:
                        result = first + second;
                        break;
                    case 1:
                        result = first - second;
                        break;
                    case 2:
                        result = first * second;
                        break;
                    case 3:
                        try {
                            result = first / second;
                        } catch (ArithmeticException e1){
                            System.out.println("Cannot Divide by Zero");
                            System.exit(-1);
                        }

                        break;
                }
                lblResult.setText(result + "\n");

            }
        });
    }

}
