public class MusicPlayer implements MediaPlayer {
    private static MusicPlayer musicPlayer;


    public static synchronized MusicPlayer getMusicPlayer(){
        if(musicPlayer==null){
            musicPlayer = new MusicPlayer();
        }

        return musicPlayer;
    }

    @Override
    public void playMusic(String musicName, String musicType) {
        if(musicType.equalsIgnoreCase(".mp3")){
            System.out.println("Sedang memutar : " + musicName + musicType);
        }
        else if(musicType.equalsIgnoreCase(".mp3") ||musicType.equalsIgnoreCase(".vlc")){
        }

        else{
            System.out.println("Tidak dapat memutar musik. " + musicType + " format tidak didukung");
        }
    }
}
