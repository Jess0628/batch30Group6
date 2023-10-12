package socialMediaProject.custom_exceptions;

public class WeakPassword extends Exception{
    public WeakPassword(){
        super("You provided weak password, add some more symbols");
    }

}
