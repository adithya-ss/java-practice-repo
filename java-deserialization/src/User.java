import java.io.Serializable;

public class User implements Serializable{
    String userName;
    String userId;
    transient String passKey;
    public void welcomeUser(){
        System.out.println("Welcome, " + userName);
    }
}
