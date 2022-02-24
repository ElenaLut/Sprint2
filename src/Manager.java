import java.util.ArrayList;
import java.util.HashMap;

public class Manager {
    HashMap<Integer, Subtask> subtasks;
    HashMap<Integer, Epic> epics;
    HashMap<Integer, Task> tasks;
    int id;

    void viewAllTasks() { //метод выводит на экран все задачи. Можно ли заменить одной операцией?
        System.out.println(tasks.values());
        System.out.println(epics.values());
        System.out.println(subtasks.values());
    }

void createTask(String name,String description) { // создаем новую задачу. Далее еще 2 метода по типу задач.
    id = id+1; //id должен какждой новой задаче присваивать новый номер, не уверена что он отрабатывает корректно
    String status = "NEW";
    Task task = new Task(name, description, status);
    tasks.put(id, task);
    }

    void createSubtask(String name,String description, int id) {
        id = id+1;
        String status = "NEW";
        Subtask subtask = new Subtask(name, description, status);
        subtasks.put(id, subtask);
    }

    void createEpic(String name,String description) {
        id = id+1;
        //String status = "NEW"; //для эпика я изменила конструктор без статуса, не уверена, что он будет попадать в мапу
        Epic epic = new Epic(name, description);
        epics.put(id, epic);
    }

    void changeTask(int id, String name, String description, String status) { // метод изменения существующей задачи
        Task task = new Task(name, description, status);
        task.name = name;
        task.description = description;
        task.status = status;
        tasks.put(id, task);
    }

    void changeSubtask(int id, String name, String description, String status) {
        Subtask subtask = new Subtask(name, description, status);
        subtask.name = name;
        subtask.description = description;
        subtask.status = status;
        subtasks.put(id, subtask);
    }

    void changeEpic(int id, String name, String description) {
        Epic epic = new Epic(name, description);
        epic.name = name;
        epic.description = description; //надо придумать как добавлять статус
        epics.put(id, epic);
    }

    void cleanAllTasks() { //удаляем все задачи. НЕ знаю, можно ли заменить одной строкой
        tasks.clear();
        epics.clear();
        subtasks.clear();
    }

    void getAniTask(int id) { //выводим нужнную задачу, также интересно, можно ли заменить одной командой
        tasks.get(id);
        subtasks.get(id);
        epics.get(id);
    }


}


