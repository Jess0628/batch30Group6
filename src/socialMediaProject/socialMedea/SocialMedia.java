package socialMediaProject.socialMedea;

public interface SocialMedia {
    void connect(SocialMedia user);
    void dm(SocialMedia user, String msg);
    void post (Object post);
}
