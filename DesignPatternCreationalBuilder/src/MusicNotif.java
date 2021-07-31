public abstract class MusicNotif implements MusicPlayerElement {

    @Override
    public MusicViewType musicviewtype() {
        return new UploadedMusic();
    }

    @Override
    public abstract int views();
}