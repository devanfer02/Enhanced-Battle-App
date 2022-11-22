package Basics;

import javax.swing.*;

public class Settings extends BasicAdder{
    public JPanel settingsPanel = new JPanel();
    public JLabel titleSettings = new JLabel("SETTINGS",SwingConstants.CENTER);
    public JButton setColor = new JButton("MODE : DARK");
    public JButton setSound = new JButton("SOUND : ON");
    public JButton setSong = new JButton("CHANGE SONG");
    public JButton backMenu = new JButton("MENU");

    public Settings(){
        settingsPanel.setLayout(layout);
        setSpace(settingsPanel);
        setFont(titleSettings,50);

        setBtnColor(setColor);
        setBtnColor(setSound);
        setBtnColor(setSong);
        setBtnColor(backMenu);

        addComponent(0,0,3,titleSettings,settingsPanel);
        addComponent(0,1,3,setColor,settingsPanel);
        addComponent(0,2,3,setSound,settingsPanel);
        addComponent(0,3,3,setSong,settingsPanel);
        addComponent(0,4,3,backMenu,settingsPanel);


    }
}
