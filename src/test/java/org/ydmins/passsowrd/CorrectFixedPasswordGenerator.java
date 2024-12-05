package org.ydmins.passsowrd;

import org.ydmins.password.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "1dsafkjl";
    }
}
