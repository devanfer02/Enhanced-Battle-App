package Singleplayer;

import Basics.BasicAdder;
import javax.swing.*;

public class DuelGame extends BasicAdder {
    public JPanel duelGamePanel = new JPanel();
    public JLabel Player = new JLabel("PLAYER",SwingConstants.CENTER);
    public JLabel Enemy = new JLabel("ENEMY",SwingConstants.CENTER);
    public JLabel PlayerHP = new JLabel("HITPOINT : ");
    public JLabel PlayerAtk = new JLabel("ATK RANGE : ");
    public JLabel EnemyHP = new JLabel("HITPOINT : ");
    public JLabel EnemyAtk = new JLabel("ATK RANGE : ");
    public JLabel duelStatus1 = new JLabel(" ",SwingConstants.CENTER);
    public JLabel duelStatus2 = new JLabel("WAITING FOR THE ROLL...",SwingConstants.CENTER);
    public JButton rollDuel = new JButton("ROLL TURN");
    public JButton attackBtn = new JButton("ATTACK");
    public JButton healBtn = new JButton("HEAL");
    public JButton poisonBtn = new JButton("POISON");
    public JButton surrenderBtn = new JButton("SURRENDER");
    public JButton settingsDuel = new JButton("SETTINGS");

    public DuelGame(){
        duelGamePanel.setLayout(layout);
        setSpace(duelGamePanel);

        setFont(Player,26);
        setFont(Enemy,26);
        setFont(PlayerHP,26);
        setFont(PlayerAtk,26);
        setFont(EnemyHP,26);
        setFont(EnemyAtk,26);
        setFont(duelStatus1,26);
        setFont(duelStatus2,26);
        setBtnColor(rollDuel);
        setBtnColor(attackBtn);
        setBtnColor(healBtn);
        setBtnColor(poisonBtn);
        setBtnColor(surrenderBtn);
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
