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

    //BOOLEAN
    public boolean isHpLow = false;
    public boolean isHpMed = false;
    public boolean isHpHigh = false;
    public boolean isHpCrazy = false;

    public boolean isAtkLow = false;
    public boolean isAtkMed = false;
    public boolean isAtkHigh = false;
    public boolean isAtkCrazy = false;
    public boolean P1Turn = false;
    public boolean P2Turn = false;

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
        Winner();
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

    public void Winner(){
        switchPanelColor(winner.winPanel);
        switchLabelColor(winner.congrats);
        switchLabelColor(winner.won);
        switchBtnColor(winner.newGameBtn);
        switchBtnColor(winner.menuBtn);
    }
    //END SWITCH THEME//

    ///COLOR FOR GAME SET MUTLI SWITCH

    public void checkModeGSM_HP(){

        if(dark && isHpLow){
            Gsm.setHpLowBtn.setBackground(new Color(46,139,87));
            Gsm.setHpMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpCrazyBtn.setBackground(Color.LIGHT_GRAY);
            System.out.println(false);
        }
        if(dark && isHpMed){
            Gsm.setHpLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpMedBtn.setBackground(new Color(46,139,87));
            Gsm.setHpHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && isHpHigh){
            Gsm.setHpLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpHighBtn.setBackground(new Color(46,139,87));
            Gsm.setHpCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && isHpCrazy){
            Gsm.setHpLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpCrazyBtn.setBackground(new Color(46,139,87));
        }
        if(light && isHpLow){
            Gsm.setHpLowBtn.setBackground(new Color(46,139,87));
            Gsm.setHpMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && isHpMed){
            Gsm.setHpLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpMedBtn.setBackground(new Color(46,139,87));
            Gsm.setHpHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && isHpHigh){
            Gsm.setHpLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpHighBtn.setBackground(new Color(46,139,87));
            Gsm.setHpCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && isHpCrazy){
            Gsm.setHpLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpCrazyBtn.setBackground(new Color(46,139,87));
        }

    }
    public void checkModeGSM_ATK(){
        if(dark && isAtkLow){
            Gsm.setAtkLowBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && isAtkMed){
            Gsm.setAtkLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkMedBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && isAtkHigh){
            Gsm.setAtkLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkHighBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }
        if(dark && isAtkCrazy){
            Gsm.setAtkLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(new Color(210,4,45));
        }
        if(light && isAtkLow){
            Gsm.setAtkLowBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && isAtkMed){
            Gsm.setAtkLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkMedBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && isAtkHigh){
            Gsm.setAtkLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkHighBtn.setBackground(new Color(210,4,45));
            Gsm.setAtkCrazyBtn.setBackground(Color.DARK_GRAY);
        }
        if(light && isAtkCrazy){
            Gsm.setAtkLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(new Color(210,4,45));
        }

    }

    ///COLOR FOR GAME MULTI
    public void rollDiceCheckMode(){
        if(dark){
            Gm.labelPlayer1.setForeground(Color.WHITE);
            Gm.hpPlayer1.setForeground(Color.WHITE);
            Gm.atkPlayer1R.setForeground(Color.WHITE);
            Gm.labelPlayer2.setForeground(Color.WHITE);
            Gm.hpPlayer2.setForeground(Color.WHITE);
            Gm.atkPlayer1R.setForeground(Color.WHITE);

            Gm.statusGame.setForeground(Color.WHITE);
        }
        if(light){
            Gm.labelPlayer1.setForeground(Color.black);
            Gm.hpPlayer1.setForeground(Color.black);
            Gm.atkPlayer1R.setForeground(Color.black);
            Gm.labelPlayer2.setForeground(Color.black);
            Gm.hpPlayer2.setForeground(Color.black);
            Gm.atkPlayer1R.setForeground(Color.black);

            Gm.statusGame.setForeground(Color.BLACK);
        }
    }

    public void P1TurnCheckMode(){
        if(dark){
            Gm.labelPlayer2.setForeground(Color.WHITE);
            Gm.hpPlayer2.setForeground(Color.WHITE);
            Gm.atkPlayer2R.setForeground(Color.WHITE);
        }
        if(light){
            Gm.labelPlayer2.setForeground(Color.black);
            Gm.hpPlayer2.setForeground(Color.BLACK);
            Gm.atkPlayer2R.setForeground(Color.BLACK);
        }
    }
    public void P2TurnCheckMode(){
        if(dark){
            Gm.labelPlayer1.setForeground(Color.WHITE);
            Gm.hpPlayer1.setForeground(Color.WHITE);
            Gm.atkPlayer1R.setForeground(Color.WHITE);
        }
        if(light){
            Gm.labelPlayer1.setForeground(Color.BLACK);
            Gm.hpPlayer1.setForeground(Color.BLACK);
            Gm.atkPlayer1R.setForeground(Color.BLACK);
        }
    }
    //ACTIONS FOR GAME
    public void rollDice(){
        constr.fill = GridBagConstraints.HORIZONTAL ;
        constr.insets = new Insets(10,10,10,10);
        rollDiceCheckMode();
        if(dark){
            Gm.statusGame.setForeground(Color.WHITE);
        }
        if(light){
            Gm.statusGame.setForeground(Color.BLACK);
        }
        Gm.statusGame.setText("Waiting for the roll...");
        addComponent(0,4,5,Gm.rollBtn,Gm.gameMultiPanel);
        addComponent(0,5,5,Gm.settings, Gm.gameMultiPanel);
    }

    public void P1Action(){
        constr.fill = GridBagConstraints.HORIZONTAL ;
        constr.insets = new Insets(10,10,10,10);
        P1TurnCheckMode();
        if(dark){
            Gm.labelPlayer1.setForeground(Color.CYAN);
            Gm.hpPlayer1.setForeground(Color.CYAN);
            Gm.atkPlayer1R.setForeground(Color.CYAN);
            Gm.statusGame.setForeground(Color.CYAN);
            Gm.btnAtkP1.setBackground(Color.CYAN);
            Gm.btnHealP1.setBackground(Color.CYAN);
            Gm.btnPoisonP1.setBackground(Color.CYAN);
            Gm.continueP1.setBackground(Color.CYAN);
            Gm.statusGame.setForeground(Color.CYAN);
        }
        if(light){
            Gm.labelPlayer1.setForeground(Color.BLUE);
            Gm.hpPlayer1.setForeground(Color.BLUE);
            Gm.atkPlayer1R.setForeground(Color.BLUE);
            Gm.statusGame.setForeground(Color.BLUE);
            Gm.btnAtkP1.setBackground(Color.BLUE);
            Gm.btnHealP1.setBackground(Color.BLUE);
            Gm.btnPoisonP1.setBackground(Color.BLUE);
            Gm.continueP1.setBackground(Color.BLUE);
        }
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
        if(dark){
            Gm.labelPlayer2.setForeground(Color.YELLOW);
            Gm.hpPlayer2.setForeground(Color.YELLOW);
            Gm.atkPlayer2R.setForeground(Color.YELLOW);
            Gm.statusGame.setForeground(Color.YELLOW);
            Gm.btnAtkP2.setBackground(Color.YELLOW);
            Gm.btnHealP2.setBackground(Color.YELLOW);
            Gm.btnPoisonP2.setBackground(Color.YELLOW);
            Gm.continueP2.setBackground(Color.YELLOW);
            Gm.statusGame.setBackground(Color.YELLOW);
        }
        if(light){
            Gm.labelPlayer2.setForeground(Color.RED);
            Gm.hpPlayer2.setForeground(Color.RED);
            Gm.atkPlayer2R.setForeground(Color.RED);
            Gm.statusGame.setForeground(Color.RED);
            Gm.btnAtkP2.setBackground(Color.RED);
            Gm.btnHealP2.setBackground(Color.RED);
            Gm.btnPoisonP2.setBackground(Color.RED);
            Gm.continueP2.setBackground(Color.RED);
            Gm.statusGame.setBackground(Color.RED);
        }
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
        removeBtn(Gm.settings);
    }

    public void removeP2Btn() {
        removeBtn(Gm.btnAtkP2);
        removeBtn(Gm.btnHealP2);
        removeBtn(Gm.btnPoisonP2);
        removeBtn(Gm.settings);
    }

    public void resetStat(){
        isHpLow = false;
        isHpMed  = false;
        isHpHigh  = false;
        isHpCrazy  = false;
        isAtkLow = false;
        isAtkMed  = false;
        isAtkHigh  = false;
        isAtkCrazy  = false;

        Gsm.settingHp.setText("HP : ");
        Gsm.settingAtk.setText("Atk : ");

        if(dark) {
            Gsm.setHpLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setHpCrazyBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkLowBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkMedBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkHighBtn.setBackground(Color.LIGHT_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(Color.LIGHT_GRAY);
        }

        if(light) {
            Gsm.setHpLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setHpCrazyBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkLowBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkMedBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkHighBtn.setBackground(Color.DARK_GRAY);
            Gsm.setAtkCrazyBtn.setBackground(Color.DARK_GRAY);
        }

        Gsm.Player1_HP = 0;
        Gsm.Player2_HP = 0;
        Gsm.Player1_ATKR = 0;
        Gsm.Player2_ATKR = 0;
    }
}
