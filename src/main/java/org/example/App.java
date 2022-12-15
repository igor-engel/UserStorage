package org.example;

import org.example.info.Gender;
import org.example.info.UserInfo;
import org.example.storage.UserStorageImpl;

import java.time.LocalDate;

public class App 
{
    public static void main(String[] args) throws IllegalAccessException {
        UserInfo user1 = new UserInfo("Login1", "Igor",
                "Engel1",
                LocalDate.of(1989, 6, 26),
                Gender.MALE);

        UserInfo user2 = new UserInfo("Login2", "Ann",
                "Engel2",
                LocalDate.of(1985, 3, 30),
                Gender.FEMALE);

        UserStorageImpl userStorage = new UserStorageImpl();

        userStorage.put(user1);
        userStorage.put(user2);

        userStorage.remove("login1");

        userStorage.put(user1);
        System.out.println(userStorage.getUserAge("login1"));

        userStorage.getUserByLogin("login3");

        System.out.println(userStorage.getAllUsers());
    }
}
