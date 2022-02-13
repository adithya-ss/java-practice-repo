import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = 000001;
    String userName;
    String userId;
    transient String passKey;
    public void welcomeUser(){
        System.out.println("Welcome, " + userName);
    }
}
