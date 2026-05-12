package service;

import model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Leaderboard {

    private ArrayList<User> users;

    public Leaderboard() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {

        if(user != null) {
            users.add(user);
        }
    }

    public void displayLeaderboard() {

        Collections.sort(users, new Comparator<User>() {

            @Override
            public int compare(User u1, User u2) {

                return u2.getScore() - u1.getScore();
            }
        });

        System.out.println("\n===== LEADERBOARD =====");

        for(int i = 0; i < users.size(); i++) {

            User user = users.get(i);

            System.out.println(
                    (i + 1) + ". "
                            + user.getName()
                            + " - "
                            + user.getScore()
                            + " points"
            );
        }
    }
}