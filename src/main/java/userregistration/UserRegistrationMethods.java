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
    public void lastNameValidate()
    {
        DataValidate lName = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "^[A-Z]{1}[a-z]{3,20}$";

            System.out.println("Enter your last name");
            String name = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("Given last name id is valid");
            } else {
                System.out.println("Given last name id is not valid");
            }
        };
        lName.Validator();
    }
    public void emailValidate()
    {
        DataValidate eMail = () -> {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Email id");
            String email = sc.next();

            Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()){
            }else{
                System.out.println("Given email id is not valid");
            }
        };
        eMail.Validator();
    }
    public void mobileValidate()
    {
        DataValidate Mobile =() -> {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Mobile number");
            String mobile = sc.nextLine();

            Pattern pattern = Pattern.compile("^[0-9]{0,2}[ ][0-9]{10}");
            Matcher matcher = pattern.matcher(mobile);
            if (matcher.matches()) {
            } else {
                System.out.println("Given mobile number. is not valid");
            }
        };
        Mobile.Validator();
    }
    public void passwordValidate()
    {
        DataValidate Password = () -> {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Password");
            String password = sc.next();

            Pattern pattern = Pattern.compile("^(?=.{8,20})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
            } else {
                System.out.println("Given password is not valid");
            }
        };
        Password.Validator();
    }
}


