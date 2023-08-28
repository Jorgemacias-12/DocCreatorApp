package org.jamz.DocCreatorApp.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String FullName;
    private String Email;
    private String[] Preferences;

    public User() {
    }

    public User(String fullName, String email, String[] preferences) {
        FullName = fullName;
        Email = email;
        Preferences = preferences;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String[] getPreferences() {
        return Preferences;
    }

    public void setPreferences(String[] preferences) {
        Preferences = preferences;
    }
}

