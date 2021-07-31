import java.util.ArrayList;
import java.util.List;

public class MusicProfile {
    private List<MusicPlayerElement> items = new ArrayList<MusicPlayerElement>();

    public void addVideoPlayerElement(MusicPlayerElement item){
        items.add(item);
    }

    public int getTotalView(){
        int totalview = 0;

        for (MusicPlayerElement item : items) {
            totalview += item.views();
        }
        return totalview;
    }

    public void showVideoPlayerElements(){

        for (MusicPlayerElement item : items) {
            System.out.print("Judul : " + item.judul());
            System.out.print(", Tipe Unggahan : " + item.musicviewtype().musicviewtype());
            System.out.println(", Jumlah Didengarkan : " + item.views());
        }
    }
}