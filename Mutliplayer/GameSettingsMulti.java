package Mutliplayer;

import Basics.BasicAdder;

import javax.swing.*;

public class GameSettingsMulti extends BasicAdder{
    public int Player1_HP = 1000;
    public int Player2_HP = 1000;

    public int Player1_ATKR = 100;
    public int Player2_ATKR = 100;

    public int hpLow = 100;
    public int hpMed = 500;
    public int hpHigh = 1000;
    public int hpCrazy = 100000;

    public int atkLow = 10;
    public int atkMed = 50;
    public int atkHigh = 100;
    public int atkCrazy = 10000;

    public boolean isHpLow = false;
    public boolean isHpMed = false;
    public boolean isHpHigh = false;
    public boolean isHpCrazy = false;

    public boolean isAtkLow = false;
    public boolean isAtkMed = false;
    public boolean isAtkHigh = false;
    public boolean isAtkCrazy = false;


    public JPanel gameSetMulti = new JPanel();
    public JLabel settingsMultiTxt = new JLabel("GAME SETTINGS",SwingConstants.CENTER);
    public JLabel setHp = new JLabel("Set Hitpoint");
    public JLabel setAtk = new JLabel("Set Atk Range");
    public JLabel settingHp = new JLabel("HP : ");
    public JLabel settingAtk = new JLabel("Atk : ");
    public JButton setHpLowBtn = new JButton("Low Hitpoint - " + hpLow);
    public JButton setHpMedBtn = new JButton("Med Hitpoint  - " + hpMed);
    public JButton setHpHighBtn = new JButton("High Hitpoint  - " + hpHigh);
    public JButton setHpCrazyBtn = new JButton("WTF Hitpoint  - " + hpCrazy);
    public JButton setAtkLowBtn = new JButton("Low Atk Range - " + atkLow);
    public JButton setAtkMedBtn = new JButton("Med Atk Range - " + atkMed);
    public JButton setAtkHighBtn = new JButton("High Atk Range - " + atkHigh);
    public JButton setAtkCrazyBtn = new JButton("WTF Atk Range - " + atkCrazy);
    public JButton startMultiGame = new JButton("START");
    public JButton backToRule = new JButton("RULES");

    public GameSettingsMulti(){
        gameSetMulti.setLayout(layout);
        setSpace(gameSetMulti);

        setFont(settingsMultiTxt,40);
        setFont(setHp,22);
        setFont(setAtk,22);
        setFont(settingHp,22);
        setFont(settingAtk,22);
        setBtnColor(setHpLowBtn);
        setBtnColor(setHpMedBtn);
        setBtnColor(setHpHighBtn);
        setBtnColor(setHpCrazyBtn);
        setBtnColor(setAtkLowBtn);
        setBtnColor(setAtkMedBtn);
        setBtnColor(setAtkHighBtn);
        setBtnColor(setAtkCrazyBtn);
        setBtnColor(startMultiGame);
        setBtnColor(backToRule);

        addComponent(0,0,3,settingsMultiTxt,gameSetMulti);

        addComponent(0,1,1,setHp,gameSetMulti);
        addComponent(0,2,1,settingHp,gameSetMulti);
        addComponent(0,3,1,setHpLowBtn,gameSetMulti);
        addComponent(0,4,1,setHpMedBtn,gameSetMulti);
        addComponent(0,5,1,setHpHighBtn,gameSetMulti);
        addComponent(0,6,1,setHpCrazyBtn,gameSetMulti);

        addComponent(1,1,1,setAtk,gameSetMulti);
        addComponent(1,2,1,settingAtk,gameSetMulti);
        addComponent(1,3,1,setAtkLowBtn,gameSetMulti);
        addComponent(1,4,1,setAtkMedBtn,gameSetMulti);
        addComponent(1,5,1,setAtkHighBtn,gameSetMulti);
        addComponent(1,6,1,setAtkCrazyBtn,gameSetMulti);

        addComponent(0,7,3,startMultiGame,gameSetMulti);
        addComponent(0,8,3,backToRule,gameSetMulti);

    }
}
