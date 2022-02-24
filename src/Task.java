public class Task {
    static String name;
    String description;
    String status = "NEW";


    public Task(String name, String description, String status) {
        this.name = name;
        this.description = description;
        this.status = status;

    }

    public void setTask(String name, String description) {
        this.name = name;
        this.description = description;
    }



    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

