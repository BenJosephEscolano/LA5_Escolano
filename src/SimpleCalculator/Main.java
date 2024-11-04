package SimpleCalculator;

import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        Sample s = new Sample();
        s.setContentPane(s.panelMain);
        s.setSize(600,300);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setTitle("Simple Calculator");
        s.setVisible(true);
    }

}