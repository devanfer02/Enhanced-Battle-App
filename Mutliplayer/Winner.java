package Mutliplayer;

import Basics.BasicAdder;

import javax.swing.*;

public class Winner extends BasicAdder{
    public JPanel winPanel = new JPanel();
    public JLabel congrats = new JLabel("Congratulations...",SwingConstants.CENTER);
    public JLabel won = new JLabel();
    public JButton newGameBtn = new JButton("NEW GAME");
    public JButton menuBtn = new JButton("MENU");

    public Winner(){
        winPanel.setLayout(layout);
        setSpace(winPanel);

        setFont(congrats,20);
        setFont(won, 55);
        setBtnColor(newGameBtn);
        setBtnColor(menuBtn);

        addComponent(0,0,5,congrats,winPanel);
        addComponent(0,1,5,won,winPanel);
        addComponent(0,2,5,newGameBtn,winPanel);
        addComponent(0,3,5,menuBtn,winPanel);
    }
}
