import java.io.*;
import java.util.*;
public class Program2b
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String a=scan.nextLine();
StringBuffer a1=new StringBuffer(a);
a1.reverse();
String a2=a1.toString();
System.out.print(a2);
}
}
