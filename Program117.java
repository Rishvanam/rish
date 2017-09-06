import java.io.*;
import java.util.*;
public class Program117
{
public static void main(String args[])
{
int i;
Scanner scan=new Scanner(System.in);
String s1=scan.nextLine();
String s5="";
StringBuffer s2=new StringBuffer(s1);
s2.reverse();
String s3=s2.toString();
String s4[]=s3.split("");
for(i=0;i<s4.length;i++)
s5=s5+String.valueOf(s4[i])+"-";
for(i=0;i<s5.length()-1;i++
{
System.out.print(s5.charAt(i));
}
}
}
