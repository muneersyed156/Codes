import java.io.*;
import java.net.*;
import java.util.*;
public class gobacknserver{
public gobacknserver(int port) throws UnknownHostException,IOException{
ServerSocket ss=new ServerSocket(port);
System.out.println("started");
Socket s=ss.accept();
System.out.println("connected");
DataInputStream in=new DataInputStream(s.getInputStream());
DataOutputStream out=new DataOutputStream(s.getOutputStream());
Scanner sc=new Scanner(System.in);
while(true){
int m=1;
int i=Integer.parseInt(in.readUTF());
while(m!=i){
System.out.println("frame no "+m+"sent");
m++;
}
System.out.println("frame no "+i+"sent");
Random rand=new Random();
int x=rand.nextInt(m);
out.writeUTF(Integer.toString(x));
int c=m;
while((c+1)!=x){
System.out.println("frame no "+x+"sent");
x++;
}
}
}
public static void main(String args[]) throws UnknownHostException,IOException{
gobacknserver sw=new gobacknserver(5000);
}
}