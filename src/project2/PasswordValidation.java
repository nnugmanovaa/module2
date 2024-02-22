package project2;

import java.util.Arrays;
import java.util.Base64;

public class PasswordValidation {

    public static boolean checkPassword(String inputPassword, String savedPassword){
        return Base64.getEncoder().encodeToString(inputPassword.getBytes()).equals(savedPassword);
    }
}
