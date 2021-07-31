public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewMusic newMusic = new NewMusic();

        new EmailNotifObserver(newMusic);
        new PushNotifObserver(newMusic);

        System.out.println("--------------------------------------");
        System.out.println("Notifikasi Lagu Baru I");
        newMusic.setArtistAndMusicName("Hindia","Rumah ke Rumah");

        System.out.println("--------------------------------------");
        System.out.println("Notifikasi Lagu Baru II");
        newMusic.setArtistAndMusicName("Jason Ranti","Variasi Pink");
    }
}