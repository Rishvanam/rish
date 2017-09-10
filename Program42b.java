import java.io.*;
import java.util.*;
public class Program42b
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s1=scan.nextLine();
String s2=scan.nextLine();
if(s1.equals(s2))
System.out.print(s1+" "+"true");
else
System.out.print(s1+" "+"false");
}
}
