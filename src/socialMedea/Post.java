package socialMedea;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Post {
    private Object body;
    private final String dateTime;

    public Post (Object body, DateTimeFormatter dt) {
        setBody(body);
        this.dateTime = dt.format(LocalDateTime.now());
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "body=" + body +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Post post = new Post("Some post goes here in the body object", DateTimeFormatter.ofPattern("MM/dd/yyyy, HH:mm"));
        System.out.println(post);
    }
}
