package app;

import model.*;
import service.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Gaurav");
        User user2 = new User("Alex");

        user1.addScore(20);
        user2.addScore(15);

        ArrayList<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);

        DataManager dataManager = new DataManager();

        // Save users
        dataManager.saveUsers(users);

        // Load users
        ArrayList<User> loadedUsers =
                dataManager.loadUsers();

        // Display loaded users
        for(User user : loadedUsers) {

            System.out.println(
                    user.getName()
                            + " : "
                            + user.getScore()
            );
        }
    }
}