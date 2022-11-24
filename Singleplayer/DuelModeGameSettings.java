package Singleplayer;

import Basics.BasicAdder;
import javax.swing.*;

public class DuelModeGameSettings extends BasicAdder{
    //PLAYER SETTING
    public int playerHp = 120;
    public int playerAtk = 20;

    //ENEMY SETTING
    public int enemyHp = 120;
    public int enemyAtk = 20;

    public boolean isEasy = false;
    public boolean isNormal = false;
    public boolean isHard = false;
    public boolean isExtreme = false;

    public JPanel duelSettingPanel = new JPanel();
    public JLabel titleDuelSetting = new JLabel("GAME SETTINGS",SwingConstants.CENTER);
    public JButton easyButton = new JButton("EASY");
    public JButton normalButton = new JButton("NORMAL");
    public JButton hardButton = new JButton("HARD");
    public JButton extremeButton = new JButton("EXTREME");

    public JLabel easyLabel = new JLabel("",SwingConstants.CENTER);
    public JLabel normalLabel = new JLabel("",SwingConstants.CENTER);
    public JLabel hardLabel = new JLabel("",SwingConstants.CENTER);
    public JLabel extremeLabel = new JLabel("",SwingConstants.CENTER);

    public JLabel underLabel = new JLabel("SELECT MODE",SwingConstants.CENTER);

    public JButton startButton = new JButton("START GAME");
    public JButton backRule = new JButton("BACK TO RULE");
    public DuelModeGameSettings(){
        duelSettingPanel.setLayout(layout);
        setSpace(duelSettingPanel);

        setFont(titleDuelSetting,40);
        setBtnColor(easyButton);
        setBtnColor(normalButton);
        setBtnColor(hardButton);
        setBtnColor(extremeButton);

        setFont(easyLabel,20);
        setFont(normalLabel,20);
        setFont(hardLabel,20);
        setFont(extremeLabel,20);
        setFont(underLabel,20);

        setBtnColor(startButton);
        setBtnColor(backRule);

        addComponent(0,0,5,titleDuelSetting, duelSettingPanel);
        addComponent(1,1,1,easyButton, duelSettingPanel);
        addComponent(2,1,1,normalButton, duelSettingPanel);
        addComponent(3,1,1,hardButton, duelSettingPanel);
        addComponent(4,1,1,extremeButton, duelSettingPanel);

        addComponent(1,3,5,underLabel,duelSettingPanel);
        addComponent(1,3,1,easyLabel, duelSettingPanel);
        addComponent(2,3,1,normalLabel, duelSettingPanel);
        addComponent(3,3,1,hardLabel, duelSettingPanel);
        addComponent(4,3,1,extremeLabel, duelSettingPanel);

        addComponent(0,4,5,startButton, duelSettingPanel);
        addComponent(0,5,5,backRule, duelSettingPanel);
    }
}
