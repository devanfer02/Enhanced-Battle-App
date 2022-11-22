package Basics;

import javax.swing.*;
import java.awt.*;
public class Opening extends BasicAdder {
    public JPanel openingPanel = new JPanel();
    public JLabel titleGame = new JLabel("ENHANCED BATTLE APP");
    public JButton continueToMenu = new JButton("PRESS TO CONTINUE");
    public JButton exitGame = new JButton("EXIT GAME");

    public Opening(){
        openingPanel.setLayout(layout);
        setSpace(openingPanel);

        openingPanel.setBackground(Color.BLACK);
        setFont(titleGame, 50);
        setBtnColor(continueToMenu);
        setBtnColor(exitGame);

        addComponent(0,0,3,titleGame,openingPanel);
        addComponent(0,1,3,continueToMenu, openingPanel);
        addComponent(0,2,3,exitGame,openingPanel);
    }

}
