package com.secret.pojo;

public class User {
    int ID;
    String name;
    int money;

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public User() {
    }

    public User(int ID, String name, int money) {
        this.ID = ID;
        this.name = name;
        this.money = money;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
