package ru.qatools.school.baguette.util;

import ru.qatools.school.baguette.models.Token;
import ru.qatools.school.baguette.models.User;

import javax.security.auth.login.LoginException;
import java.util.UUID;

/**
 * Created by vladzx on 25.11.14.
 */
public class Authenticator {

    public static String login(String name, String password) throws LoginException {
        User user = User.first("name = ? AND password = ?", name, password);
        if (user != null) {
            String tokenValue = UUID.randomUUID().toString();
            Token token = new Token();
            token.setValue(tokenValue);
            token.setUserId(user.getId());
            token.saveIt();
            return tokenValue;
        }
        throw new LoginException("Invalid user name or password");
    }

    public static boolean isAuthTokenValid(String tokenValue) {
        Token token = Token.first("value = ?", tokenValue);
        if (token != null) {
            User user = User.findById(token.getUserId());
            return user != null;
        }
        return false;
    }

    public static void logout(String tokenValue) {
        Token token = Token.first("value = ?", tokenValue);
        if (token != null) {
            token.delete();
        }
    }
}
