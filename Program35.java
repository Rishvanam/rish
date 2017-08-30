import java.io.*;
import java.util.*;
public class Program35
{
public static void main(String args[])
{
int count=0;
Scanner scan=new Scanner(System.in);
String s1=scan.nextLine();
String s="~!@#$%^&*()";
for(int i=0;i<s1.length();i++)
{
for(int j=0;j<s.length();j++)
{
if(s1.charAt(i)==s.charAt(j))
{
count++;
}
}
}
System.out.print(count);
}
}


