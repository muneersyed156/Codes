import java.io.*;
import java.util.*;
import java.net.*;
public class clientproto1{
public clientproto1(String address,int port) throws UnknownHostException,IOException{
Socket s=new Socket(address,port);
System.out.println("connected");
Scanner sc=new Scanner(System.in);
DataInputStream in=new DataInputStream(s.getInputStream());
DataOutputStream out=new DataOutputStream(s.getOutputStream());
while(true){
System.out.println("Enter data to be sent");
String s1=sc.nextLine();
out.writeUTF(s1);
String s2=in.readUTF();
if(s2.equals("Noneed")){
Random rand=new Random();
int x=rand.nextInt(10000);
System.out.println("The delay time is:"+x);
for(int i=0;i<x;i++);
}
}
}
public static void main(String args[]) throws UnknownHostException,IOException{
clientproto1 sw=new clientproto1("127.0.0.1",5000);
}
}