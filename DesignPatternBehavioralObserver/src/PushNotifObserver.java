public class PushNotifObserver extends Observer {

    public PushNotifObserver(NewMusic newMusic) {
        super(newMusic);
        this.subject.attach(this);
    }


    public void update() {
        System.out.println("=== Push notification ===");
        System.out.println(subject.getArtistName() + ", baru saja merilis lagu terbaru");
        System.out.println("Berjudul "+ subject.getMusicName());
    }
}