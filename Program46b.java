import java.io.*;
import java.util.*;
public class Program46b
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int a1=new int[a];
for(int i=1;i<a1.length;i++)
{
a1[i]=scan.nextInt();
}
for(int i=1;i<a1.length;i++)
{
a=a*i;
System.out.println("a*i"+=+"a");
}
}
}
