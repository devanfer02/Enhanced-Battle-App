import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class AppSys extends SetUp{
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

    //// START DUEL SETTING MODE BUTTONS
    startDuelGame startDuelGame = new startDuelGame();
    duelModeRule duelModeRule = new duelModeRule();
    backToChoice backToChoice = new backToChoice();
    duelContSetting duelContSetting = new duelContSetting();
    backToRuleDuel backToRuleDuel = new backToRuleDuel();
    easyDuelMode easyDuelMode = new easyDuelMode();
    normalDuelMode normalDuelMode = new normalDuelMode();
    hardDuelMode hardDuelMode = new hardDuelMode();
    extremeDuelMode extremeDuelMode = new extremeDuelMode();
    //// END DUEL MODE SETTING BUTTONS

    //// START DUEL MODE GAME
    rollDuelAction rollDuelAction = new rollDuelAction();
    duelGamePaused duelGamePaused = new duelGamePaused();
    PlayerAttack PlayerAttack = new PlayerAttack();
    PlayerHeal PlayerHeal = new PlayerHeal();
    PlayerPoison PlayerPoison = new PlayerPoison();
    PlayerSurrender PlayerSurrender = new PlayerSurrender();
    //// END DUEL MODE GAME

    //// START STORY MODE GAME
    storyMode storyMode = new storyMode();
    startStoryMode startStoryMode = new startStoryMode();
    pauseStoryMode pauseStoryMode = new pauseStoryMode();
    storyModeChoices storyModeChoices = new storyModeChoices();
    //END SETTING CLASSES FOR ACTION PERFORMED AKA BUTTONS
    JFrame frame = new JFrame("BattleApp");
    String songPlayed = song1;
    void GameApp(){
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(Opening.openingPanel);
        setSoundEffectFile(btnSound);
        setSongFile(songPlayed);
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
        Settings.prevSong.setActionCommand("previous");
        Settings.nextSong.setActionCommand("next");
        Settings.prevSong.addActionListener(changeSong);
        Settings.nextSong.addActionListener(changeSong);
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
        SpChoice.storyBtn.addActionListener(storyMode);
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

        ////BUTTONS IN DUEL GAME
        DuelGame.rollDuel.addActionListener(rollDuelAction);
        DuelGame.settingsDuel.addActionListener(duelGamePaused);
        DuelGame.attackBtn.addActionListener(PlayerAttack);
        DuelGame.healBtn.addActionListener(PlayerHeal);
        DuelGame.poisonBtn.addActionListener(PlayerPoison);
        DuelGame.surrenderBtn.addActionListener(PlayerSurrender);

        ////BUTTONS IN DUEL RESULT
        DuelResult.backMenu.addActionListener(bmw);
        DuelResult.newGame.addActionListener(duelContSetting);

        ////BUTTONS IN STORY GAME
        StoryMode.backToChoice.addActionListener(backToChoice);
        StoryMode.startStory.addActionListener(startStoryMode);
        StoryMode.settings.addActionListener(pauseStoryMode);
        StoryMode.choice1.addActionListener(storyModeChoices);
        StoryMode.choice2.addActionListener(storyModeChoices);
        StoryMode.choice1.setActionCommand("choice1");
        StoryMode.choice2.setActionCommand("choice2");
    }

    //START SETTING PANEL SCREEN

    void menuScreen(){
        frame.add(Menu.menuPanel);
        frame.setVisible(true);
    }

    void aboutScreen(){
        frame.add(About.aboutPanel);
        frame.setVisible(true);
    }

    void settingsScreen(){
        frame.add(Settings.settingsPanel);
        frame.setVisible(true);
    }

    void ruleScreen(){
        frame.add(Rules.rulePanel);
        frame.setVisible(true);
    }

    void gameSettingMultiScreen(){
        frame.add(Gsm.gameSetMulti);
        frame.setVisible(true);
    }

    void gameScreen(){
        frame.add(Gm.gameMultiPanel);
        frame.setVisible(true);
    }

    void settingGameScreen(){
        frame.add(Mgs.pauseSettingPanel);
        frame.setVisible(true);
    }

    void gameChoiceScreen(){
        frame.add(SpChoice.choicePanel);
        frame.setVisible(true);
    }

    void duelModeRuleScreen(){
        DuelSettings.underLabel.setText("SELECT MODE");
        frame.add(DMR.duelRulePanel);
        frame.setVisible(true);
    }

    void duelModeSettingScreen(){
        frame.add(DuelSettings.duelSettingPanel);
        frame.setVisible(true);
    }

    void duelGameScreen(){
        frame.add(DuelGame.duelGamePanel);
        frame.setVisible(true);
    }

    void duelResultScreen(){
        stopSong();
        setSongFile(loseDuel);
        if(playerSurender) setSongFile(surrenderDuel);
        if(DuelSettings.isEasy && playerWin) setSongFile(WinDuelEasy);
        if(DuelSettings.isNormal && playerWin) setSongFile(WinDuelNormal);
        if(DuelSettings.isHard && playerWin) setSongFile(WinDuelHard);
        if(DuelSettings.isExtreme && playerWin) setSongFile(WinDuelExtreme);

        if(enemyWin) checkSetSoundVer3();
        else checkSetSound();
        checkDuelMode();
        resetDuelSettings();
        frame.add(DuelResult.duelResultPanel);
        frame.setVisible(true);
    }

    void winnerScreen(){
        stopSong();
        setSongFile(WSong);
        resetStat();
        checkModeGSM_HP();
        checkModeGSM_ATK();
        checkSetSound();
        frame.add(winner.winPanel);
        frame.setVisible(true);
    }

    void storyModeScreen(){
        frame.add(StoryMode.storyPanel);
        frame.setVisible(true);
    }
    //END SETTING PANEL SCREEN

    //IMPLEMENTING BUTTON ACTION
    ///START MENU BUTTON
    class continueBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Opening.openingPanel);
            menuScreen();
        }
    }

    class gameChoiceBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Menu.menuPanel);
            gameChoiceScreen();
        }
    }

    class ruleBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Menu.menuPanel);
            ruleScreen();
        }
    }

    class exitBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            System.exit(0);
        }
    }
    class aboutBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Menu.menuPanel);
            aboutScreen();
        }
    }

    class duelModeRule implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            playSound();
            removePanel(frame, SpChoice.choicePanel);
            duelModeRuleScreen();
        }
    }

    class storyMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, SpChoice.choicePanel);
            storyModeScreen();
        }
    }

    class duelContSetting implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            playSound();
            DuelSettings.isEasy = false;
            DuelSettings.isNormal = false;
            DuelSettings.isHard = false;
            DuelSettings.isExtreme = false;
            DuelSettings.underLabel.setText("SELECT MODE");
            removePanel(frame, DMR.duelRulePanel);
            removePanel(frame, DuelResult.duelResultPanel);
            duelRollButtons();
            duelModeSettingScreen();
        }
    }

    class backToChoice implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            playSound();
            removePanel(frame, StoryMode.storyPanel);
            removePanel(frame, DMR.duelRulePanel);
            gameChoiceScreen();
        }
    }

    //END BUTTON FOR MENU PANEL
    class backMenu implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(multiPaused){
                stopSong();
                setSongFile(songPlayed);
                checkSetSoundVer2();
                removePanel(frame, Mgs.pauseSettingPanel);
                removePanel(frame, Gm.gameMultiPanel);
                resetStat();
                multiPaused = false;
            }
            if(duelPaused){
                if(playerTurn) removePlayerAction();
                playerTurn = false;
                duelRollButtons();
                stopSong();
                setSongFile(songPlayed);
                checkSetSoundVer2();
                removePanel(frame, Mgs.pauseSettingPanel);
                removePanel(frame, DuelGame.duelGamePanel);
                resetDuelSettings();
                duelPaused = false;
            }
            if(storyPaused){
                stopSong();
                setSongFile(songPlayed);
                checkSetSoundVer2();
                StoryMode.removeStoryText();
                StoryMode.addStartMenu();
                removePanel(frame, Mgs.pauseSettingPanel);
                storyPaused = false;
            }
            else{
                checkSetSoundVer2();
                removePanel(frame, SpChoice.choicePanel);
                removePanel(frame, Settings.settingsPanel);
                removePanel(frame, About.aboutPanel);
                removePanel(frame, Rules.rulePanel);
            }
            menuScreen();
        }
    }

    class settingBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Menu.menuPanel);
            settingsScreen();
        }
    }

    ///END MENU BUTTON
    class backMenuWin implements ActionListener{
        public void actionPerformed(ActionEvent e){
            stopSong();
            setSongFile(songPlayed);
            checkSetSound();
            removePanel(frame, winner.winPanel);
            removePanel(frame, DuelResult.duelResultPanel);
            menuScreen();
        }
    }
    ///START BUTTON IN SETTING

    class setSoundSettingsBtn implements ActionListener{
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
    class setColorSettingsBtn implements ActionListener{
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

    class changeSong implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String choice = e.getActionCommand();
            switch (choice) {
                case "previous" -> {
                    countArrs--;
                    if (countArrs < 0) countArrs +=  11;
                    stopSong();
                    songPlayed = arrSongs[countArrs];
                    setSongFile(songPlayed);
                    checkSetSoundVer2();
                }
                case "next" -> {
                    countArrs++;
                    if (countArrs > 10) countArrs = (countArrs % 10) - 1;
                    stopSong();
                    songPlayed = arrSongs[countArrs];
                    setSongFile(songPlayed);
                    checkSetSoundVer2();
                }
            }
        }
    }
    ///END BUTTON IN SETTING

    class contGameSetMulti implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, winner.winPanel);
            removePanel(frame,Rules.rulePanel);
            gameSettingMultiScreen();
        }
    }
    ////MULTIPLAYER MODE BUTTON CONFIGURATIONS
    class backToRuleBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Gsm.gameSetMulti);
            ruleScreen();
        }
    }

    class playerlowhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            setAllMultiHpFalse();
            multiHpCheck[0] = true;

            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpLow);
            Gsm.Player1_HP = Gsm.hpLow;
            Gsm.Player2_HP = Gsm.hpLow;
            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpLow);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpLow);

        }
    }
    class playermedhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            setAllMultiHpFalse();
            multiHpCheck[1] = true;

            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpMed);
            Gsm.Player1_HP = Gsm.hpMed;
            Gsm.Player2_HP = Gsm.hpMed;
            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpMed);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpMed);
        }
    }
    class playerhighhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            setAllMultiHpFalse();
            multiHpCheck[2] = true;
            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpHigh);
            Gsm.Player1_HP = Gsm.hpHigh;
            Gsm.Player2_HP = Gsm.hpHigh;
            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpHigh);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpHigh);
        }
    }
    class playercrazyhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            setAllMultiHpFalse();
            multiHpCheck[3] = true;
            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpCrazy);
            Gsm.Player1_HP = Gsm.hpCrazy;
            Gsm.Player2_HP = Gsm.hpCrazy;
            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpCrazy);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpCrazy);
        }
    }
    //ATK RANGE
    class playerlowatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            setAllMultiAtkFalse();
            multiAtkCheck[0] = true;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkLow);
            Gsm.Player1_ATKR = Gsm.atkLow;
            Gsm.Player2_ATKR = Gsm.atkLow;
            Gm.atkPlayer1R.setText("Atk Range : " + Gsm.atkLow);
            Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkLow);
        }
    }
    class playermedatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            setAllMultiAtkFalse();
            multiAtkCheck[1] = true;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkMed);
            Gsm.Player1_ATKR = Gsm.atkMed;
            Gsm.Player2_ATKR = Gsm.atkMed;
            Gm.atkPlayer1R.setText("Atk Range : " + Gsm.atkMed);
            Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkMed);
        }
    }
    class playerhighatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            setAllMultiAtkFalse();
            multiAtkCheck[2] = true;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkHigh);
            Gsm.Player1_ATKR = Gsm.atkHigh;
            Gsm.Player2_ATKR = Gsm.atkHigh;
            Gm.atkPlayer1R.setText("Atk Range : " + Gsm.atkHigh);
            Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkHigh);
        }
    }
    class playercrazyatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            setAllMultiAtkFalse();
            multiAtkCheck[3] = true;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkCrazy);
            Gsm.Player1_ATKR = Gsm.atkCrazy;
            Gsm.Player2_ATKR = Gsm.atkCrazy;
            Gm.atkPlayer1R.setText("Atk Range : "+ Gsm.atkCrazy);
            Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkCrazy);
        }
    }

    class startGame implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(storyPaused){
                checkSetSoundVer2();
                storyPaused = false;

                removePanel(frame, Mgs.pauseSettingPanel);
                storyModeScreen();
            }
            if((DuelSettings.isEasy || DuelSettings.isNormal ||
                    DuelSettings.isHard || DuelSettings.isExtreme) && duelPaused ){
                checkSetSoundVer2();
                duelPaused = false;
                removePanel(frame, Mgs.pauseSettingPanel);
                duelGameScreen();
            }
            if((multiHpCheck[0] || multiHpCheck[1] || multiHpCheck[2] || multiHpCheck[3])
                    && (multiAtkCheck[0] ||multiAtkCheck[1] || multiAtkCheck[2] || multiAtkCheck[3])){
                Gm.btnPoisonP1.setText("POISON" + "(" + Gsm.countPoisP1 + ")");
                Gm.btnPoisonP2.setText("POISON" + "(" + Gsm.countPoisP2 + ")");

                if(multiPaused){
                    checkSetSoundVer2();
                    multiPaused = false;
                    removePanel(frame, Mgs.pauseSettingPanel);
                    gameScreen();
                } else{
                    stopSong();
                    setSongFile(btlSong1);
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

    class pauseGame implements ActionListener {
        public void actionPerformed(ActionEvent e){
            multiPaused = true;
            playSound();
            removePanel(frame, Gm.gameMultiPanel);
            settingGameScreen();
        }
    }

    ///BUTTON FOR GAME MULTIPLAYER BATTLE
    class AttackP1 implements ActionListener {

        public void actionPerformed(ActionEvent e){
            int atkR = (int) (Math.random() * Gsm.Player1_ATKR) + 1;
            Gsm.Player2_HP -= atkR;
            if(Gsm.Player2_HP < 1){
                removePanel(frame, Gm.gameMultiPanel);
                winner.won.setText("PLAYER 1 WON");
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

    class HealP1 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            playSound();
            int Heal = heal();
            Gsm.Player1_HP += Heal;

            for(int i = 0; i < 4; i++){
                if(multiHpCheck[i] && Gsm.Player1_HP > multiHPset[i]){
                    Gsm.Player1_HP = multiHPset[i];
                }
            }

            Gm.hpPlayer1.setText("Hitpoint : " + Gsm.Player1_HP);
            Gm.hpPlayer2.setText("Hitpoint : " + Gsm.Player2_HP);
            Gsm.P1Turn = false;
            Gsm.P2Turn = false;
            removeP1Btn();
            rollDice();
        }
    }

    class PoisonP1 implements ActionListener{
        public void actionPerformed(ActionEvent e){

            Gsm.P1Turn = true;
            int gacha = (int) (Math.random() * 1000) + 1;
            if(gacha == 14 && Gsm.countPoisP1 > 0){
                removePanel(frame, Gm.gameMultiPanel);
                winner.won.setText("PLAYER 1 WON");
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

    class SkipP1 implements ActionListener{

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
    class AttackP2 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            int atkR = (int) (Math.random() * Gsm.Player2_ATKR) + 1;
            Gsm.Player1_HP -= atkR;
            if(Gsm.Player1_HP < 1){
                removePanel(frame, Gm.gameMultiPanel);
                winner.won.setText("PLAYER 2 WON");
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

    class HealP2 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            playSound();
            int Heal = heal();
            Gsm.Player2_HP += Heal;

            for(int i = 0; i < 4; i++){
                if(multiHpCheck[i] && Gsm.Player2_HP > multiHPset[i]){
                    Gsm.Player2_HP = multiHPset[i];
                }
            }
            Gsm.P1Turn = false;
            Gsm.P2Turn = false;
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

    class PoisonP2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Gsm.P2Turn = true;
            int gacha = (int) (Math.random() * 1000) + 1;
            if(gacha == 15 && Gsm.countPoisP2 > 0){
                removePanel(frame, Gm.gameMultiPanel);
                winner.won.setText("PLAYER 2 WON");
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

    class SkipP2 implements ActionListener{

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
    class rollDice implements ActionListener{
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
    class easyDuelMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            DuelSettings.isEasy = true;
            DuelSettings.isNormal = false;
            DuelSettings.isHard = false;
            DuelSettings.isExtreme = false;

            DuelSettings.enemyHp = 100;
            DuelSettings.enemyAtk = 15;
            checkDuelMode();
        }
    }

    class normalDuelMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            DuelSettings.isEasy = false;
            DuelSettings.isNormal = true;
            DuelSettings.isHard = false;
            DuelSettings.isExtreme = false;

            DuelSettings.enemyHp = 150;
            DuelSettings.enemyAtk = 25;
            checkDuelMode();
        }
    }

    class hardDuelMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            DuelSettings.isEasy = false;
            DuelSettings.isNormal = false;
            DuelSettings.isHard = true;
            DuelSettings.isExtreme = false;

            DuelSettings.enemyHp = 220;
            DuelSettings.enemyAtk = 30;
            checkDuelMode();
        }
    }

    class extremeDuelMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            DuelSettings.isEasy = false;
            DuelSettings.isNormal = false;
            DuelSettings.isHard = false;
            DuelSettings.isExtreme = true;

            DuelSettings.enemyHp = 420;
            DuelSettings.enemyAtk = 50;
            checkDuelMode();
        }
    }

    class startDuelGame implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(DuelSettings.isEasy || DuelSettings.isNormal ||
                    DuelSettings.isHard || DuelSettings.isExtreme){
                stopSong();
                setSongFile(btlSong2);
                checkSetSound();
                removePanel(frame, DuelSettings.duelSettingPanel);
                DuelGame.poisonBtn.setText("POISON (" + DuelSettings.poisonCount + ")");
                DuelGame.PlayerHP.setText("Hitpoint : " + DuelSettings.playerHp);
                DuelGame.PlayerAtk.setText("Atk Range : " + DuelSettings.playerAtk);
                DuelGame.EnemyHP.setText("Hitpoint : " + DuelSettings.enemyHp);
                DuelGame.EnemyAtk.setText("Atk Range : " + DuelSettings.enemyAtk);
                duelGameScreen();
                duelRollButtons();

            } else{
                playSound();
                DuelSettings.titleDuelSetting.setText("SELECT MODE FIRST");
            }

        }
    }

    class backToRuleDuel implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            resetDuelSettings();
            removePanel(frame, DuelSettings.duelSettingPanel);
            duelModeRuleScreen();

        }
    }
    ////BUTTON ACTIONS FOR DUEL GAME
    class rollDuelAction implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            playSound();
            duelRollTurn();
            if(enemyWin){
                removeRollDuel();
                removePanel(frame, DuelGame.duelGamePanel);
                duelResultScreen();
            }
        }
    }

    class duelGamePaused implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            duelPaused = true;
            playSound();
            removePanel(frame, DuelGame.duelGamePanel);
            settingGameScreen();
        }
    }

    class PlayerAttack implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playerTurn = false;
            playSound();
            int critical = (int)(Math.random() * 100) + 1;
            int atkRange = (int)(Math.random() * DuelSettings.playerAtk) + 15;
            int atk;
            if(critical % 100 == 0){
                DuelGame.duelStatus1.setText("YOU HIT THEM CRITICALLY!");
                atk = atkRange * 6;
                DuelGame.duelStatus2.setText("DAMAGE : " + atk);
                DuelSettings.enemyHp -= atk;
            }
            else if(critical % 50 == 0){
                DuelGame.duelStatus1.setText("YOU HIT THEM CRITICALLY!");
                atk = atkRange * 4;
                DuelGame.duelStatus2.setText("DAMAGE : " + atk);
                DuelSettings.enemyHp -= atk;
            } else if(critical % 25 == 0){
                DuelGame.duelStatus1.setText("YOU HIT THEM CRITICALLY!");
                atk = (int)(atkRange * 2.5);
                DuelGame.duelStatus2.setText("DAMAGE : " + atk);
                DuelSettings.enemyHp -= atk;
            } else if(critical % 10 == 0){
                DuelGame.duelStatus1.setText("YOU HIT THEM CRITICALLY!");
                atk = (int)(atkRange * 1.7);
                DuelGame.duelStatus2.setText("DAMAGE : " + atk);
                DuelSettings.enemyHp -= atk;
            } else if(critical % 5 == 0){
                DuelGame.duelStatus1.setText("YOU HIT THEM CRITICALLY!");
                atk = (int)(atkRange * 1.4);
                DuelGame.duelStatus2.setText("DAMAGE : " + atk);
                DuelSettings.enemyHp -= atk;
            } else{
                DuelGame.duelStatus1.setText("YOU ATTACK THEM!");
                DuelGame.duelStatus2.setText("DAMAGE : " + atkRange);
                DuelSettings.enemyHp -= atkRange;
            }

            if(DuelSettings.enemyHp < 1){
                playerWin = true;
                removePlayerAction();
                setColorResult();
                removePanel(frame, DuelGame.duelGamePanel);
                DuelResult.topTitle.setText("CONGRATULATIONS...");
                DuelResult.duelResultTitle.setText("YOU WON!");
                duelResultScreen();
            } else{
                updateStatusDuel();
                removePlayerAction();
                duelRollButtons();
            }
        }
    }

    class PlayerHeal implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            playerTurn = false;
            int Heal = (int)(Math.random() * 35) + 15;
            DuelSettings.playerHp += Heal;
            if(DuelSettings.playerHp > 140) DuelSettings.playerHp = 140;
            DuelGame.duelStatus1.setText("YOU HEALED YOUR WOUND!");
            DuelGame.duelStatus2.setText("HP RECOVERED : " + Heal);
            updateStatusDuel();
            removePlayerAction();
            duelRollButtons();
        }
    }

    class PlayerPoison implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            if(DuelSettings.poisonCount > 0){
                DuelSettings.poisonCount--;
                int poisonAtk = (int)(DuelSettings.enemyHp * 0.01);
                int poisonHp = (int)(DuelSettings.enemyAtk * 0.2);
                DuelSettings.enemyHp -= DuelSettings.enemyAtk * 0.2;
                DuelSettings.enemyAtk -= DuelSettings.enemyHp * 0.01;
                if(DuelSettings.enemyHp < 1){
                    playerWin = true;
                    removePlayerAction();
                    removePanel(frame, DuelGame.duelGamePanel);
                    setColorResult();
                    DuelResult.topTitle.setText("CONGRATULATIONS...");
                    DuelResult.duelResultTitle.setText("YOU WON!");
                    duelResultScreen();
                }
                DuelGame.poisonBtn.setText("POISON (" + DuelSettings.poisonCount + ")");
                DuelGame.duelStatus1.setText("YOU POISONED THEM!");
                DuelGame.duelStatus2.setText("TOTAL DAMAGE : " + (poisonAtk + poisonHp));
                playerTurn = false;
                updateStatusDuel();
                removePlayerAction();
                duelRollButtons();
            } else{
                DuelGame.poisonBtn.setText("RUN OUT!");
            }
        }
    }

    class PlayerSurrender implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playerTurn = false;
            removePlayerAction();
            playerSurender = true;
            removePanel(frame, DuelGame.duelGamePanel);
            if(dark){
                DuelResult.duelResultTitle.setForeground(Color.WHITE);
            } else{
                DuelResult.duelResultTitle.setForeground(Color.BLACK);
            }
            DuelSettings.underLabel.setText("SELECT MODE");
            DuelResult.topTitle.setText("WOW SEE YOU GOT A...");
            DuelResult.duelResultTitle.setText("A FUCKING L");
            duelResultScreen();
        }
    }
    ////////////////////BUTTONS IN STORY MODE//////////////////////////////////
    class startStoryMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            stopSong();
            setSongFile(storySong);
            checkSetSound();
            StoryMode.wakeUp();
        }
    }

    class pauseStoryMode implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            storyPaused = true;
            removePanel(frame, StoryMode.storyPanel);
            settingGameScreen();
        }
    }

    //CHOICE HANDLER
    class storyModeChoices implements ActionListener{
        public void actionPerformed(ActionEvent e){

            String choice = e.getActionCommand();

            switch (StoryMode.place){
                case "wakeUp":
                    playSound();
                    switch (choice) {
                        case "choice1" -> StoryMode.gasKuliah();
                        case "choice2" -> StoryMode.lanjutTuru();
                    }
                    break;
                case "gasKuliah":
                    playSound();
                    switch (choice) {
                        case "choice1" -> StoryMode.gasNgebut();
                        case "choice2" -> StoryMode.pelan();
                    }
                    break;
                case "lanjutTuru":
                    switch (choice) {
                        case "choice1" -> {
                            playSound();
                            addComponent(0,7,4,StoryMode.settings,StoryMode.storyPanel);
                            StoryMode.removeStoryText();
                            StoryMode.addStartMenu();
                        }
                        case "choice2" -> {
                            stopSong();
                            setSongFile(songPlayed);
                            checkSetSoundVer2();
                            addComponent(0,7,4,StoryMode.settings,StoryMode.storyPanel);
                            StoryMode.removeStoryText();
                            StoryMode.addStartMenu();
                            removePanel(frame, StoryMode.storyPanel);
                            menuScreen();
                        }
                    }
            }
        }
    }

}
