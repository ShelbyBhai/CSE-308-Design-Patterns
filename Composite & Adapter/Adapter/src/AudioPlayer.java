public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
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

    @Override
    public void play(String fileName, String fileType,int size,int duration) {
        if(fileType.equalsIgnoreCase("MP3"))
        {
            System.out.println("Added MP3 File named " + fileName);
        }
        else if(fileType.equalsIgnoreCase("VLC")||fileType.equalsIgnoreCase("MP4")||fileType.equalsIgnoreCase("FLV"))
        {
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileName,fileType,size,duration);
        }
        else
            System.out.println("Invalid File Format!!");
    }
}
