package com.provectus.session4;

import java.util.Objects;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class User {
    private String username;
    private String password;
    private String email;
    private String currency;
    //getCuurency
    //setCurrency
    private String timezone;

    private boolean Deleted;
//setDeelted;
    //isDeleted;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password is too much");
        } else {
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public boolean isDeleted() {
        return Deleted;
    }

    public void setDeleted(boolean deleted) {
        Deleted = deleted;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", currency='" + currency + '\'' +
                ", timezone='" + timezone + '\'' +
                ", Deleted=" + Deleted +
                '}';
    }
}
