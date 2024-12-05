package org.ydmins.passsowrd;

import org.ydmins.password.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "ab";
    }
}
