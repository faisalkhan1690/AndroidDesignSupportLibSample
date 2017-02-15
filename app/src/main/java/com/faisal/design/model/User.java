package com.faisal.design.model;

/**
 * Created by Faisal on 12/8/2015.
 */
public class User {
    public final String firstName;
    public final String lastName;
    public final Boolean isActive;

    public User(String firstName, String lastName, Boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
    }
}