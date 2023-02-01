import java.util.HashMap;

public class Manager {
    int taskID = 1;
    private HashMap<Integer, Task> tasks = new HashMap<>();
    private HashMap<Integer, Epic> epics = new HashMap<>();
    private HashMap<Integer, Task> taskEpic = new HashMap<>();


    public void createTask(Task ta) {
        tasks.put(taskID, ta);
        taskEpic.put(taskID, ta);
        ta.setTaskID(taskID);
        taskID++;
    }

    public void createEpic(Epic epic) {
        taskEpic.put(taskID, epic);
        epics.put(taskID, epic);
        epic.setTaskID(taskID);
        taskID++;
    }

    public HashMap<Integer, Task> getTaskEpic() {
        return taskEpic;
    }

    public void deleteTasks() {
        taskEpic.clear();
        tasks.clear();
        epics.clear();
    }

    public Task getTaskId(int id) {
        return taskEpic.get(id);
    }

    public void updateTask(Task ta) {
        taskEpic.put(ta.getTaskID(), ta);
        if (tasks.containsKey(ta.getTaskID())) {
            tasks.put(ta.taskID, ta);
        }
        if (epics.containsKey(ta.getTaskID())) {
            epics.put(ta.taskID, (Epic) ta);
        }
    }

    public void deletTask(Task ta) {
        taskEpic.remove(ta.getTaskID());
        if (tasks.containsKey(ta.getTaskID())) {
            tasks.remove(ta.taskID);
        }
        if (epics.containsKey(ta.getTaskID())) {
            epics.remove(ta.taskID);
        }
    }

    public void deleteSubtask(Epic ep, Subtask sub) {
        ep.subtask.remove(sub.getTaskID());
    }

    public HashMap<Integer, Task> getListEpicSub(Epic epic) {
        return epic.subtask;
    }

    public void statusTask(String str, Task ta) {
        switch (str) {
            case "NEW":
                ta.setStatus(ta.getStatusNew());
                break;
            case "IN_PROGRESS":
                ta.setStatus(ta.getStatusProgress());
                break;
            case "DONE":
                ta.setStatus(ta.getStatusDone());
                break;
        }
    }

    public void statusEpic(Epic ep) {
        int p = 0;
        int d = 0;
        Task task;
        for (Integer i : ep.subtask.keySet()) {
            task = ep.subtask.get(i);
            switch (task.getStatus()) {
                case "IN_PROGRESS":
                    p++;
                    break;
                case "DONE":
                    d++;
                    break;
            }
        }
        if (d == ep.subtask.size()) {
            ep.setStatus(ep.getStatusDone());
        } else if (p == ep.subtask.size()) {
            ep.setStatus(ep.getStatusProgress());
        } else {
            ep.setStatus(ep.getStatusNew());
        }
    }


}



