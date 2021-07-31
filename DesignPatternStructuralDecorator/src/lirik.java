public class lirik extends MusicDecorator {

    public lirik(Music Music) {
        super(Music);
    }

    @Override
    public void tambah() {
        Music.tambah();
        setSubtitle(Music);
    }

    private void setSubtitle(Music Music) {
        System.out.println("Region : Bahasa Indonesia");
    }
}