import java.io.*;
import java.util.*;
import java.net.*;
public class serverproto1{
public serverproto1(int port)throws UnknownHostException,IOException{
ServerSocket ss=new ServerSocket(port);
System.out.println("Started");
Socket s=ss.accept();
System.out.println("connected");
Scanner sc=new Scanner(System.in);
DataInputStream in=new DataInputStream(s.getInputStream());
DataOutputStream out=new DataOutputStream(s.getOutputStream());
while(true){
String s1=in.readUTF();
System.out.println("The data received is"+s1);
System.out.println("send an ack");
String ack;
ack=sc.nextLine();
out.writeUTF(ack);
}
}
public static void main(String args[]) throws UnknownHostException,IOException{
serverproto1 sw=new serverproto1(5000);
}
}