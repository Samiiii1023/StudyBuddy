package service;

import model.User;
import model.StudySession;
import model.Task;

public class ScoreManager {

    // Points for completing task
    public void completeTask(User user, Task task) {

        if (!task.isCompleted()) {

            task.markCompleted();

            user.addScore(10);

            System.out.println(task.getTitle() + " completed!");
            System.out.println(user.getName() + " earned 10 points.");
        }
    }

    // Points for study session
    public void completeStudySession(User user, StudySession session) {

        if (!session.isCompleted()) {

            session.completeSession();

            int points = session.getDuration() / 5;

            user.addScore(points);

            System.out.println("Study session completed.");
            System.out.println(user.getName() + " earned " + points + " points.");
        }
    }
}