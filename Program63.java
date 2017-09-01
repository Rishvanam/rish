import java.io.*;
import java.util.*;
public class Program63
{
public static void main(String args[])
{
int count=0;
Scanner scan=new Scanner(System.in);
int a[]=new int[10];
int b[]=new int[10];
String a1=new String();
String b1=new String();
for(int i=0;i<10;i++)
{
a[i]=scan.nextInt();
}
Arrays.sort(a);
}
for(int i=0;i<10;i++)
{
a1=String.valueOf(a[i])+" ";
}
String a2[]=a1.split(" ");
for(int j=0;j<10;j++)
{
b[j]=scan.nextInt();
}
Arrays.sort(b);
for(int j=0;j<10;j++)
{
b1=String.valueOf(b[j])+" ";
}
String b2[]=b1.split(" ");
for(int i=0;i<10;i++)
{
if(a2[i]=b2[j])
{
count++;
System.out.print(a[i]);
}
}
if(count==0)
{
System.out.print("-1");
}
}
}
