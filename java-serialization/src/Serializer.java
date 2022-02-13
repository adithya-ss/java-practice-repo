import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Serializer {
    public static void main(String[] args) throws IOException {
        User newUser = new User();
        newUser.userName = "Adithya";
        newUser.userId = "A001";
        newUser.passKey = "SuperCharger";
        // newUser.welcomeUser();

        FileOutputStream fOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream objOut = new ObjectOutputStream(fOut);

        objOut.writeObject(newUser);
        objOut.close();
        fOut.close();

        System.out.println("User information has been saved!");

        long serialVersionUID = ObjectStreamClass.lookup(newUser.getClass()).getSerialVersionUID();
        System.out.println("Serial Version UID: " + serialVersionUID);

    }
}
