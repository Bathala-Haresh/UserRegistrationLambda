/**
 * @author Bathala Haresh
 * @since 30/07/2021
 * Purpose: User Registration probelm added lambda expressions to validate regex patterns
 */
package userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    static UserRegistrationMethods obj = new UserRegistrationMethods();

    public static void main(String[] args) {
        obj.firstNameValidate();
        obj.lastNameValidate();
    
    }
}
