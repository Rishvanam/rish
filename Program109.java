import java.io.*;
import java.util.*;
public class Program109
{
public static void main(String args[])
{
int i,count=0;
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
StringBuffer s1=new StringBuffer(s);
s1.reverse();
String s2=s1.toString();
if(s.contains(s2))
{
for(i=0;i<s2.length();i++)
{
if((s2.charAt(i)=='a')||(s2.charAt(i)=='e')||(s2.charAt(i)=='i')||(s2.charAt(i)=='o')||(s2.charAt(i)=='u'))
{
count++;
}
}
}
if(count<=2)
System.out.print("true");
else
System.out.print("false");
}
}
