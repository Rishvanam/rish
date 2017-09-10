import java.io.*;
import java.util.*;
public class Program55b
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
if(Character.isDigit(s.charAt(0)))
System.out.print("true");
else
System.out.print("false");
}
}
