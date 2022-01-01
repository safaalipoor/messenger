package model;

import java.util.ArrayList;

public class User {
    private String name;
    private String lastName;
    private String userName;
    private String password;
    private int hashPassword;
    private String phoneNumber;
    static ArrayList<User> userArrayList = new ArrayList<>();



    public User(String name, String lastName, String userName, String password,int hashPassword, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.hashPassword=hashPassword;
        this.phoneNumber = phoneNumber;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public void setUserArrayList(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    public int getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(int hashPassword) {
        this.hashPassword = hashPassword;
    }
}
