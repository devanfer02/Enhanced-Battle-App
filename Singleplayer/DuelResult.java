package Singleplayer;

import Basics.BasicAdder;
import javax.swing.*;


public class DuelResult extends BasicAdder{
    public JPanel duelResultPanel = new JPanel();
    public JLabel topTitle = new JLabel("",SwingConstants.CENTER);
    public JLabel duelResultTitle = new JLabel("",SwingConstants.CENTER);
    public JButton newGame = new JButton("NEW GAME");
    public JButton backMenu = new JButton("BACK MENU");

    public DuelResult(){
        duelResultPanel.setLayout(layout);
        setSpace(duelResultPanel);

        setFont(topTitle,22);
        setFont(duelResultTitle,50);
        setBtnColor(newGame);
        setBtnColor(backMenu);

        addComponent(0,0,4,topTitle,duelResultPanel);
        addComponent(0,1,4,duelResultTitle,duelResultPanel);
        addComponent(0,2,4,newGame,duelResultPanel);
        addComponent(0,3,4,backMenu,duelResultPanel);
    }
}
