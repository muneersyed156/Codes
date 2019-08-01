import java.util.*;
import java.io.*;
import java.math.*;
public class Rsa{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter te primes values");
int p1=sc.nextInt();
int p2=sc.nextInt();
BigInteger p=BigInteger.valueOf(p1);
BigInteger q=BigInteger.valueOf(p2);
BigInteger n=p.multiply(q);
BigInteger z=(p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
BigInteger e=BigInteger.valueOf(2);
while(e.compareTo(BigInteger.valueOf(2))>=0){
if((z.mod(e)).compareTo(BigInteger.valueOf(0))==0){
e=e.add(BigInteger.ONE);
}
else{
break;
}
}
BigInteger d=BigInteger.ZERO;
while(d.compareTo(BigInteger.ZERO)>=0){
if(((e.multiply(d)).mod(z)).compareTo(BigInteger.ONE)==0)
{
break;
}
else{
d=d.add(BigInteger.ONE);
}
}
System.out.println("Encrypted key is"+e);
System.out.println("Decryption key is"+d);
System.out.println("enter plain text from sender:");
int pt1=sc.nextInt();
BigInteger pt=BigInteger.valueOf(pt1);
BigInteger ct=(pt.pow(e.intValue())).mod(n);
System.out.println("Cipher text from sender to receiver is:"+ct);
BigInteger pt2=(ct.pow(d.intValue())).mod(n);
System.out.println("Plain texxt on receiver side is"+pt2);
}
}