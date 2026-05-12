package model;

public class StudySession {
    private int duration; // in minutes
    private boolean completed;

    public StudySession(int duration) {
        this.duration = duration;
        this.completed = false;
    }

    public int getDuration() {
        return duration;
    }

    public void completeSession() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }
}