import java.io.*;
import java.net.*;
import java.util.*;
public class simpleclient{
public simpleclient(String address,int port) throws UnknownHostException,IOException{
Socket s=new Socket(address,port);
Scanner sc=new Scanner(System.in);
DataOutputStream output=new DataOutputStream(s.getOutputStream());
DataInputStream in=new DataInputStream(s.getInputStream());
while(true){
System.out.println("Enter data to be sent");
String s1=sc.nextLine();
output.writeUTF(s1);
String ack=in.readUTF();
if(ack.equals("Noneed")){
Random rand=new Random();
int x=rand.nextInt(10000);
System.out.println("waiting time is"+x);
break;
}
}
}
public static void main(String args[]) throws UnknownHostException,IOException {
simpleclient sw=new simpleclient("127.0.0.1",5000);
}
}
