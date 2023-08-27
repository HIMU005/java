import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            Socket s = new Socket("localhost", 1000);
            DataOutputStream douts = new DataOutputStream(s.getOutputStream());
            System.out.println("Write your message");
            String msg = scanner.nextLine();
//            douts.writeUTF("dffjdkffdkfdsf");
            douts.writeUTF(msg);
            douts.flush();
            douts.close();
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
