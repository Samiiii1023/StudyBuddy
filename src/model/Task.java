package model;

public class Task extends ScheduleItem {

    public Task(String title) {
        super(title);
    }

    @Override
    public String getDetails() {
        return "Task: " + title + " | Completed: " + completed;
    }
}