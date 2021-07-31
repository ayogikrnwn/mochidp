public class MusicPlayerBuilder {

    public MusicProfile prepareVideoOffline(){
        MusicProfile musicprofile = new MusicProfile();
        musicprofile.addVideoPlayerElement(new MusicPop());
        musicprofile.addVideoPlayerElement(new MusicLocal());
        return musicprofile;
    }

    public MusicProfile prepareVideoLivestream(){
        MusicProfile musicprofile = new MusicProfile();
        musicprofile.addVideoPlayerElement(new MusicPremiereOne());
        musicprofile.addVideoPlayerElement(new MusicPremiereTwo());
        return musicprofile;
    }
}