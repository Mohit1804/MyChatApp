package com.example.mychat.Model;

public class Users {
    private String email, name, password, id;

    public Users(String email, String name, String password, String id) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.id=id;
    }

    public Users() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
