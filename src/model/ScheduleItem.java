package model;

public abstract class ScheduleItem {
    protected String title;
    protected boolean completed;

    public ScheduleItem(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public abstract String getDetails();
}