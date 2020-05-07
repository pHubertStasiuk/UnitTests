package it.panda.chapter3.storage;

import it.panda.chapter3.model.Role;
import it.panda.chapter3.model.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MockDB {

    private static final String SEPARATOR = ";";

    public List<User> getUsers() {
        List<User> userList = new ArrayList<>(500);
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/people.csv")))) {
            String user;
            while ((user = reader.readLine()) != null) {
                String[] details = user.split(SEPARATOR);
                userList.add(new User(
                        Long.parseLong(details[0]),
                        details[1],
                        details[2],
                        details[3],
                        Role.valueOf(details[4])));
            }
        } catch (IOException ex) {
            System.out.println("Błąd wczytywania pliku");
        }
        return userList;
    }

}
