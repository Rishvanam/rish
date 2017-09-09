import java.io.*;
import java.util.*;
public class Program40hunt
{
public static void main(String args[])
{
int a,sum=0;
Scanner scan=new Scanner(System.in);
int s1=scan.nextInt();
String s5="";
while(s1>0)
{
a=s1%10;
sum=sum+a;
s1=s1/10;
s5=String.valueOf(sum);
}
StringBuffer s3=new StringBuffer(s5);
s3.reverse();
String s2=s3.toString();
if(s5.equals(s2))
System.out.print("palindrome");
else
System.out.print("not palindrome");
}
}
