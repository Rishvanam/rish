import java.io.*;
import java.util.*;
public class Program14c2
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
StringBuffer s1=new StringBuffer(s);
s1.reverse();
String a="aeiouAEIOU";
for(int i=0;i<s1.length();i++)
{
for(int j=0;j<a.length();j++)
{
if(s1.charAt(i)==a.charAt(j))
s1.deleteCharAt(i);
}
}
System.out.print(s1);
}
}
