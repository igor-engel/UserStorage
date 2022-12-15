package org.example.storage;

import org.example.info.Gender;
import org.example.info.UserInfo;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class UserStorageImpl implements UserStorage {
    public final Map<String, UserInfo> userStorage = new HashMap();

    @Override
    public String toString() {
        return "userStorage= " + userStorage;
    }

    @Override
    public UserInfo getUserByLogin(String login) {
        UserInfo userInfo = userStorage.get(login.toLowerCase());

        if (userInfo == null) {
            System.out.println("Пользователя нет в списке.");
        }

        return userInfo;
    }

    @Override
    public UserInfo put(UserInfo userInfo) {
        String login = userInfo.getLogin();

        if (userStorage.containsKey(login)) {
            System.out.println("Данный логин существует.");
        } else {
            userStorage.put(login.toLowerCase(), userInfo);
        }

        return userInfo;
    }

    @Override
    public UserInfo remove(String login) {

        if (!userStorage.containsKey(login.toLowerCase())) {
            System.out.println("Логин не существует");
        } else {
            userStorage.remove(login.toLowerCase());
            System.out.println("Пользователь с логином " + login + " удалён.");
        }

        return null;
    }

    @Override
    public Collection<UserInfo> getAllUsers() { //DONE
        return userStorage.values();
    }

    @Override
    public List<UserInfo> getAllUsersByGender(Gender gender) {
        List<UserInfo> usersByGender = new ArrayList<>();

        for (Map.Entry<String, UserInfo> entry : userStorage.entrySet()) {
            String string = entry.getValue().toString();
            String substring = " " + gender.toString();

            if (string.contains(substring)) {
                UserInfo userInfo = entry.getValue();
                usersByGender.add(userInfo);
            }
        }
        return usersByGender;
    }

    @Override
    public int getUserAge(String login) {
        UserInfo userInfo = getUserByLogin(login);

        LocalDate birthDate = userInfo.getBirthDate();
        LocalDate today = LocalDate.now();

        if (birthDate != null) {
            return Period.between(birthDate, today).getYears();
        } else {
            return 0;
        }
    }
}
