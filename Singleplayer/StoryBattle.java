package Singleplayer;

import Basics.BasicAdder;
import javax.swing.*;

public class StoryBattle extends BasicAdder{
    // PLAYER AND ENEMY STATS
    public int hpPlayer = 120;
    public int atkPlayer = 20;
    public int hpEnemy = 120;
    public int atkEnemy = 20;
    public String wpnPlayer = "laptop";
    public String wpnEnemy = "knife";

    public JPanel storyBtlPanel = new JPanel();
    public JLabel titleBtl = new JLabel("BATTLE 1");
    public JLabel player = new JLabel("PLAYER",SwingConstants.CENTER);
    public JLabel enemy = new JLabel("ENEMY",SwingConstants.CENTER);
    public JLabel PlayerHP = new JLabel("Hitpoint : " + hpPlayer);
    public JLabel EnemyHP = new JLabel("Hitpoint : " + hpEnemy);
    public JLabel PlayerWpn = new JLabel("Weapon : " + wpnPlayer);
    public JLabel EnemyWpn = new JLabel("Weapon : " + wpnEnemy);
    public JLabel PlayerAtk = new JLabel("Atk Range : " + atkPlayer);
    public JLabel EnemyAtk = new JLabel("Atk Range : " + atkEnemy);
    public JLabel status1 = new JLabel(" ");
    public JLabel status2 = new JLabel("WAITING FOR THE ROLL",SwingConstants.CENTER);

    //BUTTON BATTLE ACTION
    public JButton rollBtn = new JButton("ROLL TURN");
    public JButton playerAtk = new JButton("ATTACK");
    public JButton playerHeal = new JButton("HEAL");
    public JButton settingsBtl = new JButton("SETTINGS");

    public StoryBattle(){
        storyBtlPanel.setLayout(layout);
        setSpace(storyBtlPanel);

        setFont(titleBtl, 40);
        setFont(player,22);
        setFont(enemy,22);
        setFont(PlayerHP,22);
        setFont(PlayerWpn,22);
        setFont(PlayerAtk,22);
        setFont(EnemyHP,22);
        setFont(EnemyWpn,22);
        setFont(EnemyAtk,22);
        setFont(status1,22);
        setFont(status2,22);

        setBtnColor(rollBtn);
        setBtnColor(playerAtk);
        setBtnColor(playerHeal);
        setBtnColor(settingsBtl);

        addComponent(0,0,1,player,storyBtlPanel);
        addComponent(0,1,1,PlayerHP,storyBtlPanel);
        addComponent(0,2,1,PlayerWpn,storyBtlPanel);
        addComponent(0,3,1,PlayerAtk,storyBtlPanel);

        addComponent(1,0,1,enemy,storyBtlPanel);
        addComponent(1,1,1,EnemyHP,storyBtlPanel);
        addComponent(1,2,1,EnemyWpn,storyBtlPanel);
        addComponent(1,3,1,EnemyAtk,storyBtlPanel);

        addComponent(0,4,4,status1,storyBtlPanel);
        addComponent(0,5,4,status2,storyBtlPanel);

        showRoll();
    }

    //BATTLE METHODS
    public void showRoll(){
        addComponent(0,6,4,rollBtn,storyBtlPanel);
        addComponent(0,7,4,settingsBtl,storyBtlPanel);
    }

    public void removeRoll(){
        removeBtn(rollBtn);
        removeBtn(settingsBtl);
    }

    public void rollTurn(){
        int turn = (int)(Math.random() * 10);
        if(turn % 2 == 0){
            enemyAction();
        } else{
            playerAction();
        }
    }

    public void playerAction(){
        removeRoll();
        addPlayerAction();
    }

    public void enemyAction(){
        int turnE = (int)(Math.random() * 3) + 1;
        switch (turnE){
            case 1:
                int atk = (int) (Math.random() * 20) + 15;
                hpPlayer -= atk;
                status1.setText("Enemy attacked w/ knife");
                status2.setText("Damage taken " + atk);
                PlayerHP.setText("Hitpoint : " + hpPlayer);
                break;
            case 2:
                int heal = (int)(Math.random() * 20) + 5;
                hpEnemy += heal;
                if(hpEnemy > 120){
                    hpEnemy = 120;
                }
                status1.setText("Enemy healed");
                status2.setText("Healed " + heal);
                break;
            default:
                status1.setText("Enemy give you mercy");
                status2.setText("Enemy skipped turn");
        }
    }

    public void removePlayerAction(){
        removeBtn(playerAtk);
        removeBtn(playerHeal);
        removeBtn(settingsBtl);
    }

    public void addPlayerAction(){
        addComponent(0,8,4,playerAtk,storyBtlPanel);
        addComponent(0,9,4,playerHeal,storyBtlPanel);
        addComponent(0,9,4,settingsBtl,storyBtlPanel);
    }

}
