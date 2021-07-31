public abstract class MusicDecorator implements Music {
    protected Music Music;

    public MusicDecorator(Music v) {
        this.Music = v;
    }

    @Override
    public void tambah() {
        Music.tambah();
    }
}
