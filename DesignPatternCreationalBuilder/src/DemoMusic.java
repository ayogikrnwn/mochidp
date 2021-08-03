public class DemoMusic {
    public static void main(String[] args) {

        MusicPlayerBuilder musicplayerbuilder = new MusicPlayerBuilder();

        MusicProfile uploadedMusicProfile = musicplayerbuilder.prepareMusicOffline();
        System.out.println("Informasi Unggahan Musik Terbaru");
        uploadedMusicProfile.showMusicPlayerElements();
        System.out.println("Total Views: " + uploadedMusicProfile.getTotalView());

        MusicProfile liveStreamVideoProfile = musicplayerbuilder.prepareMusicPremiere();
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Lagu Baru Yang Sedang Diputar Perdana");
        liveStreamVideoProfile.showMusicPlayerElements();
        System.out.println("Total Views: " + liveStreamVideoProfile.getTotalView());
    }
}
