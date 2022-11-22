package Basics;

import javax.swing.*;
import java.awt.*;

public class BasicAdder {
    public GridBagLayout layout = new GridBagLayout();
    GridBagConstraints constr = new GridBagConstraints();

    public void setSpace(JPanel panel){
        constr.fill = GridBagConstraints.HORIZONTAL ;
        constr.insets = new Insets(10,10,10,10);
        panel.setBackground(Color.BLACK);

    }

    public void addComponent(int x, int y, int width, JLabel text, JPanel panel){
        constr.gridx = x;
        constr.gridy = y;
        constr.gridwidth = width;
        panel.add(text, constr);
    }

    public void addComponent(int x, int y, int width, JButton button, JPanel panel){
        constr.gridx = x;
        constr.gridy = y;
        constr.gridwidth = width;
        panel.add(button, constr);
    }

    public void setBtnColor(JButton button){
        button.setBackground(Color.LIGHT_GRAY);
        button.setForeground(Color.BLACK);
    }


    public void setFont(JLabel label, int size){
        label.setFont(new Font("Calibri", Font.PLAIN, size));
        label.setForeground(Color.white);
    }


}
