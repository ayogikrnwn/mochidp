public class MusicPlayerBuilder {

    public MusicProfile prepareMusicOffline(){
        MusicProfile musicprofile = new MusicProfile();
        musicprofile.addMusicPlayerElement(new MusicPop());
        musicprofile.addMusicPlayerElement(new MusicLocal());
        return musicprofile;
    }

    public MusicProfile prepareMusicPremiere(){
        MusicProfile musicprofile = new MusicProfile();
        musicprofile.addMusicPlayerElement(new MusicPremiereOne());
        musicprofile.addMusicPlayerElement(new MusicPremiereTwo());
        return musicprofile;
    }
}