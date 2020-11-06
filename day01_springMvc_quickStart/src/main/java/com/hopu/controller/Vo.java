package com.hopu.controller;

import java.util.List;
import java.util.Map;

public class Vo {
    private List<User> users;
    private Map<String,String> students;

    public Vo(List<User> users, Map<String, String> students) {
        this.users = users;
        this.students = students;
    }

    public Vo() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<String, String> getStudents() {
        return students;
    }

    public void setStudents(Map<String, String> students) {
        this.students = students;
    }
}
