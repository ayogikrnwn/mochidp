
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String musicType){

        if(musicType.equalsIgnoreCase("mp3")){
            advancedMusicPlayer = new Mp3Player();

        }
    }

    @Override
    public void play(String musicType, String fileName) {

        if(musicType.equalsIgnoreCase("mp3")){
            advancedMusicPlayer.playMp3(fileName);
        }
    }
}
