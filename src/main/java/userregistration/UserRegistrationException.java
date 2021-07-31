/**
 * @author Bathala Haresh
 * @since 30/07/2021
 * Purpose: User Registration probelm added lambda expressions to validate regex patterns
 */
package userregistration;

public class UserRegistrationException extends Exception {
	static String message;
    enum ExceptionType{
        ENTERED_NULL, ENTERED_INVALID
    }
    ExceptionType type;
    public UserRegistrationException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
