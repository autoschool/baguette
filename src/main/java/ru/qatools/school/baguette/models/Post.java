package ru.qatools.school.baguette.models;

import org.javalite.activejdbc.Model;

import java.sql.Timestamp;

/**
 * Created by vladzx on 19.11.14.
 */
public class Post extends Model {

    public String getTitle() {
        return getString("title");
    }

    public void setTitle(String title) {
        setString("title", title);
    }

    public String getBody() {
        return getString("body");
    }

    public void setBody(String body) {
        setString("body", body);
    }

    public Long getAuthorId() {
        return getLong("user_id");
    }

    public void setAuthorId(Long userId) {
        setLong("user_id", userId);
    }

    public Timestamp getCreatedAt() {
        return getTimestamp("created_at");
    }
}
