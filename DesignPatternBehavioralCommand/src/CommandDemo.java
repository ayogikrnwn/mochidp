public class CommandDemo {
    public static void main(String[] args){
        Music music = new Music();
        Command clickPlayButton = new PlayMusic (music);
        Command clickPauseButton = (Command) new PauseMusic (music);

        Button btn = new Button();

        String client = "PLAY";

        if(client.equalsIgnoreCase("PLAY")){
            btn.storeAndExecute(clickPlayButton);
        }else if(client.equalsIgnoreCase("PAUSE")){
            btn.storeAndExecute(clickPauseButton);
        }
    }
}
