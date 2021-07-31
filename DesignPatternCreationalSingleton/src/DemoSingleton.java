public class DemoSingleton {
    public static void main(String[] args) {
        MusicPlayer musplay = MusicPlayer.getMusicPlayer();
        MusicPlayer musplay2 = MusicPlayer.getMusicPlayer();

        musplay.playMusic("Jason Ranti - Nadanya Begini Musiknya Begitu",  ".mp3");
        musplay2.playMusic("Saykoji - Online", ".mp3");
    }
}
