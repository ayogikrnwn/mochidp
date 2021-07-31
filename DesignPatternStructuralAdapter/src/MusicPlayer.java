
public class MusicPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String musicType, String fileName) {

        //inbuilt support to play mp3 music files
        if(musicType.equalsIgnoreCase("mp3")){
            System.out.println("Playing MP3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(musicType.equalsIgnoreCase("mp3") || musicType.equalsIgnoreCase("mp3")){
            mediaAdapter = new MediaAdapter(musicType);
            mediaAdapter.play(musicType, fileName);
        }

        else{
            System.out.println("Invalid media. " + musicType + " format not supported");
        }
    }
}
