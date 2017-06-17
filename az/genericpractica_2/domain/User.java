package az.genericpractica_2.domain;

import az.genericpractica_2.BaseObject;

import java.io.Serializable;

/**
 * Created by Agile-PC on 6/17/2017.
 */
public class User extends BaseObject implements Serializable {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
