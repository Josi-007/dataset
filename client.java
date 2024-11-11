import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.71.130", 7227);
            System.out.println("Connected to server");
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("To all the Subjects of Ymir");
            s.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
