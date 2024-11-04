package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample extends JFrame{
    public JPanel panelMain;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rbNone;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public Sample(){
        JCheckBox[] cbFood = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
        JRadioButton[] rbDiscount = {rbNone, rb5, rb10, rb15};

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalPrice = 0;
                for (int i = 0; i < cbFood.length; i++){
                    if (cbFood[i].isSelected()){
                        switch (i){
                            case 0:
                                totalPrice += 100;
                                break;
                            case 1:
                                totalPrice += 80;
                                break;
                            case 2:
                                totalPrice += 65;
                                break;
                            case 3:
                                totalPrice += 55;
                                break;
                            case 4:
                                totalPrice += 50;
                                break;
                            case 5:
                                totalPrice += 40;
                                break;

                        }
                    }
                }
                int discount = 0;
                for (int i = 0; i < rbDiscount.length; i++){
                    if (rbDiscount[i].isSelected()){
                        switch (i){
                            case 0:
                                discount = 0;
                                break;
                            case 1:
                                discount = 5;
                                break;
                            case 2:
                                discount = 10;
                                break;
                            case 3:
                                discount = 15;
                                break;
                        }
                    }
                }

                float amount = totalPrice * ((100 - discount) / 100.0f);
                JOptionPane.showMessageDialog(null, "The total price is Php " + amount);
            }
        });
    }
}
