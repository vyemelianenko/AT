package com.provectus.collections;

import java.util.Objects;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class User implements Comparable<User>{
    private String username;
    private String email;
    private int age;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return age == user.age && Objects.equals(username, user.username) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, age);
    }

    @Override
    public int compareTo(User o) {
        if (this.age > o.age) return 1;
        if (this.age < o.age) return -1;
        return 0;

    }
}
