package Singleplayer;

import Basics.BasicAdder;
import javax.swing.*;

public class DuelGame extends BasicAdder {
    public JPanel duelGamePanel = new JPanel();
    public JLabel Player = new JLabel("PLAYER",SwingConstants.CENTER);
    public JLabel Enemy = new JLabel("ENEMY",SwingConstants.CENTER);
    public JLabel PlayerHP = new JLabel();
    public JLabel PlayerAtk = new JLabel();
    public JLabel EnemyHP = new JLabel();
    public JLabel EnemyAtk = new JLabel();
    public JLabel duelStatus1 = new JLabel(" \t ",SwingConstants.CENTER);
    public JLabel duelStatus2 = new JLabel("WAITING FOR THE ROLL...",SwingConstants.CENTER);
    public JButton rollDuel = new JButton("ROLL TURN");
    public JButton attack = new JButton("ATTACK");
    public JButton heal = new JButton("HEAL");
    public JButton poison = new JButton("POISON");
    public JButton surrender = new JButton("SURRENDER");
    public JButton settingsDuel = new JButton("SETTINGS");

    public DuelGame(){
        duelGamePanel.setLayout(layout);
        setSpace(duelGamePanel);

        setFont(Player,22);
        setFont(Enemy,22);
        setFont(PlayerHP,22);
        setFont(PlayerAtk,22);
        setFont(EnemyHP,22);
        setFont(EnemyAtk,22);
        setFont(duelStatus1,22);
        setFont(duelStatus2,22);
        setBtnColor(rollDuel);
        setBtnColor(attack);
        setBtnColor(heal);
        setBtnColor(poison);
        setBtnColor(surrender);
        setBtnColor(settingsDuel);

        addComponent(0,0,1,Player,duelGamePanel);
        addComponent(0,1,1,PlayerHP,duelGamePanel);
        addComponent(0,2,1,PlayerAtk,duelGamePanel);
        addComponent(1,0,1,Enemy,duelGamePanel);
        addComponent(1,1,1,EnemyHP,duelGamePanel);
        addComponent(1,2,1,EnemyAtk,duelGamePanel);
        addComponent(0,3,6,duelStatus1,duelGamePanel);
        addComponent(0,4,6,duelStatus2,duelGamePanel);
        addComponent(0,5,6,rollDuel,duelGamePanel);
        addComponent(0,6,6,settingsDuel,duelGamePanel);
    }
}
