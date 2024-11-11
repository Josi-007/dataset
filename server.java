import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7227); 
            System.out.println("server started and waiting for client . . .");
            Socket s = ss.accept();
            System.out.println("client connected. . .");
            DataInputStream dis=new DataInputStream(s.getInputStream());  
            String  str=(String)dis.readUTF();  
            System.out.println("message:"+str); 
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}