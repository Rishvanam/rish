import java.io.*;
import java.util.*;
public class Program10
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
StringBuffer str= new StringBuffer(s);
 str.reverse();
 String r=str.toString();
 if(s.equals(r))
 System.out.print("palindrone");
 else
 System.out.print("not a palindrone");
 }
 }
