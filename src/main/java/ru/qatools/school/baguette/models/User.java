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

    public Long getId() {
        return getLong("id");
    }

}
