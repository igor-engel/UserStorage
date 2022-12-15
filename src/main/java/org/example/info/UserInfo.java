package org.example.info;

import java.time.LocalDate;

public class UserInfo {
    private String login;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;

    public UserInfo() {
    }

    public UserInfo(String login, String firstName, String lastName, LocalDate birthDate, Gender gender) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    /*public String getLogin() {

        if (login == null) {
            throw new NullPointerException("Логин отсутствует.");
        }

        return login;
    }

    public void setLogin(String login) {
        if (this.login != null) {
            System.out.println("Логин уже существует.");
        } else {
            this.login = login;
        }
    }*/

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (this.firstName != null) {
            System.out.println("Имя уже записано.");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (this.lastName != null) {
            System.out.println("Фамилия уже записана.");
        } else {
            this.lastName = lastName;
        }
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (this.birthDate != null) {
            System.out.println("Дата рождения уже записана.");
        } else {
            this.birthDate = birthDate;
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (this.gender != null) {
            System.out.println("Пол уже записан.");
        } else {
            this.gender = gender;
        }
    }

    @Override
    public String toString() {
        return "Имя = '" + firstName + '\'' +
                ", Фамилия= '" + lastName + '\'' +
                ", Дата рождения= " + birthDate +
                ", пол= " + gender;
    }
}



