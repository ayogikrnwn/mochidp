public class Thumbnail extends MusicDecorator {

    public Thumbnail(Music Music) {
        super(Music);
    }

    @Override
    public void tambah() {
        Music.tambah();
        setThumbnail(Music);
    }

    private void setThumbnail(Music Music) {
        System.out.println("Thumbnail : Intro.jpg");
    }
}