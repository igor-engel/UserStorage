package org.example.storage;

import org.example.info.Gender;
import org.example.info.UserInfo;

import java.util.Collection;
import java.util.List;

public interface UserStorage {
    /**
     * Get user by login. Notice that anton & anToN are same logins.
     *
     * @throws RuntimeException         if user not found
     * @throws IllegalArgumentException if login is null, empty or blank.
     */
    UserInfo getUserByLogin(String login);

    /**
     * Put new user into storage.
     *
     * @param userInfo - user for store
     * @throws RuntimeException if user has wrong data, e.g. null or empty login, names, birthdate or gender.
     */
    UserInfo put(UserInfo userInfo);

    /**
     * Remove user by login.
     *
     * @param login - login
     * @throws RuntimeException         if user not found
     * @throws IllegalArgumentException if login is null, empty or blank.
     */
    UserInfo remove(String login);

    /**
     * Get all users.
     */
    Collection<UserInfo> getAllUsers();

    /**
     * Get all users by gender.
     *
     * @param gender - gender
     * @throws IllegalArgumentException if gender is null
     */
    List<UserInfo> getAllUsersByGender(Gender gender);

    /**
     * Get user age.
     *
     * @param login - login
     * @throws RuntimeException         if user not found
     * @throws IllegalArgumentException if login is null, empty or blank.
     */
    int getUserAge(String login);
}
