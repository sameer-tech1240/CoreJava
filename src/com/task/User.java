package com.task;

import java.sql.Timestamp;

public class User {
    private Integer id;
    private String name;
    private String email;
    private Timestamp time;

    public User(Integer id, String name, String email, Timestamp time) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Timestamp getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", time=" + time + "]";
    }
}
