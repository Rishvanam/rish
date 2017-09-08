import java.io.*;
import java.util.*;
public class Program3hunt
{
public static void main(String args[])
{
int i;
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
for(i=0;i<a.length;i++)
{
a[i]=scan.nextInt();
}
Arrays.sort(a);
for(i=0;i<a.length;i++)
if(a[i]==i)
System.out.print(a[i]);
}
}
