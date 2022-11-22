package Basics;

import javax.swing.*;
import java.awt.*;

public class Menu extends BasicAdder{
    public JPanel menuPanel = new JPanel();
    public JLabel titleMenu = new JLabel("BATTLE APP");
    public JButton singleBtn = new JButton("SINGLE PLAYER");
    public JButton multiBtn = new JButton("MULTI PLAYER");
    public JButton aboutBtn = new JButton("ABOUT");
    public JButton settingsBtn = new JButton("SETTINGS");
    public JButton exitBtn = new JButton("EXIT GAME");

    public Menu(){
        menuPanel.setLayout(layout);
        setSpace(menuPanel);

        setFont(titleMenu, 50);
        setBtnColor(singleBtn);
        setBtnColor(multiBtn);
        setBtnColor(aboutBtn);
        setBtnColor(settingsBtn);
        setBtnColor(exitBtn);

        addComponent(0,0,3,titleMenu,menuPanel);
        addComponent(0,1,3,singleBtn, menuPanel);
        addComponent(0,2,3,multiBtn,menuPanel);
        addComponent(0,3,3,aboutBtn,menuPanel);
        addComponent(0,4,3,settingsBtn,menuPanel);
        addComponent(0,5,3,exitBtn,menuPanel);
    }
}
