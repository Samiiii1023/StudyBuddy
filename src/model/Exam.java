package model;

public class Exam extends ScheduleItem {

    private String date;

    public Exam(String title, String date) {
        super(title);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String getDetails() {
        return "Exam: " + title + " on " + date;
    }
}