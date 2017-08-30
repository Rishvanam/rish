import java.io.*;
import java.util.*;
public class Program31
{
public static void main(String args[])
{
int count=0;
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
String s1=s.replaceAll(" ","");
for(int i=0;i<s1.length();i++)
{
count++;
}
System.out.print(count);
}
}
