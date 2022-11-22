package Mutliplayer;

import Basics.BasicAdder;

import javax.swing.*;

public class Rules extends BasicAdder{
    public JPanel rulePanel = new JPanel();
    public JLabel titleRule = new JLabel("RULES",SwingConstants.CENTER);
    public JLabel desc1 = new JLabel("This Battle App is a rng turn based 2 player game ",SwingConstants.LEFT);
    public JLabel desc2 = new JLabel("Please don't skip this and read the following rules : ",SwingConstants.LEFT);
    public JLabel rule1 = new JLabel("1. Turns are rng based except skip turn");
    public JLabel rule2 = new JLabel("2. Skip turn gives opponent turn");
    public JLabel rule3 = new JLabel("3. Poison can decrease opponent atk, your atk or kill opponent");
    public JLabel rule4 = new JLabel("4. Each of you are givens 5 poisons");
    public JButton continueTo = new JButton("CONTINUE");
    public JButton backMenu = new JButton("MENU");

    public Rules(){
        rulePanel.setLayout(layout);
        setSpace(rulePanel);

        setFont(titleRule,40);
        setFont(desc1,22);
        setFont(desc2,22);
        setFont(rule1,22);
        setFont(rule2,22);
        setFont(rule3,22);
        setFont(rule4,22);
        setBtnColor(continueTo);
        setBtnColor(backMenu);

        addComponent(0,0,3,titleRule,rulePanel);
        addComponent(0,1,3,desc1,rulePanel);
        addComponent(0,2,3,desc2,rulePanel);
        addComponent(0,3,3,rule1,rulePanel);
        addComponent(0,4,3,rule2,rulePanel);
        addComponent(0,5,3,rule3,rulePanel);
        addComponent(0,6,3,rule4,rulePanel);
        addComponent(0,7,3,continueTo,rulePanel);
        addComponent(0,8,3,backMenu,rulePanel);
    }
}
