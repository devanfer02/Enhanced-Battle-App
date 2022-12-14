import Basics.*;
import Basics.Menu;
import Mutliplayer.*;
import Singleplayer.*;

import java.awt.*;
import javax.swing.*;

class SetUp extends Adder {
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
    DuelGame DuelGame = new DuelGame();
    DuelResult DuelResult = new DuelResult();

    StoryMode StoryMode = new StoryMode();
    StoryBattle StoryBattle = new StoryBattle();
    ///START BOOLEANS FOR SWITCHING PAUSES
    boolean multiPaused = false;
    boolean duelPaused = false;
    boolean storyPaused = false;
    boolean storyBattlePause = false;
    boolean enemyWin = false;
    boolean playerTurn = false;
    boolean playerWin = false;
    boolean playerSurender= false;

    ///ARRAY STORING DATA FOR JBUTTON AND MORE
    JButton[] multiHPbutton = {Gsm.setHpLowBtn,Gsm.setHpMedBtn,Gsm.setHpHighBtn,Gsm.setHpCrazyBtn};
    boolean[] multiHpCheck = {Gsm.isHpLow, Gsm.isHpMed,Gsm.isHpHigh, Gsm.isHpCrazy};
    int[] multiHPset = {Gsm.hpLow, Gsm.hpMed, Gsm.hpHigh, Gsm.hpCrazy};
    JButton[] multiAtkbutton = {Gsm.setAtkLowBtn,Gsm.setAtkMedBtn,Gsm.setAtkHighBtn,Gsm.setAtkCrazyBtn};
    boolean[] multiAtkCheck = {Gsm.isAtkLow, Gsm.isAtkMed,Gsm.isAtkHigh, Gsm.isAtkCrazy};

    String enemyStatus = "";
    //START SWITCH THEME//
    void switchMode(){
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
        DuelGame();
        DuelResult();
        StoryMode();
        StoryBattle();
    }
    void Opening(){
        switchPanelColor(Opening.openingPanel);
        switchLabelColor(Opening.titleGame);
        switchBtnColor(Opening.continueToMenu);
        switchBtnColor(Opening.exitGame);
    }
    void Menu(){
        switchPanelColor(Menu.menuPanel);
        switchLabelColor(Menu.titleMenu);
        switchBtnColor(Menu.singleBtn);
        switchBtnColor(Menu.multiBtn);
        switchBtnColor(Menu.aboutBtn);
        switchBtnColor(Menu.settingsBtn);
        switchBtnColor(Menu.exitBtn);
    }

    void About(){
        switchPanelColor(About.aboutPanel);
        switchLabelColor(About.titleMenu);
        switchLabelColor(About.paragraph1);
        switchLabelColor(About.paragraph2);
        switchLabelColor(About.paragraph3);
        switchBtnColor(About.backMainBtn);
    }

    void Settings(){
        switchPanelColor(Settings.settingsPanel);
        switchLabelColor(Settings.titleSettings);
        switchBtnColor(Settings.setColor);
        switchBtnColor(Settings.setSound);
        switchLabelColor(Settings.setSong);
        switchBtnColor(Settings.backMenu);
        switchBtnColor(Settings.nextSong);
        switchBtnColor(Settings.prevSong);
    }

