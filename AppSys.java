import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AppSys extends SetUp{
    //START SETTING CLASSES FOR ACTION PERFORMED AKA BUTTONS
    continueBtn continueBtn = new continueBtn();
    exitBtn exitBtn = new exitBtn();
    aboutBtn aboutBtn = new aboutBtn();
    backMenu backMenu = new backMenu();
    settingBtn settingBtn = new settingBtn();
    setColorSettingsBtn setColorBtn = new setColorSettingsBtn();
    setSoundSettingsBtn setSoundBtn = new setSoundSettingsBtn();
    ruleBtn ruleBtn = new ruleBtn();
    contGameSetMulti contGameSetMulti = new contGameSetMulti();
    backToRuleBtn backToRuleBtn = new backToRuleBtn();
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
    SkipP1 skipP1 = new SkipP1();
    AttackP2 attackP2 = new AttackP2();
    HealP2 healP2 = new HealP2();
    SkipP2 skipP2 = new SkipP2();

    //START SETTING CLASSES FOR ACTION PERFORMED AKA BUTTONS
    JFrame frame = new JFrame("BattleApp");

    //SWITCHES BOOLEAN
    boolean paused = false;

    public void GameApp(){
        setSoundEffectFile(btnSound);
        setSongFile(song1);
        playSong();
        loopSong();

        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(Opening.openingPanel);
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
        ///END BUTTONS IN MENU
        //START BUTTONS IN ABOUT
        About.backMainBtn.addActionListener(backMenu);
        //START BUTTONS IN SETTINGS

        Settings.setColor.addActionListener(setColorBtn);
        Settings.setSound.addActionListener(setSoundBtn);
        Settings.backMenu.addActionListener(backMenu);
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
        Gm.continueP1.addActionListener(skipP1);
        Gm.btnAtkP2.addActionListener(attackP2);
        Gm.btnHealP2.addActionListener(healP2);
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
        winner.menuBtn.addActionListener(backMenu);
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
    ///MENU BUTTON
    public class continueBtn implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, Opening.openingPanel);
            menuScreen();
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

    public class backMenu implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(paused){
                stopSong();
                setSongFile(song1);
                checkContinueSound();
                removePanel(frame, Mgs.pauseSettingPanel);
                removePanel(frame, Gm.gameMultiPanel);
                resetStat();
                paused = false;
            } else{
                checkSetSoundVer2();
                removePanel(frame, winner.winPanel);
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

    public class contGameSetMulti implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            removePanel(frame, winner.winPanel);
            removePanel(frame,Rules.rulePanel);
            gameSettingMultiScreen();
        }
    }
    ////BUTTONS FOR GAME MULTI SETTINGS
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
            isHpLow = true;
            isHpMed  = false;
            isHpHigh  = false;
            isHpCrazy  = false;

            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpLow);
            Gsm.Player1_HP = Gsm.hpLow;
            Gsm.Player2_HP = Gsm.hpLow;


        }
    }
    public class playermedhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            isHpLow = false;
            isHpMed  = true;
            isHpHigh  = false;
            isHpCrazy  = false;

            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpMed);
            Gsm.Player1_HP = Gsm.hpMed;
            Gsm.Player2_HP = Gsm.hpMed;

        }
    }
    public class playerhighhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            isHpLow = false;
            isHpMed  = false;
            isHpHigh  = true;
            isHpCrazy  = false;
            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpHigh);
            Gsm.Player1_HP = Gsm.hpHigh;
            Gsm.Player2_HP = Gsm.hpHigh;

        }
    }
    public class playercrazyhp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            isHpLow = false;
            isHpMed  = false;
            isHpHigh  = false;
            isHpCrazy  = true;
            checkModeGSM_HP();
            Gsm.settingHp.setText("HP : " + Gsm.hpCrazy);
            Gsm.Player1_HP = Gsm.hpCrazy;
            Gsm.Player2_HP = Gsm.hpCrazy;

        }
    }
    //ATK RANGE
    public class playerlowatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            isAtkLow = true;
            isAtkMed  = false;
            isAtkHigh  = false;
            isAtkCrazy  = false;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkLow);
            Gsm.Player1_ATKR = Gsm.atkLow;
            Gsm.Player2_ATKR = Gsm.atkLow;

        }
    }
    public class playermedatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            isAtkLow = false;
            isAtkMed  = true;
            isAtkHigh  = false;
            isAtkCrazy  = false;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkMed);
            Gsm.Player1_ATKR = Gsm.atkMed;
            Gsm.Player2_ATKR = Gsm.atkMed;

        }
    }
    public class playerhighatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            isAtkLow = false;
            isAtkMed  = false;
            isAtkHigh  = true;
            isAtkCrazy  = false;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkHigh);
            Gsm.Player1_ATKR = Gsm.atkHigh;
            Gsm.Player2_ATKR = Gsm.atkHigh;

        }
    }
    public class playercrazyatk implements ActionListener{
        public void actionPerformed(ActionEvent e){
            playSound();
            isAtkLow = false;
            isAtkMed  = false;
            isAtkHigh  = false;
            isAtkCrazy  = true;
            checkModeGSM_ATK();
            Gsm.settingAtk.setText("Atk : " + Gsm.atkCrazy);
            Gsm.Player1_ATKR = Gsm.atkCrazy;
            Gsm.Player2_ATKR = Gsm.atkCrazy;

        }
    }

    public class startGame implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if((isHpLow || isHpMed || isHpHigh || isHpCrazy)
                    && (isAtkLow || isAtkMed || isAtkHigh || isAtkCrazy)){
                stopSong();
                setSongFile(song2);
                if(paused){
                    checkContinueSound();
                    paused = false;
                    removePanel(frame, Mgs.pauseSettingPanel);
                    gameScreen();
                } else{
                    checkSetSound();
                    if(isHpLow){
                        Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpLow);
                        Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpLow);
                    }
                    if(isHpMed){
                        Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpMed);
                        Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpMed);
                    }
                    if(isHpHigh){
                        Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpHigh);
                        Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpHigh);
                    }
                    if(isHpCrazy){
                        Gm.hpPlayer1.setText("Hitpoint : " + Gsm.hpCrazy);
                        Gm.hpPlayer2.setText("Hitpoint : " + Gsm.hpCrazy);
                    }
                    if(isAtkLow){
                        Gm.atkPlayer1R.setText("Atk Range : " + Gsm.atkLow);
                        Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkLow);
                    }
                    if(isAtkMed){
                        Gm.atkPlayer1R.setText("Atk Range : " + Gsm.atkMed);
                        Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkMed);
                    }
                    if(isAtkHigh){
                        Gm.atkPlayer1R.setText("Atk Range : " + Gsm.atkHigh);
                        Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkHigh);
                    }
                    if(isAtkCrazy){
                        Gm.atkPlayer1R.setText("Atk Range : "+ Gsm.atkCrazy);
                        Gm.atkPlayer2R.setText("Atk Range : " + Gsm.atkCrazy);
                    }

                    removePanel(frame, Gsm.gameSetMulti);
                    gameScreen();
                    if(P1Turn){
                        removeP1Btn();
                    }
                    if(P2Turn){
                        if(dark){
                            Gm.atkPlayer2R.setForeground(Color.WHITE);
                        } else {
                            Gm.atkPlayer2R.setForeground(Color.BLACK);
                        }
                        removeP2Btn();
                    }
                    rollDice();
                }

            } else{
                Gsm.settingsMultiTxt.setText("Please select first");
            }
        }
    }

    public class pauseGame implements ActionListener {
        public void actionPerformed(ActionEvent e){
            paused = true;
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
                playSound();
                Gm.hpPlayer1.setText("HP : " + Gsm.Player1_HP);
                Gm.hpPlayer2.setText("HP : " + Gsm.Player2_HP);
                removeP1Btn();
                rollDice();
            }

        }

    }

    public class HealP1 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            playSound();
            int Heal = heal();
            Gsm.Player1_HP += Heal;

            if(isHpLow && Gsm.Player1_HP > Gsm.hpLow){
               Gsm.Player1_HP = Gsm.hpLow;
            } else if(isHpMed && Gsm.Player1_HP > Gsm.hpMed){
                Gsm.Player1_HP = Gsm.hpMed;
            } else if(isHpHigh && Gsm.Player1_HP > Gsm.hpHigh){
                Gsm.Player1_HP = Gsm.hpHigh;
            } else if(isHpCrazy && Gsm.Player1_HP > Gsm.hpCrazy){
                Gsm.Player1_HP = Gsm.hpCrazy;
            }
            Gm.hpPlayer1.setText("HP : " + Gsm.Player1_HP);
            Gm.hpPlayer2.setText("HP : " + Gsm.Player2_HP);
            removeP1Btn();
            rollDice();
        }
    }

    public class SkipP1 implements ActionListener{

        public void actionPerformed(ActionEvent e){
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
                if(dark){
                    Gm.atkPlayer2R.setForeground(Color.WHITE);
                } else {
                    Gm.atkPlayer2R.setForeground(Color.BLACK);
                }
                playSound();
                Gm.hpPlayer1.setText("HP : " + Gsm.Player1_HP);
                Gm.hpPlayer2.setText("HP : " + Gsm.Player2_HP);
                removeP2Btn();
                rollDice();
            }

        }

    }

    public class HealP2 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            playSound();
            int Heal = heal();
            Gsm.Player2_HP += Heal;

            if(isHpLow && Gsm.Player2_HP > Gsm.hpLow){
                Gsm.Player2_HP = Gsm.hpLow;
            } else if(isHpMed && Gsm.Player2_HP > Gsm.hpMed){
                Gsm.Player2_HP = Gsm.hpMed;
            } else if(isHpHigh && Gsm.Player2_HP > Gsm.hpHigh){
                Gsm.Player2_HP = Gsm.hpHigh;
            } else if(isHpCrazy && Gsm.Player2_HP > Gsm.hpCrazy){
                Gsm.Player2_HP = Gsm.hpCrazy;
            }
            Gm.hpPlayer1.setText("HP : " + Gsm.Player1_HP);
            Gm.hpPlayer2.setText("HP : " + Gsm.Player2_HP);
            removeP1Btn();
            rollDice();
        }

    }

    public class SkipP2 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            playSound();
            Gm.statusGame.setText("Status : Player 2 Turn");
            removeP1Btn();
            P2Action();
        }
    }
    //RANDOM TURN
    public class rollDice implements ActionListener{
        public void actionPerformed(ActionEvent e){
            P1Turn = false;
            P2Turn = false;
            playSound();
            int turn = (int) (Math.random() * 10);
            removeBtn(Gm.rollBtn);
            if(turn % 2 == 0){
                Gm.statusGame.setText("Status : Player 1 Turn");
                P1Turn = true;
                P1Action();
            } else {
                Gm.statusGame.setText("Status : Player 2 Turn");
                P2Turn = true;
                P2Action();
            }
        }

    }
    public int heal(){
        int Heal = (int) (Math.random() * 80) + 1;
        if(isHpLow){
            Heal = (int) (Math.random() * (Gsm.hpLow * 0.1)) + 1;
        } else if(isHpMed){
            Heal = (int) (Math.random() * (Gsm.hpMed * 0.1)) + 1;
        } else if(isHpHigh){
            Heal = (int) (Math.random() * (Gsm.hpHigh * 0.1)) + 1;
        } else if(isHpCrazy){
            Heal = (int) (Math.random() * (Gsm.hpCrazy * 0.1)) + 1;
        }
        return Heal;
    }
}
