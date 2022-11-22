package Mutliplayer;

import javax.swing.*;
import Basics.BasicAdder;

public class GameMulti extends BasicAdder{
    public JPanel gameMultiPanel = new JPanel();
    public JLabel labelPlayer1 = new JLabel("Player 1",SwingConstants.CENTER);
    public JLabel labelPlayer2 = new JLabel("Player 2",SwingConstants.CENTER);
    public JLabel hpPlayer1 = new JLabel("Hitpoint : ");
    public JLabel hpPlayer2 = new JLabel("Hitpoint : " ,SwingConstants.RIGHT);
    public JLabel atkPlayer1R = new JLabel("P1 ATK R : ");
    public JLabel atkPlayer2R = new JLabel("P2 ATK R : ",SwingConstants.RIGHT);
    public JLabel statusGame = new JLabel("Status",SwingConstants.CENTER);
    public JButton rollBtn = new JButton("ROLL TURN");
    public JButton btnAtkP1 = new JButton("ATTACK");
    public JButton btnHealP1 = new JButton("HEAL");
    public JButton btnPoisonP1 = new JButton("POISON");
    public JButton continueP1 = new JButton("SKIP");
    public JButton btnAtkP2 = new JButton("ATTACK");
    public JButton btnHealP2 = new JButton("HEAL");
    public JButton btnPoisonP2 = new JButton("POISON");
    public JButton continueP2 = new JButton("SKIP");
    public JButton settings = new JButton("SETTINGS");

    public GameMulti(){
        gameMultiPanel.setLayout(layout);
        setSpace(gameMultiPanel);

        setFont(labelPlayer1,22);
        setFont(labelPlayer2,22);
        setFont(hpPlayer1,22);
        setFont(hpPlayer2,22);
        setFont(atkPlayer1R,22);
        setFont(atkPlayer2R,22);
        setFont(statusGame,22);
        setBtnColor(rollBtn);
        setBtnColor(btnAtkP1);
        setBtnColor(btnHealP1);
        setBtnColor(btnPoisonP1);
        setBtnColor(continueP1);
        setBtnColor(btnAtkP2);
        setBtnColor(btnHealP2);
        setBtnColor(btnPoisonP2);
        setBtnColor(continueP2);
        setBtnColor(settings);

        //SET FONT COLOR TO LOOK DARK

        addComponent(0,0,1,labelPlayer1,gameMultiPanel);
        addComponent(0,1,1,hpPlayer1,gameMultiPanel);
        addComponent(0,2,1,atkPlayer1R,gameMultiPanel);
        addComponent(4,0,1,labelPlayer2,gameMultiPanel);
        addComponent(4,1,1,hpPlayer2,gameMultiPanel);
        addComponent(4,2,1,atkPlayer2R,gameMultiPanel);
        addComponent(0,3,5,statusGame,gameMultiPanel);
    }


}
