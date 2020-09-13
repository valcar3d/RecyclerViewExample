package com.example.recyclerviewexample.model;

public class Contact {

    private String name;
    private String onlineStatus;

    public Contact(String name, String onlineStatus) {
        this.name = name;
        this.onlineStatus = onlineStatus;
    }

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }
    //endregion

    //Override to print contents of object "Contact" Contact.toString();
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", onlineStatus='" + onlineStatus + '\'' +
                '}';
    }
}
