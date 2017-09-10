import java.io.*;
import java.util.*;
public class Program63b
{
public static void main(String args[])
{
int count=1;
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
for(i=1;i<s.length();i++)
{
if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
count++;
}
System.put.print(count);
}
}
