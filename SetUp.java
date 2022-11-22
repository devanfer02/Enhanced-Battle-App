import Basics.*;
import Basics.Menu;
import Mutliplayer.*;

import java.awt.*;

public class SetUp extends Adder {
    Opening Opening = new Opening();
    Menu Menu = new Menu();
    About About = new About();
    Settings Settings = new Settings();
    Rules Rules = new Rules();
    GameSettingsMulti Gsm = new GameSettingsMulti();
    GameMulti Gm = new GameMulti();
    MultiGameSettings Mgs = new MultiGameSettings();
    Winner winner = new Winner();

    //START SWITCH THEME//
    public void switchMode(){
        Opening();
        Menu();
        About();
        Settings();
        Rules();
        GameSetMulti();
        GameMulti();
        MultiGameSettings();
    }
    public void Opening(){
        switchPanelColor(Opening.openingPanel);
        switchLabelColor(Opening.titleGame);
        switchBtnColor(Opening.continueToMenu);
        switchBtnColor(Opening.exitGame);
    }
    public void Menu(){
        switchPanelColor(Menu.menuPanel);
        switchLabelColor(Menu.titleMenu);
        switchBtnColor(Menu.singleBtn);
        switchBtnColor(Menu.multiBtn);
        switchBtnColor(Menu.aboutBtn);
        switchBtnColor(Menu.settingsBtn);
        switchBtnColor(Menu.exitBtn);
    }

    public void About(){
        switchPanelColor(About.aboutPanel);
        switchLabelColor(About.titleMenu);
        switchLabelColor(About.paragraph1);
        switchLabelColor(About.paragraph2);
        switchLabelColor(About.paragraph3);
        switchBtnColor(About.backMainBtn);
    }

    public void Settings(){
        switchPanelColor(Settings.settingsPanel);
        switchLabelColor(Settings.titleSettings);
        switchBtnColor(Settings.setColor);
        switchBtnColor(Settings.setSound);
        switchBtnColor(Settings.setSong);
        switchBtnColor(Settings.backMenu);
    }

    public void Rules(){
        switchPanelColor(Rules.rulePanel);
        switchLabelColor(Rules.titleRule);
        switchLabelColor(Rules.desc1);
        switchLabelColor(Rules.desc2);
        switchLabelColor(Rules.rule1);
        switchLabelColor(Rules.rule2);
        switchLabelColor(Rules.rule3);
        switchBtnColor(Rules.continueTo);
        switchBtnColor(Rules.backMenu);
    }

    public void GameSetMulti(){
        switchPanelColor(Gsm.gameSetMulti);
        switchLabelColor(Gsm.settingsMultiTxt);
        switchLabelColor(Gsm.setHp);
        switchLabelColor(Gsm.setAtk);
        switchLabelColor(Gsm.settingHp);
        switchLabelColor(Gsm.settingAtk);
        switchBtnColor(Gsm.setHpLowBtn);
        switchBtnColor(Gsm.setHpMedBtn);
        switchBtnColor(Gsm.setHpHighBtn);
        switchBtnColor(Gsm.setHpCrazyBtn);
        switchBtnColor(Gsm.setAtkLowBtn);
        switchBtnColor(Gsm.setAtkMedBtn);
        switchBtnColor(Gsm.setAtkHighBtn);
        switchBtnColor(Gsm.setAtkCrazyBtn);
        switchBtnColor(Gsm.startMultiGame);
        switchBtnColor(Gsm.backToRule);
    }

    public void GameMulti(){
        switchPanelColor(Gm.gameMultiPanel);
        switchLabelColor(Gm.labelPlayer1);
        switchLabelColor(Gm.labelPlayer2);
        switchLabelColor(Gm.hpPlayer1);
        switchLabelColor(Gm.hpPlayer2);
        switchLabelColor(Gm.atkPlayer1R);
        switchLabelColor(Gm.atkPlayer2R);
        switchLabelColor(Gm.statusGame);
        switchBtnColor(Gm.rollBtn);
        switchBtnColor(Gm.btnAtkP1);
        switchBtnColor(Gm.btnHealP1);
        switchBtnColor(Gm.btnPoisonP1);
        switchBtnColor(Gm.continueP1);
        switchBtnColor(Gm.btnAtkP2);
        switchBtnColor(Gm.btnHealP2);
        switchBtnColor(Gm.btnPoisonP2);
        switchBtnColor(Gm.continueP2);
        switchBtnColor(Gm.settings);
    }

