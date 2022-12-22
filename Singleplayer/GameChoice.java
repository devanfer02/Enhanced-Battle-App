package Singleplayer;

import Basics.BasicAdder;
import javax.swing.*;

public class GameChoice extends BasicAdder {
    public JPanel choicePanel = new JPanel();
    public JLabel titleChoice = new JLabel("GAME CHOICE");
    public JButton storyBtn = new JButton("STORY MODE");
    public JButton duelBtn = new JButton("DUEL MODE");
    public JButton menuBtn = new JButton("MENU");

    public GameChoice(){
        choicePanel.setLayout(layout);
        setSpace(choicePanel);

        setFont(titleChoice, 40);
        setBtnColor(storyBtn);
        setBtnColor(duelBtn);
        setBtnColor(menuBtn);

        addComponent(0,0,3,titleChoice,choicePanel);
        addComponent(0,1,3,storyBtn,choicePanel);
        addComponent(0,2,3,duelBtn,choicePanel);
        addComponent(0,4,3,menuBtn,choicePanel);
    }
}
