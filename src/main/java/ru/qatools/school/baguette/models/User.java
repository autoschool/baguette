package ru.qatools.school.baguette.models;

import org.javalite.activejdbc.Model;

/**
 * Created by vladzx on 23.11.14.
 */
public class User extends Model {

    public void setName(String name) {
        setString("name", name);
    }

    public String getName() {
        return getString("name");
    }

    public void setPassword(String password) {
        setString("password", password);
    }

    public String getPassword() {
        return getString("password");
    }

    public void setFullName(String fullName) {
        setString("full_name", fullName);
    }

    public String getFullName() {
        return getString("full_name");
    }

    public void setEmail(String Email) {
        setString("email", Email);
    }

    public String getEmail() {
        return getString("email");
    }

    public void setWebsite(String website) {
        setString("website", website);
    }

    public String getWebsite() {
        return getString("website");
    }

    public Long getId() {
        return getLong("id");
    }

}
