package Mutliplayer;

import javax.swing.*;
import Basics.BasicAdder;

public class MultiGameSettings extends BasicAdder{
    public JPanel pauseSettingPanel = new JPanel();
    public JLabel titleSettings = new JLabel("SETTINGS",SwingConstants.CENTER);
    public JButton continueToGame = new JButton("CONTINUE");
    public JButton setColor = new JButton("MODE : DARK");
    public JButton setSound = new JButton("SOUND : ON");
    public JButton setSong = new JButton("CHANGE SONG");

    public JButton backMenu = new JButton("MENU");

    public MultiGameSettings(){
        pauseSettingPanel.setLayout(layout);
        setSpace(pauseSettingPanel);
        setFont(titleSettings,50);

        setBtnColor(continueToGame);
        setBtnColor(setColor);
        setBtnColor(setSound);
        setBtnColor(setSong);
        setBtnColor(backMenu);

        addComponent(0,0,3,titleSettings,pauseSettingPanel);
        addComponent(0,1,3,continueToGame,pauseSettingPanel);
        addComponent(0,2,3,setColor,pauseSettingPanel);
        addComponent(0,3,3,setSound,pauseSettingPanel);
        addComponent(0,4,3,setSong,pauseSettingPanel);
        addComponent(0,5,3,backMenu,pauseSettingPanel);


    }
}
