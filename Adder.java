import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;

public class Adder {
    public boolean dark = true;
    public boolean light = false;
    GridBagConstraints constr = new GridBagConstraints();

    //SOUNDS AND SONGS
    String btnSound = "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\BtnSound.wav";
    String song1 = "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song4-Alone.wav";
    String song2 = "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\song2-Megalovania.wav";
    String WSong = "D:\\IntelliJ\\CompleteSetBattleApp\\src\\Songs\\Won-RUSH E.wav";

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

}
