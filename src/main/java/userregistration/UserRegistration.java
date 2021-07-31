/**
 * @author Bathala Haresh
 * @since 30/07/2021
 * Purpose: User Registration probelm added lambda expressions to validate
 */
package userregistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,20}";
	private static final String EMAIL_PATTERN = "^([a-zA-Z0-9]+[._+-]{1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
	private static final String MOBILE_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}";
	private static final String PASSWORD_PATTERN = "(?=.*[A-Z]+)(?=.*[0-9]+).{8,}";

	/**
	 * This method is used to validate first name.
	 * @param fname takes firstname as input.
	 * @return boolean value to check whether fname is true or false.
	 */
	public boolean validateFirstName(String fname) throws UserRegistrationException{
        return patternChecker(fname, NAME_PATTERN);
    }
	/**
	 * This method is used to validate last name.
	 * @param lname takes lastname as input.
	 * @return boolean value to check whether fname is true or false.
	 */
    public boolean validateLastName(String lName) throws UserRegistrationException{
        return patternChecker(lName, NAME_PATTERN);
    }
	/**
	 * This method is used to validate email id.
	 * @param emailId takes emailId as input.
	 * @return boolean value to check whether emailId is true or false.
	 */
    public boolean validateEmailId(String emailId) throws UserRegistrationException{
		return patternChecker(emailId, EMAIL_PATTERN);
	}
	/**
	 * This method is used to validate mobile number.
	 * @param mobilenum takes mobilenum as input.
	 * @return boolean value to check whether mobilenum is true or false.
	 */
    public boolean validateMobileNum(String mobileNum) throws UserRegistrationException{
		return patternChecker(mobileNum, MOBILE_PATTERN);
	
	}
	/**
	 * boolean method is used to validate password.
	 * @param password takes password as input.
	 * @return boolean value to check whether password is true or false.
	 */
    public boolean validatePassword(String password) throws UserRegistrationException{
		return patternChecker(password, PASSWORD_PATTERN);
	}
	/**
	 * This method patternChecker is to validate regex with each respective field.
	 * @param input takes input field and checks with field pattern.
	 * @return boolean value to check patternChecker.
	 */
    private boolean patternChecker(String input,String fieldPattern) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        try {
			boolean result = matcher.matches();
			if (!result)
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID,
						"Please give valid Entry");
			return result;
		} catch (NullPointerException exception) {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL,
					"Entry Should be not null ");
		}
    }
    
}