    public void MultiGameSettings(){
        switchPanelColor(Mgs.pauseSettingPanel);
        switchLabelColor(Mgs.titleSettings);
        switchBtnColor(Mgs.continueToGame);
        switchBtnColor(Mgs.setColor);
        switchBtnColor(Mgs.setSound);
        switchBtnColor(Mgs.setSong);
        switchBtnColor(Mgs.backMenu);
    }
    //END SWITCH THEME//

    ///COLOR FOR GAME SET MUTLI SWITCH
    public void checkModeGSM_HP(){
        if(dark && Gsm.isHpLow){
            Gsm.setHpLowBtn.setBackground(new Color(46,139,87));
            Gsm.setHpMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && Gsm.isHpMed){
            Gsm.setHpLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpMedBtn.setBackground(new Color(46,139,87));
            Gsm.setHpHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && Gsm.isHpHigh){
            Gsm.setHpLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpHighBtn.setBackground(new Color(46,139,87));
            Gsm.setHpCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && Gsm.isHpCrazy){
            Gsm.setHpLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpCrazyBtn.setBackground(new Color(46,139,87));
        }
        if(light && Gsm.isHpLow){
            Gsm.setHpLowBtn.setBackground(new Color(46,139,87));
            Gsm.setHpMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && Gsm.isHpMed){
            Gsm.setHpLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpMedBtn.setBackground(new Color(46,139,87));
            Gsm.setHpHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && Gsm.isHpHigh){
            Gsm.setHpLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpHighBtn.setBackground(new Color(46,139,87));
            Gsm.setHpCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && Gsm.isHpCrazy){
            Gsm.setHpLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpCrazyBtn.setBackground(new Color(46,139,87));
        }
    }
    public void checkModeGSM_ATK(){
        if(dark && Gsm.isAtkLow){
            Gsm.setAtkLowBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && Gsm.isAtkMed){
            Gsm.setAtkLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkMedBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && Gsm.isAtkHigh){
            Gsm.setAtkLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkHighBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && Gsm.isAtkCrazy){
            Gsm.setAtkLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(new Color(210,4,45));
        }
        if(light && Gsm.isAtkLow){
            Gsm.setAtkLowBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && Gsm.isAtkMed){
            Gsm.setAtkLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkMedBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && Gsm.isAtkHigh){
            Gsm.setAtkLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkHighBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && Gsm.isAtkCrazy){
            Gsm.setAtkLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(new Color(210,4,45));
        }
    }

    ///COLOR FOR GAME MULTI
    public void rollDiceCheckMode(){
        if(dark){
            Gm.labelPlayer1.setForeground(Color.DARK_GRAY);
            Gm.hpPlayer1.setForeground(Color.DARK_GRAY);
            Gm.atkPlayer1R.setForeground(Color.DARK_GRAY);
            Gm.labelPlayer2.setForeground(Color.DARK_GRAY);
            Gm.hpPlayer2.setForeground(Color.DARK_GRAY);
            Gm.atkPlayer1R.setForeground(Color.DARK_GRAY);
        }
        if(light){
            Gm.labelPlayer1.setForeground(Color.LIGHT_GRAY);
            Gm.hpPlayer1.setForeground(Color.LIGHT_GRAY);
            Gm.atkPlayer1R.setForeground(Color.LIGHT_GRAY);
            Gm.labelPlayer2.setForeground(Color.LIGHT_GRAY);
            Gm.hpPlayer2.setForeground(Color.LIGHT_GRAY);
            Gm.atkPlayer1R.setForeground(Color.LIGHT_GRAY);
        }
    }

