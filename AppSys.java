import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AppSys extends SetUp{
    //START SETTING CLASSES FOR ACTION PERFORMED AKA BUTTONS
    ///START OPENING MENU AND SETTINGS
    continueBtn continueBtn = new continueBtn();
    exitBtn exitBtn = new exitBtn();
    aboutBtn aboutBtn = new aboutBtn();
    backMenu backMenu = new backMenu();
    settingBtn settingBtn = new settingBtn();
    setColorSettingsBtn setColorBtn = new setColorSettingsBtn();
    setSoundSettingsBtn setSoundBtn = new setSoundSettingsBtn();
    gameChoiceBtn gameChoiceBtn = new gameChoiceBtn();
    ruleBtn ruleBtn = new ruleBtn();
    contGameSetMulti contGameSetMulti = new contGameSetMulti();
    backToRuleBtn backToRuleBtn = new backToRuleBtn();
    changeSong changeSong = new changeSong();
    ///END OPENING MENU AND SETTINGS

    ///START MULTIPLAYER MODE BUTTONS
    playerlowhp playerlowhp = new playerlowhp();
    playermedhp playermedhp = new playermedhp();
    playerhighhp playerhighhp = new playerhighhp();
    playercrazyhp playercrazyhp = new playercrazyhp();
    playerlowatk playerlowatk = new playerlowatk();
    playermedatk playermedatk = new playermedatk();
    playerhighatk playerhighatk = new playerhighatk();
    playercrazyatk playercrazyatk = new playercrazyatk();
    startGame startMultiGame = new startGame();
    pauseGame pauseGame = new pauseGame();
    rollDice rollDice = new rollDice();
    AttackP1 attackP1 = new AttackP1();
    HealP1 healP1 = new HealP1();
    PoisonP1 poisonP1 = new PoisonP1();
    SkipP1 skipP1 = new SkipP1();
    AttackP2 attackP2 = new AttackP2();
    HealP2 healP2 = new HealP2();
    PoisonP2 poisonP2 = new PoisonP2();
    SkipP2 skipP2 = new SkipP2();
    backMenuWin bmw = new backMenuWin();
    ///END MULTIPLAYER MODE BUTTONS

    ///START SINGLEPLAYER MODE BUTTONS
    //// START DUEL MODE BUTTONS
    startDuelGame startDuelGame = new startDuelGame();
    duelModeRule duelModeRule = new duelModeRule();
    backToChoice backToChoice = new backToChoice();
    duelContSetting duelContSetting = new duelContSetting();
    backToRuleDuel backToRuleDuel = new backToRuleDuel();
    easyDuelMode easyDuelMode = new easyDuelMode();
    normalDuelMode normalDuelMode = new normalDuelMode();
    hardDuelMode hardDuelMode = new hardDuelMode();
    extremeDuelMode extremeDuelMode = new extremeDuelMode();
    //END SETTING CLASSES FOR ACTION PERFORMED AKA BUTTONS
    JFrame frame = new JFrame("BattleApp");

    public void GameApp(){
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(Opening.openingPanel);
        setSoundEffectFile(btnSound);
        setSongFile(song1);
        playSong();
        loopSong();
        frame.setVisible(true);


        //SETTINGS FOR BUTTON
        ///START BUTTONS IN OPENING
        Opening.continueToMenu.addActionListener(continueBtn);
        Opening.exitGame.addActionListener(exitBtn);
        ///END BUTTONS IN OPENING

        ///START BUTTONS IN MENU
        Menu.exitBtn.addActionListener(exitBtn);
        Menu.aboutBtn.addActionListener(aboutBtn);
        Menu.settingsBtn.addActionListener(settingBtn);
        Menu.multiBtn.addActionListener(ruleBtn);
        Menu.singleBtn.addActionListener(gameChoiceBtn);
        ///END BUTTONS IN MENU
        //START BUTTONS IN ABOUT
        About.backMainBtn.addActionListener(backMenu);
        //START BUTTONS IN SETTINGS

        Settings.setColor.addActionListener(setColorBtn);
        Settings.setSound.addActionListener(setSoundBtn);
        Settings.backMenu.addActionListener(backMenu);
        Settings.setSong.addActionListener(changeSong);
        //END BUTTONS IN SETTINGS
        ///START BUTTONS IN RULE MULTI
        Rules.continueTo.addActionListener(contGameSetMulti);
        Rules.backMenu.addActionListener(backMenu);
        /// END BUTTONS IN RULE MULTI
        ///BUTTONS IN GAME SETTINGS MUTLI
        Gsm.setHpLowBtn.addActionListener(playerlowhp);
        Gsm.setHpMedBtn.addActionListener(playermedhp);
        Gsm.setHpHighBtn.addActionListener(playerhighhp);
        Gsm.setHpCrazyBtn.addActionListener(playercrazyhp);
        Gsm.setAtkLowBtn.addActionListener(playerlowatk);
        Gsm.setAtkMedBtn.addActionListener(playermedatk);
        Gsm.setAtkHighBtn.addActionListener(playerhighatk);
        Gsm.setAtkCrazyBtn.addActionListener(playercrazyatk);
        Gsm.backToRule.addActionListener(backToRuleBtn);
        Gsm.startMultiGame.addActionListener(startMultiGame);
        //END BUTTONS IN GAME SETTINGS MULTI

        //START BUTTON IN GAME BATTLE MULTI
        Gm.rollBtn.addActionListener(rollDice);
        Gm.btnAtkP1.addActionListener(attackP1);
        Gm.btnHealP1.addActionListener(healP1);
        Gm.btnPoisonP1.addActionListener(poisonP1);
        Gm.continueP1.addActionListener(skipP1);
        Gm.btnAtkP2.addActionListener(attackP2);
        Gm.btnHealP2.addActionListener(healP2);
        Gm.btnPoisonP2.addActionListener(poisonP2);
        Gm.continueP2.addActionListener(skipP2);
        Gm.settings.addActionListener(pauseGame);
        ///END BUTTON IN GAME BATTLE MULTI

        ///SETTINGS IN GAME BATTLE MULTI
        Mgs.continueToGame.addActionListener(startMultiGame);
        Mgs.setColor.addActionListener(setColorBtn);
        Mgs.setSound.addActionListener(setSoundBtn);
        Mgs.backMenu.addActionListener(backMenu);

        ///BUTTONS IN WIN SCREEN
        winner.newGameBtn.addActionListener(contGameSetMulti);
        winner.menuBtn.addActionListener(bmw);

        ///BUTTONS IN SINGLE PLAYER GAME CHOICE
        SpChoice.menuBtn.addActionListener(backMenu);
        SpChoice.duelBtn.addActionListener(duelModeRule);
        ////BUTTONS IN DUEL MODE
        DMR.backChoice.addActionListener(backToChoice);
        DMR.contDMGS.addActionListener(duelContSetting);

        ////BUTTONS IN DUEL MODE SETTINGS
        DuelSettings.easyButton.addActionListener(easyDuelMode);
        DuelSettings.normalButton.addActionListener(normalDuelMode);
        DuelSettings.hardButton.addActionListener(hardDuelMode);
        DuelSettings.extremeButton.addActionListener(extremeDuelMode);

        DuelSettings.backRule.addActionListener(backToRuleDuel);
        DuelSettings.startButton.addActionListener(startDuelGame);

    }

    //START SETTING PANEL SCREEN

    public void menuScreen(){
        frame.add(Menu.menuPanel);
        frame.setVisible(true);
    }

    public void aboutScreen(){
        frame.add(About.aboutPanel);
        frame.setVisible(true);
    }

    public void settingsScreen(){
        frame.add(Settings.settingsPanel);
        frame.setVisible(true);
    }

    public void ruleScreen(){
        frame.add(Rules.rulePanel);
        frame.setVisible(true);
    }

    public void gameSettingMultiScreen(){
        frame.add(Gsm.gameSetMulti);
        frame.setVisible(true);
    }

    public void gameScreen(){
        frame.add(Gm.gameMultiPanel);
        frame.setVisible(true);
    }

    public void settingGameScreen(){
        frame.add(Mgs.pauseSettingPanel);
        frame.setVisible(true);
    }

    public void gameChoiceScreen(){
        frame.add(SpChoice.choicePanel);
        frame.setVisible(true);
    }

    public void duelModeRuleScreen(){
        DuelSettings.underLabel.setText("SELECT MODE");
        frame.add(DMR.duelRulePanel);
        frame.setVisible(true);
    }

    public void duelModeSettingScreen(){
        frame.add(DuelSettings.duelSettingPanel);
        frame.setVisible(true);
    }

    public void winnerScreen(){

        stopSong();
        setSongFile(WSong);
        resetStat();
        checkModeGSM_HP();
        checkModeGSM_ATK();
        checkSetSound();
        frame.add(winner.winPanel);
        frame.setVisible(true);
    }
    //END SETTING PANEL SCREEN

    //IMPLEMENTING BUTTON ACTION
    ///START MENU BUTTON
    public class continueBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Opening.openingPanel);
            menuScreen();
        }
    }

    public class gameChoiceBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Menu.menuPanel);
            gameChoiceScreen();
        }
    }

    public class ruleBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Menu.menuPanel);
            ruleScreen();
        }
    }

    public class exitBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            System.exit(0);
        }
    }
    public class aboutBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Menu.menuPanel);
            aboutScreen();
        }
    }

    public class duelModeRule implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            playSound();
            removePanel(frame, SpChoice.choicePanel);
            duelModeRuleScreen();
        }
    }

    public class duelContSetting implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            playSound();
            removePanel(frame, DMR.duelRulePanel);
            duelModeSettingScreen();
        }
    }

    public class backToChoice implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            playSound();
            removePanel(frame, DMR.duelRulePanel);
            gameChoiceScreen();
        }
    }

    //END BUTTON FOR MENU PANEL
    public class backMenu implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(multiPaused){
                stopSong();
                setSongFile(song1);
                checkContinueSound();
                removePanel(frame, Mgs.pauseSettingPanel);
                removePanel(frame, Gm.gameMultiPanel);
                resetStat();
                multiPaused = false;
            } else{
                checkSetSoundVer2();
                removePanel(frame, SpChoice.choicePanel);
                removePanel(frame, Settings.settingsPanel);
                removePanel(frame, About.aboutPanel);
                removePanel(frame, Rules.rulePanel);
            }
            menuScreen();
        }
    }

    public class settingBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Menu.menuPanel);
            settingsScreen();
        }
    }

    ///END MENU BUTTON
    public class backMenuWin implements ActionListener{
        public void actionPerformed(ActionEvent e){
            stopSong();
            setSongFile(song1);
            checkSetSound();
            removePanel(frame, winner.winPanel);
            menuScreen();
        }
    }
    ///START BUTTON IN SETTING

    public class setSoundSettingsBtn implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String text = Settings.setSound.getText();
            String text2 = Mgs.setSound.getText();
            switch (text) {
                case "SOUND : ON" -> {
                    playSound();
                    Settings.setSound.setText("SOUND : OFF");
                    Mgs.setSound.setText("SOUND : OFF");
                    holdSong();
                    stopSound();

                }
                case "SOUND : OFF" ->  {
                    setSoundEffectFile(btnSound);
                    playSound();
                    Settings.setSound.setText("SOUND : ON");
                    Mgs.setSound.setText("SOUND : ON");
                    continueSong();
                }
            }
            //JUST FOR MGS SET SOUND
            switch (text2){
                case "SOUND : ON" -> {
                    playSound();
                    Settings.setSound.setText("SOUND : OFF");
                    Mgs.setSound.setText("SOUND : OFF");
                    holdSong();
                    stopSound();
                }
                case "SOUND : OFF" ->  {
                    setSoundEffectFile(btnSound);
                    playSound();
                    Settings.setSound.setText("SOUND : ON");
                    Mgs.setSound.setText("SOUND : ON");
                    continueSong();
                }
            }
        }
    }
    public class setColorSettingsBtn implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            playSound();
            String text = Settings.setColor.getText();
            switch (text) {
                case "MODE : DARK" -> {
                    light = true;
                    dark = false;
                    Settings.setColor.setText("MODE : LIGHT");
                    switchMode();
                }
                case "MODE : LIGHT" -> {
                    light = false;
                    dark = true;
                    Settings.setColor.setText("MODE : DARK");
                    switchMode();
                }
            }
        }

    }

    public class changeSong implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            playSound();
            countArrs++;
            if(countArrs > 11) countArrs = (countArrs % 11) - 1;
            if(countArrs == 1) countArrs += 1;
            stopSong();
            setSongFile(arrSongs[countArrs]);
            checkSetSoundVer2();
        }
    }
    ///END BUTTON IN SETTING

    public class contGameSetMulti implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, winner.winPanel);
            removePanel(frame,Rules.rulePanel);
            gameSettingMultiScreen();
        }
    }
    ////MULTIPLAYER MODE BUTTON CONFIGURATIONS
    public class backToRuleBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Gsm.gameSetMulti);
            ruleScreen();
        }
    }

    public class playerlowhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            Gsm.isHpLow = true;
            Gsm.isHpMed  = false;
            Gsm.isHpHigh  = false;
            Gsm.isHpCrazy  = false;

            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpLow);
            Gsm.Player1_HP = Gsm.hpLow;
            Gsm.Player2_HP = Gsm.hpLow;
            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpLow);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpLow);

        }
    }
    public class playermedhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            Gsm.isHpLow = false;
            Gsm.isHpMed  = true;
            Gsm.isHpHigh  = false;
            Gsm.isHpCrazy  = false;

            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpMed);
            Gsm.Player1_HP = Gsm.hpMed;
            Gsm.Player2_HP = Gsm.hpMed;
            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpMed);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpMed);
        }
    }
    public class playerhighhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            Gsm.isHpLow = false;
            Gsm.isHpMed  = false;
            Gsm.isHpHigh  = true;
            Gsm.isHpCrazy  = false;
            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpHigh);
            Gsm.Player1_HP = Gsm.hpHigh;
            Gsm.Player2_HP = Gsm.hpHigh;
            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpHigh);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpHigh);
        }
    }
    public class playercrazyhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            Gsm.isHpLow = false;
            Gsm.isHpMed  = false;
            Gsm.isHpHigh  = false;
            Gsm.isHpCrazy  = true;
            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpCrazy);
            Gsm.Player1_HP = Gsm.hpCrazy;
            Gsm.Player2_HP = Gsm.hpCrazy;
            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpCrazy);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpCrazy);
        }
    }
    //ATK RANGE
    public class playerlowatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            Gsm.isAtkLow = true;
            Gsm.isAtkMed  = false;
            Gsm.isAtkHigh  = false;
            Gsm.isAtkCrazy  = false;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkLow);
            Gsm.Player1_ATKR = Gsm.atkLow;
            Gsm.Player2_ATKR = Gsm.atkLow;
            Gm.atkPlayer1R.setText("Atk Range : " + Gsm.atkLow);
            Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkLow);
        }
    }
    public class playermedatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            Gsm.isAtkLow = false;
            Gsm.isAtkMed  = true;
            Gsm.isAtkHigh  = false;
            Gsm.isAtkCrazy  = false;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkMed);
            Gsm.Player1_ATKR = Gsm.atkMed;
            Gsm.Player2_ATKR = Gsm.atkMed;
            Gm.atkPlayer1R.setText("Atk Range : " + Gsm.atkMed);
            Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkMed);
        }
    }
    public class playerhighatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            Gsm.isAtkLow = false;
            Gsm.isAtkMed  = false;
            Gsm.isAtkHigh  = true;
            Gsm.isAtkCrazy  = false;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkHigh);
            Gsm.Player1_ATKR = Gsm.atkHigh;
            Gsm.Player2_ATKR = Gsm.atkHigh;
            Gm.atkPlayer1R.setText("Atk Range : " + Gsm.atkHigh);
            Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkHigh);
        }
    }
    public class playercrazyatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            Gsm.isAtkLow = false;
            Gsm.isAtkMed  = false;
            Gsm.isAtkHigh  = false;
            Gsm.isAtkCrazy  = true;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkCrazy);
            Gsm.Player1_ATKR = Gsm.atkCrazy;
            Gsm.Player2_ATKR = Gsm.atkCrazy;
            Gm.atkPlayer1R.setText("Atk Range : "+ Gsm.atkCrazy);
            Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkCrazy);
        }
    }

    public class startGame implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if((Gsm.isHpLow || Gsm.isHpMed || Gsm.isHpHigh || Gsm.isHpCrazy)
                    && (Gsm.isAtkLow || Gsm.isAtkMed || Gsm.isAtkHigh || Gsm.isAtkCrazy)){
                Gm.btnPoisonP1.setText("POISON" + "(" + Gsm.countPoisP1 + ")");
                Gm.btnPoisonP2.setText("POISON" + "(" + Gsm.countPoisP2 + ")");

                if(multiPaused){
                    checkSetSoundVer2();
                    multiPaused = false;
                    removePanel(frame, Mgs.pauseSettingPanel);
                    gameScreen();
                } else{
                    stopSong();
                    setSongFile(song2);
                    checkSetSound();
                    removePanel(frame, Gsm.gameSetMulti);
                    gameScreen();
                    if(Gsm.P1Turn){
                        removeP1Btn();
                    }
                    if(Gsm.P2Turn && dark){
                        Gm.atkPlayer2R.setForeground(Color.WHITE);
                        removeP2Btn();
                    } else if(Gsm.P2Turn && light){
                        Gm.atkPlayer2R.setForeground(Color.BLACK);
                    }
                    Gsm.P1Turn = false;
                    Gsm.P2Turn = false;
                    rollDice();
                }
            } else{
                Gsm.settingsMultiTxt.setText("Please select first");
            }
        }
    }

    public class pauseGame implements ActionListener {
        public void actionPerformed(ActionEvent e){
            multiPaused = true;
            playSound();
            removePanel(frame, Gm.gameMultiPanel);
            settingGameScreen();
        }
    }

    ///BUTTON FOR GAME MULTIPLAYER BATTLE
    public class AttackP1 implements ActionListener {

        public void actionPerformed(ActionEvent e){
            int atkR = (int) (Math.random() * Gsm.Player1_ATKR) + 1;
            Gsm.Player2_HP -= atkR;
            if(Gsm.Player2_HP < 1){
                removePanel(frame, Gm.gameMultiPanel);
                winner.won.setText("P1 WON");
                if(dark){
                    winner.won.setForeground(Color.CYAN);
                }
                if(light){
                    winner.won.setForeground(Color.BLUE);
                }
                winnerScreen();
            } else {
                Gsm.P1Turn = false;
                Gsm.P2Turn = false;
                playSound();
                Gm.hpPlayer1.setText("Hitpoint : " + Gsm.Player1_HP);
                Gm.hpPlayer2.setText("Hitpoint : " + Gsm.Player2_HP);

                removeP1Btn();
                rollDice();
            }

        }

    }

    public class HealP1 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            Gsm.P1Turn = false;
            Gsm.P2Turn = false;

            playSound();
            int Heal = heal();
            Gsm.Player1_HP += Heal;

            if(Gsm.isHpLow && Gsm.Player1_HP > Gsm.hpLow){
               Gsm.Player1_HP = Gsm.hpLow;
            } else if(Gsm.isHpMed && Gsm.Player1_HP > Gsm.hpMed){
                Gsm.Player1_HP = Gsm.hpMed;
            } else if(Gsm.isHpHigh && Gsm.Player1_HP > Gsm.hpHigh){
                Gsm.Player1_HP = Gsm.hpHigh;
            } else if(Gsm.isHpCrazy && Gsm.Player1_HP > Gsm.hpCrazy){
                Gsm.Player1_HP = Gsm.hpCrazy;
            }
            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.Player1_HP);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.Player2_HP);

            removeP1Btn();
            rollDice();
        }
    }

    public class PoisonP1 implements ActionListener{
        public void actionPerformed(ActionEvent e){

            Gsm.P1Turn = true;
            int gacha = (int) (Math.random() * 1000) + 1;
            if(gacha == 14 && Gsm.countPoisP1 > 0){
                removePanel(frame, Gm.gameMultiPanel);
                winner.won.setText("P1 WON");
                if(dark){
                    winner.won.setForeground(Color.CYAN);
                }
                if(light){
                    winner.won.setForeground(Color.BLUE);
                }
                winnerScreen();
            } else if(gacha % 2 == 0 && Gsm.countPoisP1 > 0){

                Gsm.Player2_HP -= Gsm.Player2_ATKR * 0.1;
                Gsm.Player2_ATKR *= 0.95;
                if(Gsm.Player2_HP < 1){
                    removePanel(frame, Gm.gameMultiPanel);
                    winner.won.setText("P1 WON");
                    if(dark){
                        winner.won.setForeground(Color.CYAN);
                    }
                    if(light){
                        winner.won.setForeground(Color.BLUE);
                    }
                    winnerScreen();
                } else{
                    Gsm.countPoisP1--;
                    Gsm.P1Turn = false;
                    Gsm.P2Turn = false;
                    playSound();
                    Gm.atkPlayer2R.setText("Atk Range : "+ Gsm.Player2_ATKR);
                    Gm.hpPlayer2.setText("Hitpoint : " + Gsm.Player2_HP);
                    removeP1Btn();
                    rollDice();
                }
            } else if(gacha % 2 == 1 && Gsm.countPoisP1 > 0){
                Gsm.Player1_HP -= Gsm.Player1_ATKR * 0.1;
                Gsm.Player1_ATKR *= 0.95;
                if(Gsm.Player1_HP < 1){
                    removePanel(frame, Gm.gameMultiPanel);
                    winner.won.setText("P2 WON");
                    if(dark){
                        winner.won.setForeground(Color.YELLOW);
                    }
                    if(light){
                        winner.won.setForeground(Color.RED);
                    }
                    winnerScreen();
                } else{
                    Gsm.countPoisP1--;
                    Gsm.P1Turn = false;
                    Gsm.P2Turn = false;
                    playSound();
                    Gm.atkPlayer1R.setText("Atk Range : " + Gsm.Player1_ATKR);
                    Gm.hpPlayer1.setText("Hitpoint : " + Gsm.Player1_HP);
                    removeP1Btn();
                    rollDice();
                }
            } else{
                playSound();
            }
            if(dark){
                Gm.atkPlayer2R.setForeground(Color.WHITE);
            } else{
                Gm.atkPlayer2R.setForeground(Color.BLACK);
            }

            if(Gsm.countPoisP1 > -1){
                Gm.btnPoisonP1.setText("POISON" + "(" + Gsm.countPoisP1 + ")");
            }


        }
    }

    public class SkipP1 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            Gsm.P1Turn = false;
            Gsm.P2Turn = true;
            playSound();
            Gm.statusGame.setText("Status : Player 2 Turn");
            removeP1Btn();
            P2Action();
        }
    }

    //PLAYER 2 Action
    public class AttackP2 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            int atkR = (int) (Math.random() * Gsm.Player2_ATKR) + 1;
            Gsm.Player1_HP -= atkR;
            if(Gsm.Player1_HP < 1){
                removePanel(frame, Gm.gameMultiPanel);
                winner.won.setText("P2 WON");
                if(dark){
                    winner.won.setForeground(Color.YELLOW);
                }
                if(light){
                    winner.won.setForeground(Color.RED);
                }
                winnerScreen();
            } else {
                Gsm.P1Turn = false;
                Gsm.P2Turn = false;

                if(dark){
                    Gm.atkPlayer2R.setForeground(Color.WHITE);
                } else {
                    Gm.atkPlayer2R.setForeground(Color.BLACK);
                }
                playSound();
                Gm.hpPlayer1.setText("Hitpoint : " + Gsm.Player1_HP);
                Gm.hpPlayer2.setText("Hitpoint : " + Gsm.Player2_HP);
                removeP2Btn();
                rollDice();
            }
        }
    }

    public class HealP2 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            Gsm.P1Turn = false;
            Gsm.P2Turn = false;

            playSound();
            int Heal = heal();
            Gsm.Player2_HP += Heal;

            if(Gsm.isHpLow && Gsm.Player2_HP > Gsm.hpLow){
                Gsm.Player2_HP = Gsm.hpLow;
            } else if(Gsm.isHpMed && Gsm.Player2_HP > Gsm.hpMed){
                Gsm.Player2_HP = Gsm.hpMed;
            } else if(Gsm.isHpHigh && Gsm.Player2_HP > Gsm.hpHigh){
                Gsm.Player2_HP = Gsm.hpHigh;
            } else if(Gsm.isHpCrazy && Gsm.Player2_HP > Gsm.hpCrazy){
                Gsm.Player2_HP = Gsm.hpCrazy;
            }
            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.Player1_HP);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.Player2_HP);
            if(dark){
                Gm.atkPlayer2R.setForeground(Color.WHITE);
            } else{
                Gm.atkPlayer2R.setForeground(Color.BLACK);
            }
            removeP2Btn();
            rollDice();
        }

    }

    public class PoisonP2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Gsm.P2Turn = true;
            int gacha = (int) (Math.random() * 1000) + 1;
            if(gacha == 15 && Gsm.countPoisP2 > 0){
                removePanel(frame, Gm.gameMultiPanel);
                winner.won.setText("P2 WON");
                if(dark){
                    winner.won.setForeground(Color.YELLOW);
                }
                if(light){
                    winner.won.setForeground(Color.RED);
                }
                winnerScreen();
            } else if(gacha % 2 == 0 && Gsm.countPoisP2 > 0){

                Gsm.Player1_HP -= Gsm.Player1_ATKR * 0.1;
                Gsm.Player1_ATKR *= 0.95;
                if(Gsm.Player1_HP < 1){
                    removePanel(frame, Gm.gameMultiPanel);
                    winner.won.setText("P2 WON");
                    if(dark){
                        winner.won.setForeground(Color.YELLOW);
                    }
                    if(light){
                        winner.won.setForeground(Color.RED);
                    }
                    winnerScreen();
                } else{
                    Gsm.countPoisP2--;
                    Gsm.P1Turn = false;
                    Gsm.P2Turn = false;
                    playSound();
                    Gm.atkPlayer1R.setText("Atk Range : " + Gsm.Player1_ATKR);
                    Gm.hpPlayer1.setText("Hitpoint : " + Gsm.Player1_HP);
                    removeP2Btn();
                    rollDice();
                }
            } else if(gacha % 2 == 1 && Gsm.countPoisP2 > 0){

                Gsm.Player2_HP -= Gsm.Player2_ATKR * 0.1;
                Gsm.Player2_ATKR *= 0.95;
                if(Gsm.Player2_HP < 1){
                    removePanel(frame, Gm.gameMultiPanel);
                    winner.won.setText("P1 WON");
                    if(dark){
                        winner.won.setForeground(Color.CYAN);
                    }
                    if(light){
                        winner.won.setForeground(Color.BLUE);
                    }
                    winnerScreen();
                } else {
                    Gsm.countPoisP2--;
                    Gsm.P1Turn = false;
                    Gsm.P2Turn = false;
                    playSound();
                    Gm.atkPlayer2R.setText("Atk Range : " + Gsm.Player2_ATKR);
                    Gm.hpPlayer2.setText("Hitpoint : " + Gsm.Player2_HP);
                    removeP2Btn();
                    rollDice();
                }
            } else{
                playSound();
            }
            if(dark){
                Gm.atkPlayer2R.setForeground(Color.WHITE);
            } else{
                Gm.atkPlayer2R.setForeground(Color.BLACK);
            }

            if(Gsm.countPoisP2 > -1){
                Gm.btnPoisonP2.setText("POISON" + "(" + Gsm.countPoisP2 + ")");
            }


        }
    }

    public class SkipP2 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            Gsm.P1Turn = true;
            Gsm.P2Turn = false;
            playSound();
            Gm.statusGame.setText("Status : Player 2 Turn");
            removeP2Btn();
            P1Action();
        }
    }
    //RANDOM TURN
    public class rollDice implements ActionListener{
        public void actionPerformed(ActionEvent e){

            playSound();
            int turn = (int) (Math.random() * 10);
            removeBtn(Gm.rollBtn);
            if(turn % 2 == 0){
                Gm.statusGame.setText("Status : Player 1 Turn");
                Gsm.P1Turn = true;
                P1Action();
            } else {
                Gm.statusGame.setText("Status : Player 2 Turn");
                Gsm.P2Turn = true;
                P2Action();
            }
        }

    }

    ///////////////////////////////////FOR SINGLE PLAYER//////////////////////////////////////////////////////////
    ///////////////////////////////////FOR SINGLE PLAYER///////////////////////////////////////////////////////////
    //////START DUEL MODE BUTTON CONFIGURATIONS
    public class easyDuelMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            DuelSettings.isEasy = true;
            DuelSettings.isNormal = false;
            DuelSettings.isHard = false;
            DuelSettings.isExtreme = false;

            DuelSettings.enemyHp = 60;
            DuelSettings.enemyAtk = 10;
            checkDuelMode();
        }
    }

    public class normalDuelMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            DuelSettings.isEasy = false;
            DuelSettings.isNormal = true;
            DuelSettings.isHard = false;
            DuelSettings.isExtreme = false;

            DuelSettings.enemyHp = 120;
            DuelSettings.enemyAtk = 20;
            checkDuelMode();
        }
    }

    public class hardDuelMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            DuelSettings.isEasy = false;
            DuelSettings.isNormal = false;
            DuelSettings.isHard = true;
            DuelSettings.isExtreme = false;

            DuelSettings.enemyHp = 200;
            DuelSettings.enemyAtk = 35;
            checkDuelMode();
        }
    }

    public class extremeDuelMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            DuelSettings.isEasy = false;
            DuelSettings.isNormal = false;
            DuelSettings.isHard = false;
            DuelSettings.isExtreme = true;

            DuelSettings.enemyHp = 300;
            DuelSettings.enemyAtk = 50;
            checkDuelMode();
        }
    }

    public class startDuelGame implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            if(DuelSettings.isEasy || DuelSettings.isNormal ||
                    DuelSettings.isHard || DuelSettings.isExtreme){
                System.out.println(true);
            } else{
                DuelSettings.titleDuelSetting.setText("PLEASE SELECT MODE FIRST");
            }

        }
    }

    public class backToRuleDuel implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            DuelSettings.isEasy = false;
            DuelSettings.isNormal = false;
            DuelSettings.isHard = false;
            DuelSettings.isExtreme = false;
            DuelSettings.easyLabel.setText("");
            DuelSettings.normalLabel.setText("");
            DuelSettings.hardLabel.setText("");
            DuelSettings.extremeLabel.setText("");


            checkDuelMode();
            removePanel(frame, DuelSettings.duelSettingPanel);
            duelModeRuleScreen();
        }
    }
}
