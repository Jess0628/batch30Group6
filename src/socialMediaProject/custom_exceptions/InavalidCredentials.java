package socialMediaProject.custom_exceptions;

public class InavalidCredentials extends RuntimeException{
    public InavalidCredentials() {
        super("Invalid User name or Password");
    }
}
