import java.io.*;
import java.util.*;
public class Program125
{
public static void main(String args[])
{
int sum=0,i,j;
Scanner scan=new Scanner(System.in);
int b1=scan.nextInt();
int a[]=new int[b1];
String s1="";
String s2="";
for(i=0;i<a.length;i++)
{
a[i]=scan.nextInt();
s1=s1+String.valueOf(a[i]);
}
int b=scan.nextInt();
int a1[]=new int[b];
for(i=0;i<a1.length;i++)
{
a1[i]=scan.nextInt();
s2=s2+String.valueOf(a1[i]);
}
for(i=0;i<a.length;i++)
{
for(j=0;j<a1.length;j++)
{
if(s1.charAt(i)==s2.charAt(j))
{
sum=sum+(s1.charAt(i)-'0');
}}}
System.out.print(sum);
}
}
