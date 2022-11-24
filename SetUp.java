import Basics.*;
import Basics.Menu;
import Mutliplayer.*;
import Singleplayer.*;

import java.awt.*;

public class SetUp extends Adder {
    //START IMPORT FROM BASICS PACKAGE
    Opening Opening = new Opening();
    Menu Menu = new Menu();
    About About = new About();
    Settings Settings = new Settings();
    //END IMPORT FROM BASICS PACKAGE

    //START IMPORT FROM MULTIPLAYER PACKAGE
    Rules Rules = new Rules();
    GameSettingsMulti Gsm = new GameSettingsMulti();
    GameMulti Gm = new GameMulti();
    MultiGameSettings Mgs = new MultiGameSettings();
    Winner winner = new Winner();
    //END IMPORT FROM MULTIPLAYER PACKAGE

    //START IMPORT FROM SINGLEPLAYER PACKAGE
    GameChoice SpChoice = new GameChoice();
    DuelModeRule DMR = new DuelModeRule();
    DuelModeGameSettings DuelSettings = new DuelModeGameSettings();


    ///START BOOLEANS FOR SWITCHING PAUSES
    boolean multiPaused = false;
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
        GameChoice();
        DuelModeRule();
        DuelModeSettings();
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
        switchLabelColor(Rules.rule4);
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

    public void GameChoice(){
        switchPanelColor(SpChoice.choicePanel);
        switchLabelColor(SpChoice.titleChoice);
        switchBtnColor(SpChoice.storyBtn);
        switchBtnColor(SpChoice.duelBtn);
        switchBtnColor(SpChoice.survivalBtn);
        switchBtnColor(SpChoice.menuBtn);
    }

    public void DuelModeRule(){
        switchPanelColor(DMR.duelRulePanel);
        switchLabelColor(DMR.duelRuleTitle);
        switchLabelColor(DMR.desc1);
        switchLabelColor(DMR.desc2);
        switchLabelColor(DMR.rule1);
        switchLabelColor(DMR.rule2);
        switchLabelColor(DMR.rule3);
        switchLabelColor(DMR.rule4);
        switchBtnColor(DMR.contDMGS);
        switchBtnColor(DMR.backChoice);

    }

    public void DuelModeSettings(){
        switchPanelColor(DuelSettings.duelSettingPanel);
        switchLabelColor(DuelSettings.titleDuelSetting);
        switchLabelColor(DuelSettings.easyLabel);
        switchLabelColor(DuelSettings.normalLabel);
        switchLabelColor(DuelSettings.hardLabel);
        switchLabelColor(DuelSettings.extremeLabel);
        switchBtnColor(DuelSettings.easyButton);
        switchBtnColor(DuelSettings.normalButton);
        switchBtnColor(DuelSettings.hardButton);
        switchBtnColor(DuelSettings.extremeButton);
        switchBtnColor(DuelSettings.startButton);
        switchBtnColor(DuelSettings.backRule);
        switchLabelColor(DuelSettings.underLabel);
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
        addComponent(0,4,7,Gm.rollBtn,Gm.gameMultiPanel);
        addComponent(0,5,7,Gm.settings, Gm.gameMultiPanel);
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
        addComponent(0,4,7,Gm.btnAtkP1, Gm.gameMultiPanel);
        addComponent(0,5,7,Gm.btnHealP1, Gm.gameMultiPanel);
        addComponent(0,6,7,Gm.btnPoisonP1, Gm.gameMultiPanel);
        addComponent(0,7,7,Gm.continueP1,Gm.gameMultiPanel);
        addComponent(0,8,7,Gm.settings, Gm.gameMultiPanel);
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
        addComponent(0,4,7,Gm.btnAtkP2, Gm.gameMultiPanel);
        addComponent(0,5,7,Gm.btnHealP2, Gm.gameMultiPanel);
        addComponent(0,6,7,Gm.btnPoisonP2, Gm.gameMultiPanel);
        addComponent(0,7,7,Gm.continueP2, Gm.gameMultiPanel);
        addComponent(0,8,7,Gm.settings, Gm.gameMultiPanel);
    }

