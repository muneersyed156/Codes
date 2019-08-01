import java.io.*;
import java.net.*;
import java.util.*;
public class gobacknclient{
public gobacknclient(String address,int port) throws UnknownHostException,IOException{
Socket s=new Socket(address,port);
System.out.println("connected");
DataInputStream in=new DataInputStream(s.getInputStream());
DataOutputStream out=new DataOutputStream(s.getOutputStream());
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("Enter the frame size");
String s1=sc.nextLine();
out.writeUTF(s1);
int x=Integer.parseInt(in.readUTF());
System.out.println("Unacknowledged frame no is:"+x);
}
}
public static void main(String args[])throws UnknownHostException,IOException{
gobacknclient sw=new gobacknclient("127.0.0.1",5000);
}
}