public class Task {
    final String statusNew = "NEW";
    final String statusProgress = "IN_PROGRESS";
    final String statusDone = "DONE";
    private String name;
    private String description;
    int taskID;
    private String status;

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", taskID=" + taskID +
                ", status='" + status + '\'' +
                '}';
    }

    public String getStatusNew() {
        return statusNew;
    }

    public String getStatusProgress() {
        return statusProgress;
    }

    public String getStatusDone() {
        return statusDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