    public void removeP1Btn(){
        removeBtn(Gm.btnAtkP1);
        removeBtn(Gm.btnHealP1);
        removeBtn(Gm.btnPoisonP1);
        removeBtn(Gm.continueP1);
        removeBtn(Gm.settings);
    }

    public void removeP2Btn() {
        removeBtn(Gm.btnAtkP2);
        removeBtn(Gm.btnHealP2);
        removeBtn(Gm.btnPoisonP2);
        removeBtn(Gm.continueP2);
        removeBtn(Gm.settings);
    }

    public void resetStat(){
        Gsm.countPoisP1 = 5;
        Gsm.countPoisP2 = 5;
        Gsm.isHpLow = false;
        Gsm.isHpMed  = false;
        Gsm.isHpHigh  = false;
        Gsm.isHpCrazy  = false;
        Gsm.isAtkLow = false;
        Gsm.isAtkMed  = false;
        Gsm.isAtkHigh  = false;
        Gsm.isAtkCrazy  = false;

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

    ///FOR FUNCTION IN APPSYS
    public void checkSetSound(){
        String txt = Settings.setSound.getText();
        String txt2 = Mgs.setSound.getText();
        if(txt.equals("SOUND : OFF") && txt2.equals("SOUND : OFF")){
            playSound();
            stopSound();
            holdSong();
        } else{
            setSoundEffectFile(btnSound);
            playSound();
            playSong();
            loopSong();
        }
    }

    public void checkSetSoundVer2(){
        String txt = Settings.setSound.getText();
        String txt2 = Mgs.setSound.getText();
        if(txt.equals("SOUND : OFF") && txt2.equals("SOUND : OFF")){
            playSound();
            stopSound();
            holdSong();
        } else{
            setSoundEffectFile(btnSound);
            playSound();
            loopSong();
        }
    }

    public void checkContinueSound(){
        String txt = Settings.setSound.getText();
        String txt2 = Mgs.setSound.getText();
        if(txt.equals("SOUND : OFF") && txt2.equals("SOUND : OFF")){
            playSound();
            stopSound();
            holdSong();
        } else{
            setSoundEffectFile(btnSound);
            playSound();
            playSong();
        }
    }

    public int heal(){
        int Heal = (int) (Math.random() * 80) + 1;
        if(Gsm.isHpLow){
            Heal = (int) (Math.random() * (Gsm.hpLow * 0.1)) + 1;
        } else if(Gsm.isHpMed){
            Heal = (int) (Math.random() * (Gsm.hpMed * 0.1)) + 1;
        } else if(Gsm.isHpHigh){
            Heal = (int) (Math.random() * (Gsm.hpHigh * 0.1)) + 1;
        } else if(Gsm.isHpCrazy){
            Heal = (int) (Math.random() * (Gsm.hpCrazy * 0.1)) + 1;
        }
        return Heal;
    }
    ///BUTTONS IN DUEL MODE
    public void checkDuelMode(){
        DuelSettings.underLabel.setText("");
        if(dark){
            DuelSettings.easyButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.normalButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.hardButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.extremeButton.setBackground(Color.LIGHT_GRAY);

        }
        if(dark && DuelSettings.isEasy){
            DuelSettings.easyButton.setBackground(Color.GREEN);
            DuelSettings.normalButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.hardButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.extremeButton.setBackground(Color.LIGHT_GRAY);

            DuelSettings.easyLabel.setForeground(Color.GREEN);

            DuelSettings.easyLabel.setText("KIDS");
            DuelSettings.normalLabel.setText("");
            DuelSettings.hardLabel.setText("");
            DuelSettings.extremeLabel.setText("");
        }
        if(dark && DuelSettings.isNormal){
            DuelSettings.easyButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.normalButton.setBackground(Color.YELLOW);
            DuelSettings.hardButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.extremeButton.setBackground(Color.LIGHT_GRAY);

            DuelSettings.normalLabel.setForeground(Color.YELLOW);

            DuelSettings.easyLabel.setText("");
            DuelSettings.normalLabel.setText("TEENS");
            DuelSettings.hardLabel.setText("");
            DuelSettings.extremeLabel.setText("");
        }
        if(dark && DuelSettings.isHard){
            DuelSettings.easyButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.normalButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.hardButton.setBackground(Color.ORANGE);
            DuelSettings.extremeButton.setBackground(Color.LIGHT_GRAY);

            DuelSettings.hardLabel.setForeground(Color.ORANGE);

            DuelSettings.easyLabel.setText("");
            DuelSettings.normalLabel.setText("");
            DuelSettings.hardLabel.setText("ADULTS");
            DuelSettings.extremeLabel.setText("");
        }
        if(dark && DuelSettings.isExtreme){
            DuelSettings.easyButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.normalButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.hardButton.setBackground(Color.LIGHT_GRAY);
            DuelSettings.extremeButton.setBackground(Color.RED);

            DuelSettings.extremeLabel.setForeground(Color.RED);

            DuelSettings.easyLabel.setText("");
            DuelSettings.normalLabel.setText("");
            DuelSettings.hardLabel.setText("");
            DuelSettings.extremeLabel.setText("CHADS");
        }
        if(light){
            DuelSettings.easyButton.setBackground(Color.DARK_GRAY);
            DuelSettings.normalButton.setBackground(Color.DARK_GRAY);
            DuelSettings.hardButton.setBackground(Color.DARK_GRAY);
            DuelSettings.extremeButton.setBackground(Color.DARK_GRAY);

        }
        if(light && DuelSettings.isEasy){
            DuelSettings.easyButton.setBackground(Color.GREEN);
            DuelSettings.normalButton.setBackground(Color.DARK_GRAY);
            DuelSettings.hardButton.setBackground(Color.DARK_GRAY);
            DuelSettings.extremeButton.setBackground(Color.DARK_GRAY);

            DuelSettings.easyLabel.setForeground(Color.GREEN);

            DuelSettings.easyLabel.setText("KIDS");
            DuelSettings.normalLabel.setText("");
            DuelSettings.hardLabel.setText("");
            DuelSettings.extremeLabel.setText("");
        }
        if(light &&DuelSettings.isNormal){
            DuelSettings.easyButton.setBackground(Color.DARK_GRAY);
            DuelSettings.normalButton.setBackground(Color.YELLOW);
            DuelSettings.hardButton.setBackground(Color.DARK_GRAY);
            DuelSettings.extremeLabel.setBackground(Color.DARK_GRAY);

            DuelSettings.normalLabel.setForeground(Color.YELLOW);

            DuelSettings.easyLabel.setText("");
            DuelSettings.normalLabel.setText("TEENS");
            DuelSettings.hardLabel.setText("");
            DuelSettings.extremeLabel.setText("");
        }
        if(light && DuelSettings.isHard){
            DuelSettings.easyButton.setBackground(Color.DARK_GRAY);
            DuelSettings.normalButton.setBackground(Color.DARK_GRAY);
            DuelSettings.hardButton.setBackground(Color.ORANGE);
            DuelSettings.extremeLabel.setBackground(Color.DARK_GRAY);

            DuelSettings.hardLabel.setForeground(Color.ORANGE);

            DuelSettings.easyLabel.setText("");
            DuelSettings.normalLabel.setText("");
            DuelSettings.hardLabel.setText("ADULTS");
            DuelSettings.extremeLabel.setText("");
        }
        if(light && DuelSettings.isExtreme){
            DuelSettings.easyButton.setBackground(Color.DARK_GRAY);
            DuelSettings.normalButton.setBackground(Color.DARK_GRAY);
            DuelSettings.hardButton.setBackground(Color.DARK_GRAY);
            DuelSettings.extremeLabel.setBackground(Color.RED);

            DuelSettings.extremeLabel.setForeground(Color.RED);

            DuelSettings.easyLabel.setText("");
            DuelSettings.normalLabel.setText("");
            DuelSettings.hardLabel.setText("");
            DuelSettings.extremeLabel.setText("CHADS");
        }

    }
}
