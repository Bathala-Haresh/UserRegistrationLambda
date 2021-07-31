/**
 * @author Bathala Haresh
 * @since 30/07/2021
 * Purpose: User Registration probelm added lambda expressions to validate regex patterns
 */
package userregistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,20}";

	/**
	 * This method is used to validate first name.
	 * @param fname takes firstname as input.
	 * @return boolean value to check whether fname is true or false.
	 */
	public boolean validateFirstName(String fname) throws UserRegistrationException{
        return patternChecker(fname, NAME_PATTERN);
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
