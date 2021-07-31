
import java.util.ArrayList;
import java.util.List;

public class NewMusic {
    private List<Observer> observers = new ArrayList<Observer>();
    private String artistName;
    private String musicName;

    public String getArtistName() {
        return artistName;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setArtistAndMusicName(String artistName, String musicName) {
        this.artistName = artistName;
        this.musicName = musicName;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
