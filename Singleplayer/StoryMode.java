package Singleplayer;

import Basics.BasicAdder;
import javax.swing.*;

public class StoryMode extends BasicAdder{
    //SET PLACES
    public String place = "";

    // PLAYER AND ENEMY STATS
    public int hpPlayer = 120;
    public int atkPlayer = 20;
    public int hpEnemy = 120;
    public int atkEnemy = 20;

    //LABELS AND BUTTONS
    public JPanel storyPanel = new JPanel();
    public JLabel storyWelcomeTitle = new JLabel();
    public JButton startStory = new JButton();
    public JButton backToChoice = new JButton();

    ///STORY TELLING LABELS
    public JLabel desc1 = new JLabel("",SwingConstants.CENTER);
    public JLabel desc2 = new JLabel("",SwingConstants.CENTER);
    public JLabel desc3 = new JLabel("",SwingConstants.CENTER);
    public JLabel desc4 = new JLabel("",SwingConstants.CENTER);
    public JLabel desc5 = new JLabel("",SwingConstants.CENTER);

    ///STORY BUTTONS CHOICES
    public JButton choice1 = new JButton();
    public JButton choice2 = new JButton();
    public JButton settings = new JButton("SETTINGS");


    public StoryMode(){
        storyPanel.setLayout(layout);
        setSpace(storyPanel);

        setFont(storyWelcomeTitle,50);
        setFont(desc1,22);
        setFont(desc2,22);
        setFont(desc3,22);
        setFont(desc4,22);
        setFont(desc5,22);
        setBtnColor(startStory);
        setBtnColor(backToChoice);
        setBtnColor(choice1);
        setBtnColor(choice2);
        setBtnColor(settings);

        addStartMenu();
    }



    public void wakeUp(){
        place = "wakeUp";
        storyWelcomeTitle.setText("");
        removeBtn(startStory);
        removeBtn(backToChoice);

        desc1.setText("Kamu terbangun dari tidurmu");
        desc2.setText("Kamu seketika ingat kamu ada kuliah jam 7");
        desc3.setText("Saat kamu melihat jam sekarang");
        desc4.setText("Jam sudah menunjukkan pukul 6:45");
        desc5.setText("Apa yang kamu lakukan?");

        choice1.setText("GAS KULIAH");
        choice2.setText("LANUT TURU");

        addStoryText();
    }

    public void gasKuliah(){
        place = "gasKuliah";
        desc1.setText("Kamu mengeluarkan motormu dari kos");
        desc2.setText("Kamu berpikiran untuk mengebut,");
        desc3.setText("tetapi hatimu berkata jangan");
        desc4.setText("Apa pilihanmu?");
        desc5.setText("");

        choice1.setText("GAS NGEBUT");
        choice2.setText("PELAN-PELAN");
    }

    public void lanjutTuru(){
        place = "lanjutTuru";
        removeBtn(settings);
        desc1.setText("Kamu pun langsung tidur selang beberapa menit kemudian");
        desc2.setText("Kamu berpikiran untuk mengebut, tetapi hatimu berkata jangan");
        desc3.setText("Tetapi karena kamu keseringan tidur, kamu merasa tidak enak");
        desc4.setText("OH TIDAK! JANTUNGMU BERHENTI BERDETAK!");
        desc5.setText("Yahh mati, siapa suruh turu");

        choice1.setText("NEW GAME");
        choice2.setText("BACK MENU");
    }

    public void gasNgebut(){
        place = "crash";
        desc1.setText("Kamu mengebut di sepanjang jalan suhat");
        desc2.setText("Tetapi kamu menabrak motor yang ternyata");
        desc3.setText("merupakan perampok yang kamu liat di menfess kemarin");
        desc4.setText("");
        desc5.setText("");

        choice1.setText("CONTINUE");
        choice2.setText("CONTINUE");
    }

    public void pelan(){
        place = "crash";
        desc1.setText("Kamu jalan pelan-pelan");
        desc2.setText("Sangking pelannya, kamu tertabrak oleh motor yang mengebut");
        desc3.setText("Ternyata pengendara motor itu adalah ");
        desc4.setText("perampok yang kamu liat di menfess kemarin");
        desc5.setText("");

        choice1.setText("CONTINUE");
        choice2.setText("CONTINUE");
    }

    public void fightThief(){
        desc1.setText("Kamu ingin melarikan diri");
        desc2.setText("Tetapi orang tersebut ingin menghajar kamu");
        desc3.setText("Apa yang ingin kamu lakukan?");
        desc4.setText("");
        desc5.setText("");

        choice1.setText("HAJAR");
        choice2.setText("KABUR");
    }


    ///////METHODS//////
    public void addStoryText(){
        addComponent(0,0,4,desc1,storyPanel);
        addComponent(0,1,4,desc2,storyPanel);
        addComponent(0,2,4,desc3,storyPanel);
        addComponent(0,3,4,desc4,storyPanel);
        addComponent(0,4,4,desc5,storyPanel);
        addComponent(0,5,4,choice1,storyPanel);
        addComponent(0,6,4,choice2,storyPanel);
        addComponent(0,7,4,settings,storyPanel);
    }

    public void addStartMenu(){
        addComponent(0,0,4,storyWelcomeTitle,storyPanel);
        addComponent(0,1,4,startStory,storyPanel);
        addComponent(0,2,4,backToChoice,storyPanel);
        storyWelcomeTitle.setText("BATTLE APP STORY MODE");
        startStory.setText("START STORY MODE");
        backToChoice.setText("BACK TO CHOICE");
    }

    public void removeStoryText(){
        desc1.setText("");
        desc2.setText("");
        desc3.setText("");
        desc4.setText("");
        desc5.setText("");
        removeBtn(choice1);
        removeBtn(choice2);
        removeBtn(settings);
    }
}
