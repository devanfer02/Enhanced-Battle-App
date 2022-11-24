package Singleplayer;

import Basics.BasicAdder;
import javax.swing.*;

public class DuelModeRule extends BasicAdder{
    public JPanel duelRulePanel = new JPanel();
    public JLabel duelRuleTitle = new JLabel("DUEL MODE RULES");
    public JLabel desc1 = new JLabel("Duel mode is a 1v1 mode against computer");
    public JLabel desc2 = new JLabel("Rules are such : ");
    public JLabel rule1 = new JLabel("1. There's critical hit");
    public JLabel rule2 = new JLabel("2. Harder level More enemy action");
    public JLabel rule3 = new JLabel("3. Turns are still rng based");
    public JLabel rule4 = new JLabel("4. The creator is too lazy, HaveFun!");
    public JButton contDMGS = new JButton("CONTINUE");
    public JButton backChoice = new JButton("BACK");

    public DuelModeRule(){
        duelRulePanel.setLayout(layout);
        setSpace(duelRulePanel);

        setFont(duelRuleTitle, 45);
        setFont(desc1,22);
        setFont(desc2,22);
        setFont(rule1,22);
        setFont(rule2,22);
        setFont(rule3,22);
        setFont(rule4,22);
        setBtnColor(contDMGS);
        setBtnColor(backChoice);

        addComponent(0,0,3,duelRuleTitle,duelRulePanel);
        addComponent(0,1,3,desc1,duelRulePanel);
        addComponent(0,2,3,desc2,duelRulePanel);
        addComponent(0,3,3,rule1,duelRulePanel);
        addComponent(0,4,3,rule2,duelRulePanel);
        addComponent(0,5,3,rule3,duelRulePanel);
        addComponent(0,6,3,rule4,duelRulePanel);
        addComponent(0,7,3,contDMGS,duelRulePanel);
        addComponent(0,8,3,backChoice,duelRulePanel);

    }
}
