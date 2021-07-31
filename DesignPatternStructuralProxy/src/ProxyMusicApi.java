
public class ProxyMusicApi implements MusicApi{

    private RealMusicApi realMusicApi;
    private String MusicName;

    public ProxyMusicApi(String MusicName){
        this.MusicName =  MusicName;
    }

    @Override
    public void getDetailMusic() {
        if(realMusicApi == null){
            realMusicApi = new RealMusicApi(MusicName);
        }else{
            System.out.println("Load Detail Music From Proxy");
        }
        realMusicApi.getDetailMusic();
    }

}
