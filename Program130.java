import java.io.*;
import java.util.*;
public class Program130
{
public static void main(String args[])
{
int i,count=0;
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
for(i=0;i<s.length();i++)
{
if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
{
count++;
}
}
if(count<=2)
System.out.print(count);
}
}
