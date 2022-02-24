import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class Epic extends Task{
    HashMap<Integer, Subtask> connect;

    public Epic(String name, String description) {
        super(name, description);

    }

    @Override
    public String toString() {
        return "EpicTask{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}