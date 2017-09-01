import java.io.*;
import java.util.*;
public class Program42c
{
public static void main(String args[])
{
int count=0;
Scanner scan=new Scanner(System.in);
int s[]=new int[10];
int a[]=new int[10];
for(int i=0;i<s.length;i++)
{
s[i]=scan.nextInt();
}
for(int j=0;j<a.length;j++)
{
a[j]=s[j];
}
Arrays.sort(a);
for(int i=0;i<10;i++)
{
if(s[i]==a[i])
{
count++;
}
}
if(count==10)
{
System.out.print("sorted in order");
}
else
{
System.out.print("not sorted in order");
}
}
}
