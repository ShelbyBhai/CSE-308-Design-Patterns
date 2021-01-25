public class FLVPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {

    }

    @Override
    public void playFLV(String fileName) {
        System.out.println("Added FLV File Named " + fileName);
    }
}
