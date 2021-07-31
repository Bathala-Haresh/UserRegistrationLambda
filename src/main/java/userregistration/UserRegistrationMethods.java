package userregistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface DataValidate {
    void Validator();
}
public class UserRegistrationMethods {

    public void firstNameValidate() {
        DataValidate fName = () ->
        {
            Scanner sc = new Scanner(System.in);

            String regex = "^[A-Z]{1}[a-z]{3,20}$";

            System.out.println("Enter your First name");
            String name = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given name id is valid");
            } else {
                System.out.println("Given name id is not valid");
            }
        };
        fName.Validator();
    }
}


