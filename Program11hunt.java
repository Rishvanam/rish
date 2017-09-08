import java.io.*;
import java.util.*;
public class Program11hunt
{
public static void main(String args[])
{
int i;
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
String s1[]=s.split(" ");
for(i=s1.length-1;i>=0;i--)
{
System.out.print(s1[i]+" ");
}
}
}
