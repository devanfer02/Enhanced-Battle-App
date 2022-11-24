import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;

public class Adder {
    //SWITCH
    //SWITCH THEME MODE
    public boolean dark = true;
    public boolean light = false;
    GridBagConstraints constr = new GridBagConstraints();

    //SOUNDS AND SONGS
    String btnSound = "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\BtnSound.wav";
    String song1 = "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song4-Alone.wav";
    String song2 = "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song2-Megalovania.wav";
    String song3 = "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song3-YoungAgain.wav";
    String song4 =  "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song5-TheSpectre.wav";
    String song5 =  "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song6-WaitingForLove.wav";
    String song6 =  "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song7-Facedown.wav";
    String song7 =  "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song8-Followyou.wav";
    String song8 =  "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song9-CreaturesOfTheNight.wav";
    String song9 =  "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song10-MoreThanYouKnow.wav";
    String song10 =  "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song11-BeautifulNow.wav";
    String song11 =  "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song12-Ibiza.wav";
    String song12 =  "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song10-MoreThanYouKnow.wav";

    String WSong = "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\Won-RUSH E.wav";

    //SETTING UP ARRAY OF SONGS
    public String[] arrSongs = {
            song1,
            song2,
            song3,
            song4,
            song5,
            song6,
            song7,
            song8,
            song9,
            song10,
            song11,
            song12
    };
    public int countArrs = 0;
    //FOR MUSIC AND SOUND PLAYER
    Clip song;
    Clip soundEffect;

    public void setSoundEffectFile(String soundFileName){
        try{
            File file = new File(soundFileName);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            soundEffect = AudioSystem.getClip();
            soundEffect.open(sound);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void playSound(){
        soundEffect.setFramePosition(0);
        soundEffect.start();
    }

    public void stopSound(){
        soundEffect.stop();
        soundEffect.close();
    }

    public void setSongFile(String songFileName){
        try{
            File file = new File(songFileName);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            song = AudioSystem.getClip();
            song.open(sound);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void playSong(){
        song.setFramePosition(0);
        song.start();
    }

    public void continueSong(){
        song.start();
    }

    public void loopSong(){
        song.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void holdSong(){
        song.stop();
    }
    public void stopSong(){
        song.stop();
        song.close();
    }



    //END FOR SONG AND SOUND

    //START ADD COMPONENT TO GRID
    public void addComponent(int x, int y, int width, JLabel text, JPanel panel){
        constr.gridx = x;
        constr.gridy = y;
        constr.gridwidth = width;
        panel.add(text, constr);
    }

    public void addComponent(int x, int y, int width, JButton button, JPanel panel){
        constr.gridx = x;
        constr.gridy = y;
        constr.gridwidth = width;
        panel.add(button, constr);
    }
    //END ADD COMPONENT TO GRID

    //REMOVE BUTTON AND PANEL
    public void removePanel(JFrame frame,JPanel panel){
        frame.remove(panel);
        frame.revalidate();
        frame.repaint();
    }

    public void removeBtn(JButton button){
        Container btn = button.getParent();
        btn.remove(button);
        btn.revalidate();
        btn.repaint();
    }
    //END REMOVE BUTTON AND PANEL


    //START SWITCH THEME MODE
    public void switchBtnColor(JButton button){
        if(dark){
            button.setBackground(Color.LIGHT_GRAY);
            button.setForeground(Color.BLACK);
        }
        if(light){
            button.setBackground(Color.DARK_GRAY);
            button.setForeground(Color.WHITE);
        }
    }
    public void switchLabelColor(JLabel label){
        if(dark){
            label.setForeground(Color.white);
        }
        if(light){
            label.setForeground(Color.black);
        }
    }
    public void switchPanelColor(JPanel panel){
        if(dark){
            panel.setBackground(Color.BLACK);
        }
        if(light){
            panel.setBackground(Color.LIGHT_GRAY);
        }
    }
    //END SWITCH THEME MODE

}
