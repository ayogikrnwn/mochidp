
public class RealMusicApi implements MusicApi{

    private String MusicName;

    public RealMusicApi(String MusicName){
        this.MusicName =  MusicName;
        loadFromDataBase(MusicName);
    }

    @Override
    public void getDetailMusic() {
        System.out.println("Menampilkan detail dari Music : "+MusicName);
    }

    private void loadFromDataBase(String fileName){
        System.out.println("Loading data Music : " + fileName);
    }

}
