import java.io.*;
import java.net.*;
import java.util.*;
public class simplestclient{
public  simplestclient(address,port) throws UnknownHostException,IOException {
Socket=new Socket(address,port);
System.out.println("connected");
Scanner sc=new Scanner(System.in);
DataOutputStream out=new DataOutputStream(s.getOutputStream());
String s1="";
while(true){
System.out.println("ENter data frame");
s1=sc.nextLine();
out.writeUTF(s1);
}
}
public static void main(String args[]) throws UnknownHostException,IOException{
simplestclient ss=new simplestclient("127.0.0.1", 5000);
}
}