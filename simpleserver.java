import java.io.*;
import java.net.*;
import java.util.*;
public class simpleserver{
public simpleserver(int port) throws UnknownHostException,IOException{
ServerSocket ss=new ServerSocket(port);
System.out.println("started");
Socket s=ss.accept();
System.out.println("connected");
Scanner sc=new Scanner(System.in);
DataInputStream in=new DataInputStream(s.getInputStream());
DataOutputStream out=new DataOutputStream(s.getOutputStream());
while(true){
String s1=in.readUTF();
System.out.println(s1);
System.out.println("Send ack");
String ack=sc.nextLine();
out.writeUTF(ack);
}
}
public static void main(String args[]) throws UnknownHostException,IOException{
simpleserver sw=new simpleserver(5000);
}
}