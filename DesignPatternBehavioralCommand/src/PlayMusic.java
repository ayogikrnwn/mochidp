public class PlayMusic implements Command {
    private Music music;

    public PlayMusic(Music mus) {
        this.music = mus;
    }

    @Override
    public void execute() {
        music.onPlay();

    }
}
