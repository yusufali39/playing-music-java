import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;
public class music {
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {

        File file = new File("ek_zindagi.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        File file2 = new File("stay.wav");
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audioStream2);

        File file4 = new File("tumtumm.wav");
        AudioInputStream audioStream4 = AudioSystem.getAudioInputStream(file4);
        Clip clip4 = AudioSystem.getClip();
        clip4.open(audioStream4);

        File file6 = new File("miamorr.wav");
        AudioInputStream audioStream6 = AudioSystem.getAudioInputStream(file6);
        Clip clip6 = AudioSystem.getClip();
        clip6.open(audioStream6);

        JOptionPane.showMessageDialog(null, "WELCOME TO WARMCITY");

        String response = "";
        response = response.toUpperCase();
        while(!response.equals("Q")){
            response = JOptionPane.showInputDialog("P=Play|L=Loop|N=Next|S=Stop|R=Restart|Q=Quit >> Enter your choice: ");
            response = response.toUpperCase();

            switch(response){
                case ("P") : clip.start(); 
                break;
                case ("L") : clip.loop(clip.LOOP_CONTINUOUSLY); 
                JOptionPane.showMessageDialog(null, "Song playing in a Loop");
                break;
                case ("S") : clip.stop();
                JOptionPane.showMessageDialog(null,"Paused");
                break;

                case ("N") : clip.stop(); 
                AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(new File("stay.wav"));
                Clip clip3 = AudioSystem.getClip();clip3.open(audioStream3);
                clip3.setMicrosecondPosition(0); clip3.start(); clip = clip3;
                clip2 = clip3;
                response = JOptionPane.showInputDialog("P=Play|L=Loop|N=Next|S=Stop|R=Restart|Q=Quit >> Enter your choice: ");
                response = response.toUpperCase();
            
                clip2.stop(); 
                AudioInputStream audioStream5 = AudioSystem.getAudioInputStream(new File("tumtumm.wav"));
                Clip clip5 = AudioSystem.getClip();clip5.open(audioStream5);
                clip5.setMicrosecondPosition(0); clip5.start();
                clip2 = clip5; clip4 = clip5;
                response = JOptionPane.showInputDialog("P=Play|L=Loop|N=Next|S=Stop|R=Restart|Q=Quit >> Enter your choice: ");
                response = response.toUpperCase();

                clip4.stop(); 
                AudioInputStream audioStream7 = AudioSystem.getAudioInputStream(new File("miamorr.wav"));
                Clip clip7 = AudioSystem.getClip();clip7.open(audioStream7);
                clip7.setMicrosecondPosition(0); clip7.start(); 
                clip4 = clip7; clip6 = clip7; 
                response = JOptionPane.showInputDialog("P=Play|L=Loop|N=Next|S=Stop|R=Restart|Q=Quit >> Enter your choice: ");
                response = response.toUpperCase();
                break;

                case ("R") : clip.setMicrosecondPosition(0); 
                break;
                case ("Q") : clip.close();
                break;
                default: JOptionPane.showMessageDialog(null, "invalid Response! Try Again!!");
            }
        }
        JOptionPane.showMessageDialog(null, "byeeeeeeeee!!");
    }
}