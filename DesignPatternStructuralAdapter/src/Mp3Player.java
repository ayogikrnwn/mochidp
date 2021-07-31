

public class Mp3Player implements AdvancedMediaPlayer{

    @Override
    public void playMp3(String fileName) {
        System.out.println("Playing MP3 file. Name: "+ fileName);
    }
}
