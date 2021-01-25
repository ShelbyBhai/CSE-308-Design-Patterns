import java.util.Vector;

public class PlayList {
    Vector<AudioPlayer> p = new Vector<AudioPlayer>();
    public void addItem(String name,String type,int size,int duration){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.setMusicName(name);
        audioPlayer.setMusicType(type);
        audioPlayer.setMusicSize(size);
        audioPlayer.setDuration(duration);
        p.addElement(audioPlayer);
    }

}
