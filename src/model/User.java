package model;

import java.util.ArrayList;

public class User {

    private String name;
    private int score;

    private ArrayList<ScheduleItem> scheduleItems;
    private ArrayList<StudySession> studySessions;

    public User(String name) {
        this.name = name;
        this.score = 0;

        this.scheduleItems = new ArrayList<>();
        this.studySessions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        if(points > 0) {
            score += points;
        }
    }

    public void addScheduleItem(ScheduleItem item) {
        if(item != null) {
            scheduleItems.add(item);
        }
    }

    public ArrayList<ScheduleItem> getScheduleItems() {
        return scheduleItems;
    }

    public void addStudySession(StudySession session) {
        if(session != null) {
            studySessions.add(session);
        }
    }

    public ArrayList<StudySession> getStudySessions() {
        return studySessions;
    }
}