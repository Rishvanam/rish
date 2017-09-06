import java.io.*;
import java.util.*;
public class Program108
{
public static void main(String args[])
{
int i,j,count=0,c=0;
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
for(i=0;i<s.length();i++)
{
for(j=0;j<s.length();j++)
{
if(s.charAt(i)==s.charAt(j))
{
count++;
}
}
if(count==1)
{
c++;
}
count=0;
}
System.out.print(c);
}
}
