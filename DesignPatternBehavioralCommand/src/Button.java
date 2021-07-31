import java.util.List;
import java.util.ArrayList;

public class Button {
    private List<Command> history = new ArrayList<Command>();

    public Button() {
    }

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd);
        cmd.execute();
    }
}
