import java.io.*;
import java.util.*;
public class Program4
{
public static void main(String args[])
{
char n;
Scanner scan=new Scanner(System.in);
n=scan.next().charAt(0);
if(n>=65&&n<=125)
System.out.print("alphabet");
else
System.out.print("not a alphabet");
}
}
