import java.io.*;
import java.net.*;
public class simplestserver{
public  simplestserver(int port) throws UnknownHostException,IOException {
ServerSocket ss=new ServerSocket(port);
System.out.println("Started");
Socket s=ss.accept();
System.out.println("Connected");
DataInputStream input=new DataInputStream(s.getInputStream());
String s1="";
while(true){
s1=input.readUTF();
System.out.println(s1);
}
}
public static void main(String args[]) throws UnknownHostException,IOException{
simplestserver ssw=new simplestserver(5000);
}
}