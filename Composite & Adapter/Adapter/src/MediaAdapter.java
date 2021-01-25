public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    private String MusicName;
    private String MusicType;
    private int MusicSize;
    private int duration;

    public String getMusicName() {
        return MusicName;
    }

    public void setMusicName(String musicName) {
        MusicName = musicName;
    }

    public String getMusicType() {
        return MusicType;
    }

    public void setMusicType(String musicType) {
        MusicType = musicType;
    }

    public int getMusicSize() {
        return MusicSize;
    }

    public void setMusicSize(int musicSize) {
        MusicSize = musicSize;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public MediaAdapter(String audioType)
    {
        if(audioType.equalsIgnoreCase("VLC"))
        {
            advancedMediaPlayer = new VLCPlayer();
        }
        else if(audioType.equalsIgnoreCase("MP4"))
        {
            advancedMediaPlayer = new MP4Player();
        }
        else if (audioType.equalsIgnoreCase("FLV"))
        {
            advancedMediaPlayer = new FLVPlayer();
        }
    }
    @Override
    public void play(String fileName, String fileType,int size,int duration) {
        if(fileType.equalsIgnoreCase("VLC"))
        {
            advancedMediaPlayer.playVLC(fileName);
        }
        else if(fileType.equalsIgnoreCase("MP4"))
        {
            advancedMediaPlayer.playMP4(fileName);
        }
        else if (fileType.equalsIgnoreCase("FLV"))
        {
            advancedMediaPlayer.playFLV(fileName);
        }
    }
}
