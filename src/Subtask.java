class Subtask extends Task{
    public Subtask(String name, String description, String status) {
        super(name, description, status);
    }

    @Override
    public void setTask(String name, String description) {
        this.name = name;
        this.description = description;
    }


    @Override
    public String toString() {
        return "SubTask{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
