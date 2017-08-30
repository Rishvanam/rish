import java.io.*;
import java.util.*;
public class Program2a
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
StringBuffer s1=new StringBuffer(s);
s1.reverse();
String s2=s1.toString();
System.out.print(s2);
}
}
