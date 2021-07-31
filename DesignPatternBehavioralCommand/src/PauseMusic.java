public class PauseMusic implements Command {
    private Music music;

    public PauseMusic(Music mus) {
        this.music = mus;
    }

    @Override
    public void execute() {
        music.onPause();

    }
}
