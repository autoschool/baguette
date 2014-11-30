package ru.qatools.school.baguette.models;

import org.javalite.activejdbc.Model;

/**
 * Created by vladzx on 25.11.14.
 */
public class Token extends Model {

    public String getValue() {
        return getString("value");
    }

    public void setValue(String value) {
        setString("value", value);
    }

    public Long getUserId() {
        return getLong("user_id");
    }

    public void setUserId(Long userId) {
        setLong("user_id", userId);
    }

}
