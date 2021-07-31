public abstract class PremiereMusic implements MusicPlayerElement {

    @Override
    public MusicViewType musicviewtype() {
        return new PremiereNow();
    }

    @Override
    public abstract int views();
}
