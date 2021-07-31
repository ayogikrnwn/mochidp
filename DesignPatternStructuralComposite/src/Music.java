import java.util.ArrayList;
import java.util.List;

public class Music {
    private String name;
    private String musictype;
    private int listener;
    private List<Music> information;

    // constructor
    public Music(String name,String musictype, int listen) {
        this.name = name;
        this.musictype = musictype;
        this.listener = listen;
        information = new ArrayList<Music>();
    }

    public void add(Music e) {
        information.add(e);
    }

    public void remove(Music e) {
        information.remove(e);
    }

    public List<Music> getInformation(){
        return information;
    }

    public String toString(){
        return ("MusicChannel :[ Name : " + name + ", Music Type : " + musictype + ", Pendengar :" + listener+" ]");
    }
}