    void Rules(){
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

    void GameSetMulti(){
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

    void GameMulti(){
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

    void MultiGameSettings(){
        switchPanelColor(Mgs.pauseSettingPanel);
        switchLabelColor(Mgs.titleSettings);
        switchBtnColor(Mgs.continueToGame);
        switchBtnColor(Mgs.setColor);
        switchBtnColor(Mgs.setSound);
        switchBtnColor(Mgs.setSong);
        switchBtnColor(Mgs.backMenu);
    }

    void Winner(){
        switchPanelColor(winner.winPanel);
        switchLabelColor(winner.congrats);
        switchLabelColor(winner.won);
        switchBtnColor(winner.newGameBtn);
        switchBtnColor(winner.menuBtn);
    }

    void GameChoice(){
        switchPanelColor(SpChoice.choicePanel);
        switchLabelColor(SpChoice.titleChoice);
        switchBtnColor(SpChoice.storyBtn);
        switchBtnColor(SpChoice.duelBtn);
        switchBtnColor(SpChoice.survivalBtn);
        switchBtnColor(SpChoice.menuBtn);
    }

    void DuelModeRule(){
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

    void DuelModeSettings(){
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

    void DuelGame(){
        switchPanelColor(DuelGame.duelGamePanel);
        switchLabelColor(DuelGame.Player);
        switchLabelColor(DuelGame.PlayerHP);
        switchLabelColor(DuelGame.PlayerAtk);
        switchLabelColor(DuelGame.Enemy);
        switchLabelColor(DuelGame.EnemyHP);
        switchLabelColor(DuelGame.EnemyAtk);
        switchLabelColor(DuelGame.duelStatus1);
        switchLabelColor(DuelGame.duelStatus2);
        switchBtnColor(DuelGame.rollDuel);
        switchBtnColor(DuelGame.attackBtn);
        switchBtnColor(DuelGame.healBtn);
        switchBtnColor(DuelGame.poisonBtn);
        switchBtnColor(DuelGame.surrenderBtn);
        switchBtnColor(DuelGame.settingsDuel);
    }

    void DuelResult(){
        switchPanelColor(DuelResult.duelResultPanel);
        switchLabelColor(DuelResult.topTitle);
        switchLabelColor(DuelResult.duelResultTitle);
        switchBtnColor(DuelResult.newGame);
        switchBtnColor(DuelResult.backMenu);
    }

    void StoryMode(){
        switchPanelColor(StoryMode.storyPanel);
        switchLabelColor(StoryMode.storyWelcomeTitle);
        switchBtnColor(StoryMode.startStory);
        switchBtnColor(StoryMode.backToChoice);

        switchLabelColor(StoryMode.desc1);
        switchLabelColor(StoryMode.desc2);
        switchLabelColor(StoryMode.desc3);
        switchLabelColor(StoryMode.desc4);
        switchLabelColor(StoryMode.desc5);

        switchBtnColor(StoryMode.choice1);
        switchBtnColor(StoryMode.choice2);
        switchBtnColor(StoryMode.settings);
    }

    void StoryBattle(){
        switchPanelColor(StoryBattle.storyBtlPanel);
        switchLabelColor(StoryBattle.status1);
        switchLabelColor(StoryBattle.status2);
        switchLabelColor(StoryBattle.player);
        switchLabelColor(StoryBattle.enemy);
        switchLabelColor(StoryBattle.PlayerHP);
        switchLabelColor(StoryBattle.PlayerWpn);
        switchLabelColor(StoryBattle.PlayerAtk);
        switchLabelColor(StoryBattle.EnemyHP);
        switchLabelColor(StoryBattle.EnemyWpn);
        switchLabelColor(StoryBattle.EnemyAtk);
        switchBtnColor(StoryBattle.rollBtn);
        switchBtnColor(StoryBattle.settingsBtl);
    }
    //END SWITCH THEME//

    ///COLOR FOR GAME SET MUTLI SWITCH
    void multiSettingBtnDarkHP(){
        Gsm.setHpLowBtn.setBackground(Color.LIGHT_GRAY);
        Gsm.setHpMedBtn.setBackground(Color.LIGHT_GRAY);
        Gsm.setHpHighBtn.setBackground(Color.LIGHT_GRAY);
        Gsm.setHpCrazyBtn.setBackground(Color.LIGHT_GRAY);
    }

    void multiSettingBtnLightHP(){
        Gsm.setHpLowBtn.setBackground(Color.DARK_GRAY);
        Gsm.setHpMedBtn.setBackground(Color.DARK_GRAY);
        Gsm.setHpHighBtn.setBackground(Color.DARK_GRAY);
        Gsm.setHpCrazyBtn.setBackground(Color.DARK_GRAY);
    }

    void multiSettingBtnDarkAtk(){
        Gsm.setAtkLowBtn.setBackground(Color.LIGHT_GRAY);
        Gsm.setAtkMedBtn.setBackground(Color.LIGHT_GRAY);
        Gsm.setAtkHighBtn.setBackground(Color.LIGHT_GRAY);
        Gsm.setAtkCrazyBtn.setBackground(Color.LIGHT_GRAY);
    }

    void multiSettingBtnLightAtk(){
        Gsm.setAtkLowBtn.setBackground(Color.DARK_GRAY);
        Gsm.setAtkMedBtn.setBackground(Color.DARK_GRAY);
        Gsm.setAtkHighBtn.setBackground(Color.DARK_GRAY);
        Gsm.setAtkCrazyBtn.setBackground(Color.DARK_GRAY);
    }

    void setAllMultiHpFalse(){
        for(int i = 0; i < 4; i++){
            multiHpCheck[i] = false;
        }
    }

    void setAllMultiAtkFalse(){
        for(int i = 0; i < 4; i++){
            multiAtkCheck[i] = false;
        }
    }

    void checkModeGSM_HP(){
        for(int i = 0; i < 4; i++){
            if(dark && multiHpCheck[i]){
                multiSettingBtnDarkHP();
                multiHPbutton[i].setBackground(new Color(46,139,87));
            } else if(light && multiHpCheck[i]){
                multiSettingBtnLightHP();
                multiHPbutton[i].setBackground(new Color(46,139,87));
            }
        }


    }
    void checkModeGSM_ATK(){
        for(int i = 0; i < 4; i++){
            if(dark && multiAtkCheck[i]){
                multiSettingBtnDarkAtk();
                multiAtkbutton[i].setBackground(new Color(210,4,45));
            } else if(light && multiAtkCheck[i]){
                multiSettingBtnLightAtk();
                multiAtkbutton[i].setBackground(new Color(210,4,45));
            }
        }
    }

    ///COLOR FOR GAME MULTI
    void rollDiceCheckMode(){
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

    void P1TurnCheckMode(){
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
    void P2TurnCheckMode(){
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
    void rollDice(){
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

    void P1Action(){
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

    void P2Action(){
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

    void removeP1Btn(){
        removeBtn(Gm.btnAtkP1);
        removeBtn(Gm.btnHealP1);
        removeBtn(Gm.btnPoisonP1);
        removeBtn(Gm.continueP1);
        removeBtn(Gm.settings);
    }

    void removeP2Btn() {
        removeBtn(Gm.btnAtkP2);
        removeBtn(Gm.btnHealP2);
        removeBtn(Gm.btnPoisonP2);
        removeBtn(Gm.continueP2);
        removeBtn(Gm.settings);
    }

    void resetStat(){
        Gsm.countPoisP1 = 5;
        Gsm.countPoisP2 = 5;
        for(int i = 0; i < 4; i++){
            multiHpCheck[i] = false;
            multiAtkCheck[i] = false;
        }

        Gsm.settingHp.setText("HP : ");
        Gsm.settingAtk.setText("Atk : ");

        if(dark) {
            multiSettingBtnDarkHP();
            multiSettingBtnDarkAtk();
        }
        if(light) {
            multiSettingBtnLightHP();
            multiSettingBtnLightAtk();
        }

        playerSurender = false;
        playerWin = false;
        enemyWin = false;
        Gsm.Player1_HP = 0;
        Gsm.Player2_HP = 0;
        Gsm.Player1_ATKR = 0;
        Gsm.Player2_ATKR = 0;
    }

    ///FOR FUNCTION IN APPSYS
    void checkSetSound(){
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

    void checkSetSoundVer2(){
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

    int heal(){
        int Heal = (int) (Math.random() * 80) + 1;
        for(int i = 0; i < 4; i++){
            if(multiHpCheck[i]){
                Heal = (int) (Math.random() * (multiHPset[i] * 0.1)) + 1;
            }
        }
        return Heal;
    }
    ///BUTTONS IN DUEL MODE
    void duelCheckSettingBtnDark(){
        DuelSettings.easyButton.setBackground(Color.LIGHT_GRAY);
        DuelSettings.normalButton.setBackground(Color.LIGHT_GRAY);
        DuelSettings.hardButton.setBackground(Color.LIGHT_GRAY);
        DuelSettings.extremeButton.setBackground(Color.LIGHT_GRAY);
    }

    void duelCheckSettingBtnLight(){
        DuelSettings.easyButton.setBackground(Color.DARK_GRAY);
        DuelSettings.normalButton.setBackground(Color.DARK_GRAY);
        DuelSettings.hardButton.setBackground(Color.DARK_GRAY);
        DuelSettings.extremeButton.setBackground(Color.DARK_GRAY);
    }

    void setDuelSettingText(){
        DuelSettings.easyLabel.setText("");
        DuelSettings.normalLabel.setText("");
        DuelSettings.hardLabel.setText("");
        DuelSettings.extremeLabel.setText("");
    }

    void checkDuelMode(){
        DuelSettings.underLabel.setText("");
        if(dark){
            duelCheckSettingBtnDark();

        }
        if(dark && DuelSettings.isEasy){
            duelCheckSettingBtnDark();
            DuelSettings.easyButton.setBackground(Color.GREEN);

            DuelSettings.easyLabel.setForeground(Color.GREEN);
            setDuelSettingText();
            DuelSettings.easyLabel.setText("KIDS");
        }
        if(dark && DuelSettings.isNormal){
            duelCheckSettingBtnDark();
            DuelSettings.normalButton.setBackground(Color.YELLOW);

            DuelSettings.normalLabel.setForeground(Color.YELLOW);

            setDuelSettingText();
            DuelSettings.normalLabel.setText("TEENS");
        }
        if(dark && DuelSettings.isHard){
            duelCheckSettingBtnDark();
            DuelSettings.hardButton.setBackground(Color.ORANGE);

            DuelSettings.hardLabel.setForeground(Color.ORANGE);

            setDuelSettingText();
            DuelSettings.hardLabel.setText("ADULTS");
        }
        if(dark && DuelSettings.isExtreme){
            duelCheckSettingBtnDark();
            DuelSettings.extremeButton.setBackground(Color.RED);

            DuelSettings.extremeLabel.setForeground(Color.RED);

            setDuelSettingText();
            DuelSettings.extremeLabel.setText("CHADS");
        }
        if(light){
            duelCheckSettingBtnLight();
        }
        if(light && DuelSettings.isEasy){
            duelCheckSettingBtnLight();
            DuelSettings.easyButton.setBackground(Color.GREEN);

            DuelSettings.easyLabel.setForeground(Color.GREEN);
            setDuelSettingText();
            DuelSettings.easyLabel.setText("KIDS");
        }
        if(light &&DuelSettings.isNormal){
            duelCheckSettingBtnLight();
            DuelSettings.normalButton.setBackground(Color.YELLOW);

            DuelSettings.normalLabel.setForeground(Color.YELLOW);

            setDuelSettingText();
            DuelSettings.normalLabel.setText("TEENS");
        }
        if(light && DuelSettings.isHard){
            duelCheckSettingBtnLight();
            DuelSettings.hardButton.setBackground(Color.ORANGE);

            DuelSettings.hardLabel.setForeground(Color.ORANGE);

            setDuelSettingText();
            DuelSettings.hardLabel.setText("ADULTS");
        }
        if(light && DuelSettings.isExtreme){
            duelCheckSettingBtnLight();
            DuelSettings.extremeButton.setBackground(Color.RED);

            DuelSettings.extremeLabel.setForeground(Color.RED);

            setDuelSettingText();
            DuelSettings.extremeLabel.setText("CHADS");
        }
    }
    ///METHODS FOR MULTIPLAYER ACTION




    ///STARTT ACTIONS FOR DUEL GAME
    void duelRollButtons(){
        constr.fill = GridBagConstraints.HORIZONTAL ;
        constr.insets = new Insets(10,10,10,10);
        addComponent(0,5,6,DuelGame.rollDuel,DuelGame.duelGamePanel);
        addComponent(0,6,6,DuelGame.settingsDuel,DuelGame.duelGamePanel);
    }
    void duelRollTurn(){
        int turn = (int)(Math.random() * 11) + 1;
        if(turn % 2 == 0){
            playerAction();
            playerTurn = true;
        } else{
            enemyAction();
        }
    }


    void playerAction(){
        constr.fill = GridBagConstraints.HORIZONTAL ;
        constr.insets = new Insets(10,10,10,10);
        removeRollDuel();
        DuelGame.duelStatus1.setText("ITS YOUR TURN");
        DuelGame.duelStatus2.setText("CHOOSE ACTION");

        addComponent(0,5,6,DuelGame.attackBtn,DuelGame.duelGamePanel);
        addComponent(0,6,6,DuelGame.healBtn,DuelGame.duelGamePanel);
        addComponent(0,7,6,DuelGame.poisonBtn,DuelGame.duelGamePanel);
        addComponent(0,8,6,DuelGame.surrenderBtn, DuelGame.duelGamePanel);
        addComponent(0,9,6,DuelGame.settingsDuel,DuelGame.duelGamePanel);
    }

    void removePlayerAction(){
        removeBtn(DuelGame.attackBtn);
        removeBtn(DuelGame.healBtn);
        removeBtn(DuelGame.poisonBtn);
        removeBtn(DuelGame.surrenderBtn);
        removeBtn(DuelGame.settingsDuel);
    }

    void removeRollDuel(){
        removeBtn(DuelGame.rollDuel);
        removeBtn(DuelGame.settingsDuel);
    }
    //ENEMY ACTION
    void enemyAction(){
        int move = (int)(Math.random() * 100) + 1;
        int ultimate;
        int atk;
        int criticalHit;
        int poison;
        //CRITICAL HIT
        if(DuelSettings.isExtreme && move % 25 == 0){
            enemyStatus = "ultimate";
            ultimate = DuelSettings.enemyAtk + 70;
            DuelSettings.playerHp -= ultimate;
            DuelSettings.playerAtk -= ultimate * 0.05;
            DuelGame.duelStatus1.setText("ENEMY USED ULTIMATE!");
            DuelGame.duelStatus2.setText("DAMAGE : " + ultimate);
            updateStatusDuel();
            enemyDuelResult();

        }
        else if(DuelSettings.isHard && move % 30 == 0){
            enemyStatus = "ultimate";
            ultimate = DuelSettings.enemyAtk + 50;
            DuelSettings.playerHp -= ultimate;
            DuelSettings.playerAtk -= ultimate * 0.04;
            DuelGame.duelStatus1.setText("ENEMY USED ULTIMATE!");
            DuelGame.duelStatus2.setText("DAMAGE : " + ultimate);
            updateStatusDuel();
            enemyDuelResult();
        }
        else if(DuelSettings.isNormal && move % 40 == 0){
            enemyStatus = "ultimate";
            ultimate = DuelSettings.enemyAtk + 30;
            DuelSettings.playerHp -= ultimate;
            DuelSettings.playerAtk -= ultimate * 0.03;
            DuelGame.duelStatus1.setText("ENEMY USED ULTIMATE!");
            DuelGame.duelStatus2.setText("DAMAGE : " + ultimate);
            updateStatusDuel();
            enemyDuelResult();
        }
        else if(DuelSettings.isExtreme && move % 10 == 0){
            enemyStatus = "critical";
            criticalHit = DuelSettings.enemyAtk * 2;
            DuelSettings.playerHp -= criticalHit;
            DuelGame.duelStatus1.setText("ENEMY HIT YOU CRITICALLY!");
            DuelGame.duelStatus2.setText("DAMAGE : " + criticalHit);
            updateStatusDuel();
            enemyDuelResult();
        } else if(DuelSettings.isHard && move % 10 == 0){
            enemyStatus = "critical";
            criticalHit = (int)(DuelSettings.enemyAtk * 1.7);
            DuelSettings.playerHp -= criticalHit;
            DuelGame.duelStatus1.setText("ENEMY HIT YOU CRITICALLY!");
            DuelGame.duelStatus2.setText("DAMAGE : " + criticalHit);
            updateStatusDuel();
            enemyDuelResult();

        } else if(DuelSettings.isNormal && move % 10 == 0){
            enemyStatus = "critical";
            criticalHit = (int)(DuelSettings.enemyAtk * 1.3);
            DuelSettings.playerHp -= criticalHit;
            DuelGame.duelStatus1.setText("ENEMY HIT YOU CRITICALLY!");
            DuelGame.duelStatus2.setText("DAMAGE : " + criticalHit);
            updateStatusDuel();
            enemyDuelResult();

        } else if(DuelSettings.isEasy && move % 10 == 0){
            enemyStatus = "critical";
            criticalHit = (int)(DuelSettings.enemyAtk * 1.1);
            DuelSettings.playerHp -= criticalHit;
            DuelGame.duelStatus1.setText("ENEMY HIT YOU CRITICALLY!");
            DuelGame.duelStatus2.setText("DAMAGE : " + criticalHit);
            updateStatusDuel();
            enemyDuelResult();
        }
        //POISON
        else if(move % 5 == 0){
            enemyStatus = "poison";
            poison = (int)(DuelSettings.enemyAtk * 0.1);
            DuelSettings.playerHp -= poison;
            DuelSettings.playerAtk -= poison;
            if(DuelSettings.playerHp < 1){
                enemyWin = true;
                DuelResult.topTitle.setText("ENEMY POISONED YOU");
                DuelResult.duelResultTitle.setText("YOU LOSE");
            } else{
                DuelGame.duelStatus1.setText("ENEMY POISONED YOU!");
                DuelGame.duelStatus2.setText("DMG TO ATK & HP : " + poison);
                updateStatusDuel();
            }
        }
        //SKIP
        else if(move % 5 == 1){
            enemyStatus = "skip";
            DuelGame.duelStatus1.setText("ENEMY SKIP TURN!");
            DuelGame.duelStatus2.setText("YOUR TURN NOW!");
            playerAction();

        }
        //ATTACK HIT
        else if(move % 2 == 0){
            enemyStatus = "attack";
            atk = (int)(Math.random() * DuelSettings.enemyAtk) + (int)(DuelSettings.enemyAtk * 0.3);
            DuelSettings.playerHp -= atk;
            if(DuelSettings.playerHp < 1){
                DuelResult.topTitle.setText("ENEMY ATTACKED YOU");
                DuelResult.duelResultTitle.setText("YOU LOSE");
                enemyWin = true;
            } else{
                DuelGame.duelStatus1.setText("ENEMY ATTACKED YOU!");
                DuelGame.duelStatus2.setText("DAMAGE DONE : " + atk);
                updateStatusDuel();
            }
        }
        //HEAL
        else if(move % 2 == 1){
            enemyStatus = "heal";
            int heal = 0;
            if(DuelSettings.isEasy) {
                heal = (int)(Math.random() * 10) + 5;
                DuelSettings.enemyHp += heal;
                if(DuelSettings.enemyHp > 100) DuelSettings.enemyHp = 100;
            }
            else if(DuelSettings.isNormal) {
                heal = (int)(Math.random() * 25) + 7;
                DuelSettings.enemyHp += heal;
                if(DuelSettings.enemyHp > 150) DuelSettings.enemyHp = 150;
            }
            else if(DuelSettings.isHard) {
                heal = (int)(Math.random() * 45) + 10;
                DuelSettings.enemyHp += heal;
                if(DuelSettings.enemyHp > 220) DuelSettings.enemyHp = 220;
            }
            else if(DuelSettings.isExtreme) {
                heal = (int)(Math.random() * 65) + 15;
                DuelSettings.enemyHp += heal;
                if(DuelSettings.enemyHp > 420) DuelSettings.enemyHp = 420;
            }
            DuelGame.duelStatus1.setText("ENEMY USE HEAL!");
            DuelGame.duelStatus2.setText("HP RECOVERED : " + heal);
            updateStatusDuel();
        }
    }

    void resetDuelSettings(){
        enemyWin = false;
        DuelSettings.isEasy = false;
        DuelSettings.isNormal = false;
        DuelSettings.isHard = false;
        DuelSettings.isExtreme = false;
        DuelSettings.easyLabel.setText("");
        DuelSettings.normalLabel.setText("");
        DuelSettings.hardLabel.setText("");
        DuelSettings.extremeLabel.setText("");
        DuelSettings.titleDuelSetting.setText("GAME SETTINGS");
        DuelSettings.underLabel.setText("SELECT MODE");
        DuelGame.duelStatus1.setText("GAME STARTED");
        DuelGame.duelStatus2.setText("WAITING FOR THE ROLL...");
        DuelSettings.poisonCount = 5;

        DuelSettings.playerHp = 120;
        DuelSettings.playerAtk = 20;
        checkDuelMode();
    }

    void updateStatusDuel(){
        DuelGame.PlayerHP.setText("HITPOINT :" + DuelSettings.playerHp);
        DuelGame.PlayerAtk.setText("ATK RANGE :" + DuelSettings.playerAtk);
        DuelGame.EnemyHP.setText("HITPOINT :" + DuelSettings.enemyHp);
        DuelGame.EnemyAtk.setText("HITPOINT :" + DuelSettings.enemyAtk);
    }

    void enemyDuelResult(){
        switch(enemyStatus){
            case "ultimate":
                if(DuelSettings.playerHp < 1){
                    enemyWin = true;
                    DuelResult.topTitle.setText("ENEMY USED ULTIMATE");
                    DuelResult.duelResultTitle.setText("YOU LOSE");
                }
                break;
            case "critical":
                if(DuelSettings.playerHp < 1){
                    enemyWin = true;
                    DuelResult.topTitle.setText("ENEMY HIT CRITICALLY");
                    DuelResult.duelResultTitle.setText("YOU LOSE");
                }
                break;
        }
    }

    void setColorResult(){
        if(DuelSettings.isExtreme){
            DuelResult.duelResultTitle.setForeground(Color.RED);
        } else if(DuelSettings.isHard){
            DuelResult.duelResultTitle.setForeground(Color.ORANGE);
        } else if(DuelSettings.isNormal){
            DuelResult.duelResultTitle.setForeground(Color.YELLOW);
        } else if(DuelSettings.isEasy){
            DuelResult.duelResultTitle.setForeground(Color.GREEN);
        }
    }
}