    public void P1TurnCheckMode(){
        if(dark){
            Gm.labelPlayer2.setForeground(Color.DARK_GRAY);
            Gm.hpPlayer2.setForeground(Color.DARK_GRAY);
            Gm.atkPlayer2R.setForeground(Color.DARK_GRAY);
        }
        if(light){
            Gm.labelPlayer2.setForeground(Color.LIGHT_GRAY);
            Gm.hpPlayer2.setForeground(Color.LIGHT_GRAY);
            Gm.atkPlayer2R.setForeground(Color.LIGHT_GRAY);
        }
    }
    public void P2TurnCheckMode(){
        if(dark){
            Gm.labelPlayer1.setForeground(Color.DARK_GRAY);
            Gm.hpPlayer1.setForeground(Color.DARK_GRAY);
            Gm.atkPlayer1R.setForeground(Color.DARK_GRAY);
        }
        if(light){
            Gm.labelPlayer1.setForeground(Color.LIGHT_GRAY);
            Gm.hpPlayer1.setForeground(Color.LIGHT_GRAY);
            Gm.atkPlayer1R.setForeground(Color.LIGHT_GRAY);
        }
    }
    //ACTIONS FOR GAME
    public void rollDice(){
        constr.fill = GridBagConstraints.HORIZONTAL ;
        constr.insets = new Insets(10,10,10,10);
        rollDiceCheckMode();
        Gm.statusGame.setForeground(Color.WHITE);
        Gm.statusGame.setText("Waiting for the roll...");
        addComponent(0,4,5,Gm.rollBtn,Gm.gameMultiPanel);
        addComponent(0,5,5,Gm.settings, Gm.gameMultiPanel);
    }

    public void P1Action(){
        constr.fill = GridBagConstraints.HORIZONTAL ;
        constr.insets = new Insets(10,10,10,10);
        P1TurnCheckMode();
        Gm.labelPlayer1.setForeground(new Color(171,215,235));
        Gm.hpPlayer1.setForeground(new Color(171,215,235));
        Gm.atkPlayer1R.setForeground(new Color(171,215,235));
        Gm.statusGame.setForeground(new Color(171,215,235));
        Gm.btnAtkP1.setBackground(new Color(171,215,235));
        Gm.btnHealP1.setBackground(new Color(171,215,235));
        Gm.btnPoisonP1.setBackground(new Color(171,215,235));
        Gm.continueP1.setBackground(new Color(171,215,235));
        Gm.statusGame.setText("Player 1 Turn");
        addComponent(0,4,5,Gm.btnAtkP1, Gm.gameMultiPanel);
        addComponent(0,5,5,Gm.btnHealP1, Gm.gameMultiPanel);
        addComponent(0,6,5,Gm.btnPoisonP1, Gm.gameMultiPanel);
        addComponent(0,7,5,Gm.settings, Gm.gameMultiPanel);
    }

    public void P2Action(){
        constr.fill = GridBagConstraints.HORIZONTAL ;
        constr.insets = new Insets(10,10,10,10);
        P2TurnCheckMode();
        Gm.labelPlayer2.setForeground(new Color(244,241,134));
        Gm.hpPlayer2.setForeground(new Color(244,241,134));
        Gm.atkPlayer2R.setForeground(new Color(244,241,134));
        Gm.statusGame.setForeground(new Color(244,241,134));
        Gm.btnAtkP2.setBackground(new Color(244,241,134));
        Gm.btnHealP2.setBackground(new Color(244,241,134));
        Gm.btnPoisonP2.setBackground(new Color(244,241,134));
        Gm.continueP2.setBackground(new Color(244,241,134));
        Gm.statusGame.setText("Player 2 Turn");
        addComponent(0,4,5,Gm.btnAtkP2, Gm.gameMultiPanel);
        addComponent(0,5,5,Gm.btnHealP2, Gm.gameMultiPanel);
        addComponent(0,6,5,Gm.btnPoisonP2, Gm.gameMultiPanel);
        addComponent(0,7,5,Gm.settings, Gm.gameMultiPanel);
    }

    public void removeP1Btn(){
        removeBtn(Gm.btnAtkP1);
        removeBtn(Gm.btnHealP1);
        removeBtn(Gm.btnPoisonP1);
        removeSettingsBtn();
    }

    public void removeP2Btn(){
        removeBtn(Gm.btnAtkP2);
        removeBtn(Gm.btnHealP2);
        removeBtn(Gm.btnPoisonP2);
        removeSettingsBtn();
    }

    public void removeSettingsBtn(){
        removeBtn(Gm.settings);
    }
    ///WON CONDITION

}
