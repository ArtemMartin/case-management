import java.util.HashMap;

public class Epic extends Task {
    HashMap<Integer, Task> subtask = new HashMap<>();
    int subtaskID = 1;

    public void createSubtask(Subtask sb) {
        subtask.put(subtaskID, sb);
        sb.setTaskID(subtaskID);
        subtaskID++;
    }

}