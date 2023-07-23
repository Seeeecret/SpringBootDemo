package com.secret.pojo.po;

public class User {
    int ID;
    String name;
    Integer money;

    String password;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", password='" + password + '\'' +
                '}';
    }

    public User(int ID, String name, int money, String password) {
        this.ID = ID;
        this.name = name;
        this.money = money;
        this.password = password;
    }

    public User(int ID) {
        this.ID = ID;
    }

    public User(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
