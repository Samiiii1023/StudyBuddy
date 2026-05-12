package service;

import model.User;

import java.io.*;
import java.util.ArrayList;

public class DataManager {

    private static final String FILE_PATH = "data/users.txt";

    // Save users to file
    public void saveUsers(ArrayList<User> users) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(FILE_PATH));

            for(User user : users) {

                writer.write(
                        user.getName() + "," + user.getScore()
                );

                writer.newLine();
            }

            writer.close();

            System.out.println("Users saved successfully.");

        } catch(IOException e) {

            System.out.println("Error saving users.");
        }
    }

    // Load users from file
    public ArrayList<User> loadUsers() {

        ArrayList<User> users = new ArrayList<>();

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(FILE_PATH));

            String line;

            while((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                String name = parts[0];
                int score = Integer.parseInt(parts[1]);

                User user = new User(name);

                user.addScore(score);

                users.add(user);
            }

            reader.close();

            System.out.println("Users loaded successfully.");

        } catch(IOException e) {

            System.out.println("Error loading users.");
        }

        return users;
    }
}