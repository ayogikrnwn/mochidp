public class EmailNotifObserver extends Observer{

    public EmailNotifObserver(NewMusic newMusic) {
        super(newMusic);
        this.subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println("=== Email notification ===");
        System.out.println("Lagu Terbaru dari: "+ subject.getArtistName());
        System.out.println("Berjudul : "+ subject.getMusicName());
    }
}