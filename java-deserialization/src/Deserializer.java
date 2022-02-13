import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class Deserializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        User newUser = null;
        FileInputStream fIn = new FileInputStream("F:\\Code_Base_Practise\\java-practice-repo\\UserInfo.ser");
        ObjectInputStream objIn = new ObjectInputStream(fIn);
        newUser = (User) objIn.readObject();
        objIn.close();
        fIn.close();

        System.out.println("User Name: " + newUser.userName);
        System.out.println("User ID: " + newUser.userId);
        System.out.println("User Passkey: " + newUser.passKey);

        newUser.welcomeUser();

        long serialVersionUID = ObjectStreamClass.lookup(newUser.getClass()).getSerialVersionUID();
        System.out.println("Serial Version UID: " + serialVersionUID);
    }
}
