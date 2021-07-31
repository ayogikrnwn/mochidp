public class DemoMusic {
    public static void main(String[] args) {

        MusicPlayerBuilder musicplayerbuilder = new MusicPlayerBuilder();

        MusicProfile uploadedVideoProfile = musicplayerbuilder.prepareVideoOffline();
        System.out.println("Informasi Unggahan Musik Terbaru");
        uploadedVideoProfile.showVideoPlayerElements();
        System.out.println("Total Views: " + uploadedVideoProfile.getTotalView());

        MusicProfile liveStreamVideoProfile = musicplayerbuilder.prepareVideoLivestream();
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Lagu Baru Yang Sedang Diputar Perdana");
        liveStreamVideoProfile.showVideoPlayerElements();
        System.out.println("Total Views: " + liveStreamVideoProfile.getTotalView());
    }
}
